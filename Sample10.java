//Write a program  to define a no argument constractor and invocked the constractor
public class Sample10 {
    Sample10()
    {
        System.out.println("No-Argument");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        Sample10 r1=new Sample10();
        System.out.println("Main Ends");
    }
}
