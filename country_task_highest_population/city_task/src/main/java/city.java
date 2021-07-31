
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
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
public class city extends common_methods
{
    List<Integer> city_id ;
    List<String> city ;
    List<String> country_id ;
    List<String> captial ;
    List<Integer> population ;

    public city(String u) 
    {
        this.url = u;
    }
    
    public List<String> getLines() throws IOException 
    {
        this.lines = craet_lines(this.url);
        return this.lines;
    }
    
    public List<Integer> getCity_id() throws IOException 
    {
        this.city_id = get_int_list(getLines(), 0);
        return this.city_id;
    }

    public List<String> getCity() 
    {
        this.city = get_string_list(this.lines, 1);
        return this.city;
    }

    public List<String> getCountry_id() throws IOException {
        this.country_id = get_string_list(this.getLines(), 2);
        return this.country_id;
    }

    public List<String> getCaptial() throws IOException 
    {
        this.captial = get_string_list(this.getLines(), 3);
        return this.captial;
    }

    public List<Integer> getPopulation() throws IOException 
    {
        int length = this.getLines().size()-1;
        this.population = get_int_list(this.getLines(), length);
        return this.population;
    }

}
