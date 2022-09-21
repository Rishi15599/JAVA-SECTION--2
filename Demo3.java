public class Demo3 {
    static int a=10;
    //static variable
    double d=5.8;
    //non static variable
    static d1(){
        System.out.println("static method are exeucted");
    }
    d2(){
        System.out.println("non static method are exeucted");
    }
    static{ //static block
        System.out.println(a);
        System.out.println(d1());
    }
    {       //non static block
        System.out.println(d);
        System.out.println(d2());
    }
    public static void main(String[] args) {
        Demo3 D1=new Demo3();
    }
}

