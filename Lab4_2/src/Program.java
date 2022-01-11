import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileWriter;
import java.util.Random;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();

        Random rand = new Random();
        for (int i = 0; i < 200; i++) {
            Integer randomNum = rand.nextInt((300 - 1) + 1) + 1;
            list.add(randomNum.toString());
        }
        try
        {
            FileWriter writer = new FileWriter("output.txt");
            for(String val: list) {
                writer.write(val + System.lineSeparator());
            }
            writer.close();
            int index = rand.nextInt(200);

            FileReader fileReader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int j = 0;
            while(j != index) {
                line = bufferedReader.readLine();
                j++;
            }
            System.out.println(line);
        }
        catch (Exception exception)
        {

        }


    }
}
