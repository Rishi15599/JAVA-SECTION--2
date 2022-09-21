//Static Method
public class Sample9 {
    static int i=10;
    static String s="java";
    public static void m1(){
        System.out.println(i);
        System.out.println(s);
    }
    public static void m2(){
        System.out.println(i);
        System.out.println(s);
    }
    public static void main(String[] args) {
        m1();
        m2();
    }
}
