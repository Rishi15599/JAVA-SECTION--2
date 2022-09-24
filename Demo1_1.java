//--parametrise this() -----
//constructor chaining -----

public class Demo1_1 {
    Demo1_1(){
        this(100);
        System.out.println("non-par constructor");
    }

Demo1_1(int i){
    this('a',3.4);
    System.out.println("int type constructor");
    System.out.println(i);
}
Demo1_1(char ch,double d){
    System.out.println("char and double type constructor");
    System.out.println(ch+" "+d);
}
public static void main(String[] args) {
    Demo1_1 d1=new Demo1_1();
}
}
