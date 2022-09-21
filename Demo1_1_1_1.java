public class Demo1_1_1_1 {
    int i=10;
    String s="java";
    public void m1(){
        System.out.println("m1 is in Demo class");
    }
}
class Test extends Demo1_1_1_1{
    double d=3.4;
    public void m2(){
        System.out.println("m2 is in Test class");
    }
}
class Sample extends Demo1_1_1_1{
    char ch='j';
    public void m3(){
        System.out.println("m3 is in Sample class");
    }
}
class MainClass{
    public static void main(String[] args) {
        Demo1_1_1_1 d=new Demo1_1_1_1();
        System.out.println(d.i);
        System.out.println(d.s);
        d.m1();
        //d.m2();
        //d.m3();
        //----------------------------------------
        Test t=new Test();
        System.out.println(t.i);
        System.out.println(t.s);
        t.m1();
        t.m2();
        System.out.println(t.d);
        //----------------------------------------
        Sample s=new Sample();
        System.out.println(s.i);
        System.out.println(s.s);
        s.m1();
        s.m3();System.out.println(s.ch);
        //System.out.println(s.d);
        //s.m2();
    }
}
