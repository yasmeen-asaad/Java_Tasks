
import java.io.File;
import java.io.IOException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasmeen
 */
public class country extends common_methods
{
    List<String> country ;
    List<String> code ;
    
    public country(String url) 
    {
        this.url = url;
    }
    public List<String> getLines() throws IOException 
    {
        this.lines = craet_lines(this.url);
        return this.lines;
    }

    public List<String> getCountry() throws IOException 
    {
        this.country = get_string_list(this.getLines(), 0);
        return this.country;
    }

    public List<String> getCode() throws IOException
    {
        this.code = get_string_list(this.getLines(), 1);
        return this.code;
    }
    
    
    
        
        
       
}
