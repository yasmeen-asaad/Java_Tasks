
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasmeen
 */
public class Application 
{
    public static void main(String[] args) throws IOException
    {  //Load city Data
        city city_file = new city("D:\\ITI\\Java\\Tasks\\country_task\\cities.csv");
        //List<Integer> city_id = city_file.getCity_id();
        List<String> city = city_file.getCity();
       // List<String> country_id = city_file.getCountry_id();
        //List<String> captial = city_file.getCaptial();
        //List<Integer> population = city_file.getPopulation();
        
        //Load Country Data
       // country country_file = new country("D:\\ITI\\Java\\Tasks\\country_task\\country.csv");
        //List<String> country =  country_file.getCountry();
       // List<String> code =  country_file.getCode();
        
        System.out.println(city);
        //System.out.println(city);
       // System.out.println(country_id);
       // System.out.println(captial);
        //System.out.println(population);
        
    }
}
