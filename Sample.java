//non-par  without Super()
public class Sample {
    Sample(){
        System.out.println("Sample is parent class constructor");
    }
}
class Sample2 extends Sample{
    Sample2(){
        super();
        System.out.println("Sample2 is in sub-class constructor");
    }
}
class Main{
    public static void main(String[] args) {
        Sample2 s2=new Sample2();
    }
}
