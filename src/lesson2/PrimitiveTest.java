package lesson2;

public class PrimitiveTest {
    public static void main(String[] args) {


        int age = 15;


        System.out.println("Age before change in method Main: " + age);

        changeAge(15);

        System.out.println("Age after change in method Main: " + age);




    }
    private static void changeAge(int age){

        System.out.println("Age before change in method changeAge: " + age);
        age += 100;
        System.out.println("Age after change in methos changeAge " + age);

    }





}
