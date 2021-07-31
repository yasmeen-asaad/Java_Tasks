
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
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
public class common_methods 
{
    File f;
    String url;
    List<String> lines;
    
    public List<String> craet_lines(String url) throws IOException
    {
        this.f = new File(url);
        List<String> lines = Files.readAllLines(this.f.toPath());
        return lines;
    }
    public List<String> get_string_list(List<String> lines, int index)
    {
        List<String> list1 = new ArrayList<String>();
        
        for (int i=1; i<lines.size();i++)
        {
            String[] line_elements = lines.get(i).split(",");
            if (line_elements[index] != "")
            {
                System.out.println(line_elements[index]);
                list1.add(line_elements[index]);
            }
            else
                list1.add(" ");
        }
        return list1;
    }
    
    public List<Integer> get_int_list(List<String> lines, int index)
    {
        List<Integer> list1 = new ArrayList<Integer>();
        
        for (int i=1; i<lines.size();i++)
        {
            String[] line_elements = lines.get(i).split(",");
            if (line_elements[index].length()!= 0)
                list1.add(Integer.parseInt(line_elements[index]));
            else
                list1.add(0);
        }
        return list1;
        
    }   
}
