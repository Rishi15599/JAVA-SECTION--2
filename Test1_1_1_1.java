//Constructor overlodaing ---------------

public class Test1_1_1_1 {
    Test1_1_1_1(int  i){
        System.out.println("Int type constroctor");
        System.out.println(i);
    }
    Test1_1_1_1(String s){
        System.out.println("String type constroctor");
        System.out.println(s);
    }
    Test1_1_1_1(double d){
        System.out.println("Double type constroctor");
        System.out.println(d);
    }
    Test1_1_1_1( int i  ,double d){
        System.out.println("Int type double type constroctor");
        System.out.println(i+" "+d);
    }
    public static void main(String[] args) {
        Test1_1_1_1 t1=new Test1_1_1_1(123);
        System.out.println("--------------------------");
        Test1_1_1_1 t2=new Test1_1_1_1("Rishi");
        System.out.println("--------------------------");
        Test1_1_1_1 t3=new Test1_1_1_1(4.5);
        System.out.println("--------------------------");
        Test1_1_1_1 t4=new Test1_1_1_1(321,2.3);

    }
}
