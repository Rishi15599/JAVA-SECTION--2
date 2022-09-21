public class Company2 {
    void c(){
        System.out.println("Box details : ");
    }
    
}
class Box extends Company{
    double hight;
    double weight;
    double width;
    Box(double hight,double weight,double width){
        this.hight=hight;
        this.weight=weight;
        this.width=width;
    }
}
class Main{
    public static void main(String[] args) {
        Box b1=new Box(100.5,50.5,25.5);
        System.out.println("Box hight : "+b1.hight+"\nBox weight : "+b1.weight+"\nBox width : "+b1.width);
        Box b2=new Box(200.5,100.5,150.5);
        System.out.println("Box hight : "+b2.hight+"\nBox weight : "+b2.weight+"\nBox width : "+b2.width);

    }
}
