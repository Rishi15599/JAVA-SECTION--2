// Accsessing non statice variable with the help of reference variable

public class Demo1 {
    int a=10;
    public static void main(String[] args) {
        display();
    }
    public static void display(){
        Demo1 d=new Demo1();
        System.out.println(d.a);

    }
}
