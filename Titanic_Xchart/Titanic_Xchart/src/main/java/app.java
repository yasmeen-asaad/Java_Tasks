
import java.io.IOException;
import java.util.List;
import org.knowm.xchart.*;
/**
 *
 * @author yasmeen
 */
public class app 
{
    public static void main(String[] args) throws IOException
    {
        String path = "titanic_csv.json";
        //Load titanic jeson data
        XChartExamples xch = new XChartExamples();
        List<TitanicPassenger> allPassengers = xch.getPassengersFromJsonFile(path);
        
        //Draw grapj for each passenger and his age
        TitanicPassenger.xch(allPassengers);     
        
        //Draw graph for each passenger and what type of class was belong to
        TitanicPassenger.xch(allPassengers);
        XChartExamples xChartExamples = new XChartExamples ();
        
    }
}
