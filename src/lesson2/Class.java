package lesson2;

public class Class {
    public static void main(String[] args) {


        Cat cat = new Cat();
        Cat anothercat = cat;
        Cat cat3 = new Cat();
        Cat cat4 = anothercat;


        System.out.println(cat);
        System.out.println("Another cat: " + anothercat);
        System.out.println("3 cat: " + cat3);

    }
}
