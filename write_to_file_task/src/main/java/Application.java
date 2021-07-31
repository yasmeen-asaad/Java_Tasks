
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
    {
        FileWriter fw = new FileWriter("D:\\ITI\\Java\\Tasks\\write_to_file_task\\output_file.txt");
        PrintWriter out = new PrintWriter(fw);
        
        for (int i=1; i<=10; i++)
        {
            out.println("I'm line number " + i + " ^^");
        }
        out.close();
    }
    
}
