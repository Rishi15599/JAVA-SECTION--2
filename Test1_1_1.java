//Single level inheritance -------

public class Test1_1_1{
    int i=40;
    String s="java";
    public void display(){
        System.out.println("display is in Test class and it is super class");
    }
}
class Demo extends Test1_1_1{
    double d=4.5;
    boolean b=true;
    public void fly(){
        System.out.println("fly is in Demo class and it is sub-class");
    }
}
class Main{
    public static void main(String[] args) {
        Test1_1_1 t=new Test1_1_1();
        System.out.println("i is super class variable : "+t.i);
        System.out.println("s is super class variable : "+t.s);
        t.display();
        System.out.println("=== creating object for sub-class ===");
        Demo d=new Demo();
        System.out.println("i is super class variable : "+d.i);
        System.out.println("s is super class variable : "+d.s);
        d.display();
        //System.out.println("d is dub class variable : "d.d);
        System.out.println("b is sub class variable : "+d.b);
        d.fly();
    }
}
