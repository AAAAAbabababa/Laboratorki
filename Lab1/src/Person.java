public class Person implements Cloneable, Comparable<Person> {
    String phone;
    String name;


    public Person() {
        phone = "";
        name = "";
    }

    public Person(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person clone() {
        return new Person(phone, name);
    }

    public boolean isPhoneCorrect() {
        if (phone.isEmpty()) {
            return false;
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public void print() {
        if (name.isEmpty()) {
            System.out.println("имя не указано");
        }
        else {
            System.out.println(name);
        }

        if (phone.isEmpty()) {
            System.out.println("телефон не указан");
        }
        else {
            System.out.println(phone);

            boolean isPhoneCorrect = isPhoneCorrect();

            if (isPhoneCorrect) {
                System.out.println("телефон корректный");
            }
            else {
                System.out.println("телефон некорректный");
            }
        }

    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
