package lesson2;

public class CompareTest {
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 0;

        if (number1 == number2) {
            System.out.println("equal");
        } else {

            System.out.println("no equal");


        }

        String string1 = "one";
        String string2 = "two";

        if (string1.equals(string2)){
            System.out.println("equel");
        } else {
            System.out.println("no equel");
        }
        Person person1 = new Person();
        person1.setName("Dasha");

        Person person2 = new Person();
        person2.setName("Maxim");

        if (person1.equals(person2)){
            System.out.println("person are equel");
        } else {
            System.out.println("person are not equel");
        }


    }
}
