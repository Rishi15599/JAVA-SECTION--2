public class Demo4 {
    {
        System.out.println("Non-Static block execute ");
    }
    Demo(){
        System.out.println("constructor block execute ");
    }
    static{
        System.out.println("static block execute");
    }
    public static void main(String[] args) {
        Demo4 d1=new Demo4();
    }
}
