//Non - Static Method

public class Sample8 {
    int i=10;
    String s="Java";
    public static void m1(){
        Sample8 s1=new Sample8(); //s1 is local variable
        System.out.println(s1.i);
        System.out.println(s1.s);
        s1.m2();
    }
    public void m2(){
        System.out.println(i);
        System.out.println(s);
    }
    public static void main(String[] args) {
        m1();
    }
}
