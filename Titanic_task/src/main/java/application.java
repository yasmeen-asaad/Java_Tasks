import java.io.IOException;
import joinery.DataFrame;
import tech.tablesaw.*;
import tech.tablesaw.api.Table;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasmeen
 */
public class application 
{
    public static void main(String[] args) throws IOException
    {
         //---------------Reading Titanic Data Set Using Joinery Package ----------------
        String path = "src/main/resources/data/titanic.csv";
        DataFrame<Object> df_1 = DataFrame.readCsv(path);
        System.out.println("A summary about Titanic data using joinery package");
        System.out.println(df_1.describe());
        System.out.println("------------------------------");
        
        //---------------Reading Titanic Data Set Using Tablesaw Package ----------------
        Table df_2 = Table.read().csv(path);
        System.out.println("A summary about Titanic data using tablesaw package");
        System.out.println(df_2.summary());
  
    }
    
    
}
