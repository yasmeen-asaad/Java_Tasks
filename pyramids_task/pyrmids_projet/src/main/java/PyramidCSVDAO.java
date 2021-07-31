/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasmeen
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.or;
public class PyramidCSVDAO 
{
    List<Pyramid> pyramid_list;
    
    // Method for creating pyrmid object 
    public Pyramid createpyramid(String line)
    {
        String ph, mn, s;
        double h;
        
        String[] row = line.split(","); 
        ph = row[0];
        mn = row[2];
        s = row[4];
        if (row[7].length() != 0)
            h = Double.parseDouble(row[7]);
        else
            h = 0;
        return(new Pyramid(ph, mn, s, h));
    }
    
    // Method for creating list of pyrmides 
    public List<Pyramid> readpyramidfromcsv(String url) throws FileNotFoundException
    {
        //Read pyramids.csv file
        File file = new File(url);
        
        //Read line by line using Scanner
        Scanner sc = new Scanner(file);
        
        // skip first line of csv file
        String y = sc.nextLine();
        
        //Create List of Pyramids objects for each pyramid in the csv file
        this.pyramid_list = new ArrayList<>();
        
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            Pyramid p = createpyramid(line);
            this.pyramid_list.add(p);
        }
        sc.close(); 
        return this.pyramid_list;
    }

    
    
}
