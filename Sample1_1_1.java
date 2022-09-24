//Single level inheritance ------

public class Sample1_1_1 {
    int i=10;
    public void m1(){
        System.out.println(i);
    }
}
class Sample2{
    String s="java";
    public void m2(){
        System.out.println(s);
    }
}
class Main{
    public static void main(String[] args) {
        Sample1_1_1 s1=new Sample1_1_1();
        System.out.println(s1.i);
        s1.m1();
        System.out.println("==========================");
        Sample2 s2=new Sample2();
        System.out.println(s2.s);
        s2.m2();
    }
}
