//Accessing static method from static block ------------

public class Example1 {
    static
    {
    test();
    }
    public static void test(){
        System.out.println("test method exuting");
    }
    public static void main(String[] args) {
        System.out.println("Main method executing");
    }
}
