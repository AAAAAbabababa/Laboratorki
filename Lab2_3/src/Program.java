public class Program
{
    static void swap(int[] arr, int index1, int index2)
    {
        int buffer = arr[index1];

        arr[index1] = arr[index2];
        arr[index2] = buffer;
    }

    static void print(int number, int x1, int x2, int x3, int x4)
    {
        String sx1 = String.valueOf(x1);
        String sx2 = String.valueOf(x2);
        String sx3 = String.valueOf(x3);
        String sx4 = String.valueOf(x4);

        System.out.println(number + " = " + sx1 + sx2 + " * " + sx3 + sx4);
    }

    static void conditionalPrint(int number, int x1, int x2, int x3, int x4)
    {
        int number2 = (10 * x1 + x2) * (10 * x3 + x4);

        if (number == number2 && number >= 1000)
        {
            print(number, x1, x2, x3, x4);
        }
    }


    static void selector(int x1, int x2, int x3, int x4) {
        int[] arr = {x1, x2, x3, x4};
        int number = 1000 * x1 + 100 * x2 + 10 * x3 + x4;

        for (int i = 1; i <= 3; i++) {
            swap(arr, 1, i);

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    conditionalPrint(number, arr[0], arr[1], arr[2], arr[3]);
                    swap(arr, 2, 3);
                }

                swap(arr, 0, 1);
            }
        }
    }


    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++)
        {
            for (int j = 0; j <= 9; j++)
            {
                for (int k = 0; k <= 9; k++)
                {
                    for (int l = 0; l <= 9; l++)
                    {
                        selector(i, j, k, l);
                    }
                }
            }
        }
    }
}
