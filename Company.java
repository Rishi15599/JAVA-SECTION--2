//Multi level Inheritance

public class Company {
    void co(){
        System.out.println("Box details : ");
    }
    
}
class hight extends Company{
    double hight;
    public void hight(double hight){
        this.hight=hight;
        System.out.println("Box Height : "+hight);
    }
}
class weight extends hight{
    double weight;
    public void weight(double weight){
        this.weight=weight;
        System.out.println("Box Weight : "+weight);
    }
}
class width extends weight{
    double width;
    public void width(double width){
        this.width=width;
        System.out.println("Box Width : "+width);
    }
}
class Main{
    public static void main(String[] args) {
        width w=new width();
        w.hight(23.2
        w.width(5.5);
        System.out.println("================");
        width w1=new width();
        w1.hight(23.2);
        w1.weight(11.5);
        w1.width(5.5);
        
    }
}
