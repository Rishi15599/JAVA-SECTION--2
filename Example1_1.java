//Accessing static variables from static block ------

public class Example1_1 {
    static String s="Hello";
    static{
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
