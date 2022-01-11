import java.util.Arrays;
import java.util.Scanner;

enum Currency{
    USD,
    EUR,
    GBP,
    JPY,
    CHF,
    CNY
}

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите валюту");

        for (Currency currency:
             Currency.values())
        {
            System.out.printf("%d. %s\n", currency.ordinal(), currency.name());
        }

        int ordinal = scanner.nextInt();
        Currency currency = Currency.values()[ordinal];

        printCurrencyInfo(currency);
    }

    static void printCurrencyInfo(Currency currency)
    {
        switch (currency)
        {
            case USD:
                System.out.println("USD\nUSA\n1 USD = 1 USD\n\n");
                break;

            case EUR:
                System.out.println("EUR\nEurozone\n1 EUR = 1,19 USD\n\n");
                break;

            case GBP:
                System.out.println("GBP\nUnited Kingdom\n1 GBP = 1,33 USD\n\n");
                break;

            case JPY:
                System.out.println("JPY\nJapan\n1 JPY = 0,0096 USD\n\n");
                break;

            case CHF:
                System.out.println("CHF\nSwitzerland\n1 CHF = 1,1 USD\n\n");
                break;

            case CNY:
                System.out.println("CNY\nChina\n1 CNY = 0,15 USD\n\n");
                break;
        }
    }
}
