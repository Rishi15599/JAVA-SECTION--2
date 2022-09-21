public class Sample1_1 {
    Sample1_1(char ch){
        System.out.println("Sample1_1 constroctore"+ch);
    }
}
class Sample2 extends Sample1_1{
    Sample2(String s,double d){
        super('R');
        System.out.println("Sample2 Constroctore"+s+" "+d);
    }
}
class Sample3 extends Sample2{
    Sample3(int i){
        super("Rishi", 2.2);
        System.out.println("Sample3 Constroctore"+i);

    }
}
class Main{
    public static void main(String[] args) {
        Sample3 s3=new Sample3(23);
    }
}
