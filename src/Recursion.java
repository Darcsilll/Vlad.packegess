public class Recursion {

    public static void main(String[] args) {
        recursionFucn(0);
    }

    public static void recursionFucn(int number) {
        System.out.println("Number: " + number);
        System.out.println("Hello, Java!");
        if (number < 100)
            recursionFucn(number + 1);


    }
}


