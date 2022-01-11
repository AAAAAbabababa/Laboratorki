import java.util.Arrays;

public class Program {
    public static void printPersons(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.print(i + 1);
            System.out.print(". ");
            persons[i].print();
        }
    }


    public static void main(String[] args){

        Person[] persons =
                {
                        new Person("1234", "Nikolai"),
                        new Person("352а", "Vasiliy"),
                        new Person("123", "Evgeniy"),
                        new Person("139", "Alexey"),
                        new Person(),
                        new Person("49072", "Alexander"),
                        new Person("6073", "Georgiy"),
                };

        Person[] clones = new Person[persons.length];

        for (int i = 0; i < persons.length; i++){
            Person clone = persons[i].clone();
            clone.setPhone(String.valueOf(i));

            clones[i] = clone;
        }

        System.out.println("Люди:");
        printPersons(persons);

        System.out.println("\n\nКлоны:");
        printPersons(clones);

        System.out.println("\n\nСортированные люди:");
        Arrays.sort(persons);
        printPersons(persons);
    }
}
