public class Program {
    static int[] fibonachi(int length)
    {
        int[] seq = new int[length];

        int x0 = 0;
        int x1 = 1;

        for (int i = 0; i < length; i++) {
            seq[i] = x0;

            int newX0 = x1;
            int newX1 = x0 + x1;

            x0 = newX0;
            x1 = newX1;
        }

        return seq;
    }

    public static void main(String[] args) {

        int[] seq = fibonachi(10);

        for (int num:
             seq) {
            System.out.println(num);
        }
    }
}
