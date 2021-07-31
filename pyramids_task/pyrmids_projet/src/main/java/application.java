
import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author Yasmeen Asaad Elazazi
 */

public class application 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String url = "D:\\ITI\\Java\\Tasks\\pyramids_task\\pyramids.csv";
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readpyramidfromcsv(url);
        
        int i = 0;
        for(Pyramid p:pyramids)
        {
            System.out.println("#" + (i++) + p);
        }
        
    }
}
