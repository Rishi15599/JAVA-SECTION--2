//Paramaterised  Super() ------------
//constructor chaining ------

public class Test1 {
    Test1(int i){
        System.out.println("Int type constructor in Test");
    }
}
class Test2 extends Test1{
    Test2(double d){
        super(200);
        System.out.println("double type constructor in Test2");
    }
}
class Main{
    public static void main(String[] args) {
        {
            Test2 t2=new Test2(2.3);
        }
    }
}
