public class Test1_1 {
    Test1_1(){
        System.out.println("Test1_1 constructor");
    }
}
class Test2 extends Test1_1{
    Test2(){
        System.out.println("Test2 constructor");
    }
}
class Test3 extends Test2{
    Test3(){
        super();
        System.out.println("Test3 constructor");
    }
}
class Main{
    public static void main(String[] args) {
        //Test1_1 t1=new Test1_1();
        Test3 t3=new Test3();
    }
}
