package task3;

public class Main {
    public static void main(String[] args) {


        Pair pair1 = new Pair();
        Pair pair2 = new Pair("october", "coming");

        System.out.println("Values after constructor:");
        System.out.println("Pair 1, first: " + pair1.getFirst() + ", second: " + pair1.getSecond());
        System.out.println("Pair 2, first: " + pair2.getFirst() + ", second: " + pair2.getSecond());
    }

}
