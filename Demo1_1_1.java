public class Demo1_1_1 {
    static String s="java";
    public static void m1(){
        System.out.println(s);
        System.out.println("m1 method is in demo class");
    }
}
class Sample extends Demo1_1_1{
    static double d=4.5;
    public static void m2(){
        System.out.println(s);
        System.out.println(d);
        System.out.println("m2 method is in sample class");
    }
}
class Main{
    public static void main(String[] args) {
        Sample.m2();
        Sample.m1();
    }
}
