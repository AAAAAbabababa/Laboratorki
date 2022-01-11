import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            float v1 = scanner.nextFloat();
            float v2 = scanner.nextFloat();
            System.out.println(v1/v2);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
