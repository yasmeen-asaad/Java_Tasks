
import com.sun.xml.internal.ws.util.StringUtils;
import static java.lang.Character.isLetter;

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
    public static void main(String[] args)
    {
        //------------- print the better string depend on who has longest length ----------------------
        String name1 = "yasmeen";
        String name2 = "azazi";
        function_interface is_better = (s1, s2)-> (s1.length()) > (s2.length());
        String longer =  betterString(name1, name2, is_better);
        System.out.println(longer);
        
        //------------- print if the string contain only alphbet or not ----------------------------
        String word1 = "basma";
        String word2 = "Rosy2010";
        
        boolean r1 = has_alphbet(word1);
        System.out.println("Is " + word1 + " has only alphyet? " + r1);
        
        boolean r2 = has_alphbet(word2);
        System.out.println("Is " + word2 + " has only alphyet? " + r2);
        
    }
    public static boolean has_alphbet(String word)
    {
        boolean r = true;
        for (int i=0; i < word.length(); i++)
        {  
            if (isLetter(word.charAt(i)) == false)
            {
                r = false;
                break;  
            }
        }
        return r;
    }
    public static String betterString(String s1, String s2, function_interface is_better)
    {
        boolean result = is_better.test(s1, s2);
        
        if (result == true)
            return s1;
        else
            return s2;
    }
}

