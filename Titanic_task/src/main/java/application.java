import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class application
{
    public static void main(String[] args) throws IOException {
        File titanic_file = new File("D:\\ITI\\Java\\Tasks\\Titanic_task\\Titanic.csv");
        List<String> lines = Files.readAllLines(titanic_file.toPath());

        

    }
}
