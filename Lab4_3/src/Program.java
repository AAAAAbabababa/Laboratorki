import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

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
            FileReader fileReader1 = new FileReader("file1.txt");
            FileReader fileReader2 = new FileReader("file2.txt");
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

            String[] arr1 = new String[3];
            String[] arr2 = new String[3];

            for (int i = 0; i < 3; i++) {
                arr1[i] = Reverse(bufferedReader1.readLine());
                arr2[i] = Reverse(bufferedReader2.readLine());
            }



            FileWriter writer1 = new FileWriter("file1.txt");
            FileWriter writer2 = new FileWriter("file2.txt");

            for(String val: arr1) {
                writer1.write(val + System.lineSeparator());
            }
            writer1.close();

            for(String val: arr2) {
                writer2.write(val + System.lineSeparator());
            }
        }
        catch (Exception exception)
        {

        }


    }

    static String Reverse(String input)
    {
        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length / 2; i++)
        {
            char s = arr[i];
            arr[i] = arr[arr.length - i];
            arr[arr.length - i] = s;
        }
        return new String(arr);
    }
}
