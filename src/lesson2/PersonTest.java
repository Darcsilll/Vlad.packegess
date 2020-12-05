package lesson2;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();

        person.setAge(15);
        person.setName("Petro");

        System.out.println("Before change: ");

        System.out.println(person.getName());
        System.out.println(person.getAge());

        Person person2 = person;

        System.out.println("After change: ");
        System.out.println();

        changePerson(person2);



    }

    public static void changePerson(Person person){

        person.setName(person.getName() + " Change");
        person.setAge(person.getAge());


    }

}
