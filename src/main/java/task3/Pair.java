package task3;

public class Pair {
    private String first;
    private String second;

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    {
            System.out.println("Initialization values:");
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            first = "one";
            second = "two";
            }

    public Pair() {
        System.out.println("Default values:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }

      public Pair(String first, String second) {
        System.out.println("Values if using constructor:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        this.first = first;
        this.second = second;
    }


}







