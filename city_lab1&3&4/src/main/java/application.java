
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.IntStream;

public class application 
{
    public static void main(String[] args) throws IOException
    {
         //============================================================================================
        //======================================(LAB 1)===============================================
        //----------------------------Read city data----------------------------------------------------------
        File city_file = new File("D:\\ITI\\Java\\Tasks\\cities_lab1\\src\\main\\resources\\data\\cities.csv");
        List<String> lines_1 = Files.readAllLines(city_file.toPath());

        //----------------------------Read country data---------------------------------------------------------
        File country_file = new File("D:\\ITI\\Java\\Tasks\\cities_lab1\\src\\main\\resources\\data\\country.csv");
        List<String> lines_2 = Files.readAllLines(country_file.toPath());

        //--------------Creat code_set to hold unique country codes from country data-----------------------------
        Set<String> code_set = new HashSet<String>();

        for (int i=0; i<lines_2.size(); i++)
        {
            String[] row = lines_2.get(i).split(",");
            int row_len = row.length;
            code_set.add(row[row_len-1]);
        }

        //-------------Creat country_cities map object to hold each country code with it's list of cities---------------
        Map<String, List<String>> country_cities = new HashMap<>();

        //-------------Creat country_pop map object to hold each country code with it's list of cities's population------
        Map<String, List<Integer>> country_pop = new HashMap<>();
        
        //-------------Create whole_pop to hold whole popuation
        List<Integer> whole_pop = new ArrayList<Integer>();
        
        //---------------------------------Fill each map with it's keys--------------------------------------------------
        for(String c : code_set)
        {
            country_cities.put(c, new ArrayList<String>());
            country_pop.put(c, new ArrayList<Integer>());
        }
        //-------------------------------Fill each map with it's values --------------------------------------
        for (int i=1; i < lines_1.size(); i++)
        {
            //--Split each line/row in city_data, split with comma
            String[] row = lines_1.get(i).split(",");

            //--Country_id is the third colimn in city data, it contain's Shortcut of Country Name
            String Country_Id = row[2];

            //-- check if the Country_id which we extracted from city data is in code_set which it's country extracted from country data
            if(code_set.contains(Country_Id))
            {
                //--Get all cities apended to country_cities vlue (list of cities)
                List<String> cities = country_cities.get(Country_Id);

                //--Get all populations appended to country_pop value (list of population)
                List<Integer> pops = country_pop.get(Country_Id);

                //--Check if there is a population value in the row, if true append it to pops, else insert zero instead
                if (row.length == 5)
                {
                    Integer p = Integer.parseInt(row[4].replace(".",""));
                    pops.add(p);
                    whole_pop.add(p);
                }
                else
                {
                    pops.add(0);
                    whole_pop.add(0);
                }
                //--Append city name to cities list
                cities.add(row[1]);

                //--Update country_cities map with the new city list
                country_cities.put(Country_Id, cities);

                //--Update country_pop map with the new population list
                country_pop.put(Country_Id, pops);
            }
        }

        System.out.println("Print each country with list of it's cities");
        System.out.println("------------------------------------------------");
        country_cities.forEach((k,v) ->
            System.out.println("Country=" + k + ", Cities=" + v));


        //-------------Mapping each population the crosponding city to it------------
        //--Creat pop_city map object to hold each population with it's city name
        Map<String, String> pop_city = new HashMap<>();

        for(int i=1; i < lines_1.size(); i++)
        {
            String[] row = lines_1.get(i).split(",");
            if (row.length == 5)
                pop_city.put(row[4].replace(".",""), row[1]);
            else
                pop_city.put(Integer.toString(0+i), row[1]);
        }

        /***
         pop_city.forEach((k,v) ->
                System.out.println("key=" + k + ", value=" + v));

        country_pop.forEach((k,v) ->
                System.out.println("key=" + k + ", value=" + v));
         **/

        System.out.println("------------------------------------------------");

        //------------------------Sorting Citied according to population------------------------------------
        //--Sort population list for each country in country_pop map obj
        for (String country: code_set)
        {
            List<Integer> sorted_list = country_pop.get(country);
            Collections.sort(sorted_list, Collections.reverseOrder());
            country_pop.put(country, sorted_list);
        }


        //--Sort cityis according to  Sorted population in country_cities
        for (String country: code_set)
        {
            List<Integer> p_list = country_pop.get(country);
            List<String> c_sorted = new ArrayList<String>();
            for(Integer p: p_list)
            {
                String city = pop_city.get(Integer.toString(p));
                c_sorted.add(city);
            }
            country_cities.put(country, c_sorted);
        }
        System.out.println("Print each country with SORTED list of it's cities ACORDING to popuation");
        System.out.println("------------------------------------------------");
        country_cities.forEach((k,v) ->
                System.out.println("Country=" + k + ", Cities=" + v));

        //---------------------Print Highest population city by continent-----------------------------
        // #1 Sort the wohle population list desc
        Collections.sort(whole_pop, Collections.reverseOrder());
        
        // #2 Get the Highest population
        Integer highest_pop = whole_pop.get(0);
       // #3 Get the Highest population city 
        String highest_pop_city = pop_city.get(Integer.toString(highest_pop));
        System.out.println("------------------------------------------------");
        System.out.println("Highest population city is " + highest_pop_city + "it's population " + highest_pop);
        
        //============================================================================================
        //======================================(LAB 3)===============================================
        //-----------------------------Highest population capital--------------------------------------
        //---Creat country_whole_pop map object to hold each country code with Whole population ---
        Map<String, Integer> country_whole_pop = new HashMap<>();
        
        int[] populations = new int[code_set.size()];
        int i = 0;
         for (String country: code_set)
        {
            // Integer p = IntStream.of(country_pop.get(country)).sum();
            Integer p = Sum(country_pop.get(country));
            country_whole_pop.put(country, p);
            populations[i] = p;
            i = i+1;
        }
        //--Highest population 
        Integer max_p = IntStream.of(populations).max().getAsInt();
        
        //--Get the country which has the highest population
        String max_country = "Noooooooooooooo";
        for (String country: code_set)
        {
            Integer cp = country_whole_pop.get(country);
            if (max_p.equals(cp))
            {
                max_country = country;
                break;
            }
        }
        
        System.out.println("------------------------------------------------");
        System.out.println("Highest population Country is " + max_country + "it's population " + max_p);
        
        //============================================================================================
        //======================================(LAB 4)===============================================
        //---------------------Mdian/ e lower quartile/upper quartile/Average------------------------
        
        OptionalDouble avg_p = IntStream.of(populations).average();
        int median_index = (populations.length + 1) / 2;
        int lower_q_index = median_index / 2;
        int upper_q_index =  median_index + lower_q_index;
        System.out.println("Median value of whole population in all counteries " + populations[median_index]);
        System.out.println("lower quartile of whole population in all counteries " + populations[lower_q_index]);
        System.out.println("upper quartile of whole population in all counteries " + populations[upper_q_index]);
        System.out.println("Average of whole population in all counteries " + avg_p);
        
        //------------------------Print Highest population city of each country-----------------------
        System.out.println("Print Highest population city of each country");
        System.out.println("------------------------------------------------");
        country_cities.forEach((k,v) ->
                System.out.println("Country=" + k + ", Cities=" + v.get(0)));
    }

    private static Integer Sum(List<Integer> g) 
    {
        Integer s = 0;
        for (int i=0; i<g.size(); i++)
            s = s + g.get(i);
        return s;
    }

}
