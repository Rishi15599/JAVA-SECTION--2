//Hirical Inheritance

public class MobilePhone {
    void m(){
        System.out.println("Mobile Details ");
    }
    
}
class Keypad extends MobilePhone{
    String name;
    long price;
    void Keypad(String name,long price){
    this.name=name;
    this.price=price;
    System.out.println("Mobile Name : "+name);
    System.out.println("Mobile Price : "+price);
    }


}
class TouchMobile extends MobilePhone{
    String name;
    long price;
    void TouchMobile(String name,long price){
    this.name=name;
    this.price=price;
    System.out.println("Mobile Name : "+name);
    System.out.println("Mobile Price : "+price);
    }

}
class Main{
    public static void main(String[] args) {
        Keypad k=new Keypad();
        k.m();
        k.Keypad("Nokia",5000);
        System.out.println("=================");
        TouchMobile t=new TouchMobile();
        t.m();
        t.TouchMobile("HTC",10000);
    }
}
