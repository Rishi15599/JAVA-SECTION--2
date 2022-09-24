//Example of non static block --------------------

public class Example {
    //non static block
    {
        System.out.println("Non-static block is executing");
    }
    Example(){
        System.out.println("Constructor is executing");
    }
    public static void main(String[] args) {
        System.out.println("Main method is executing");
        Example e=new Example();
    }
}
