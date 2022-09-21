public class Laptop {
    String brand;
    String color;
    int price;
    String ram;
    String processor;
    Laptop(String b, String c, int p, String r,String pr){
        brand=b;
        color=c;
        price=p;
        ram=r;
        processor=pr;
    }
    public static void main(String[] args) {
        Laptop l1=new Laptop("MSI", "RED", 49000, "8GB", "Intel");
        System.out.println("Brand ; "+l1.brand+"\n Color : "+l1.color+"\n Price : "+l1.price+"\n Ram : "+l1.ram+"\n Processor : "+l1.processor);
        System.out.println("============================");
        Laptop l2=new Laptop("LENOVO", "BLACK", 40000, "4GB", "Intel");
        System.out.println("Brand ; "+l2.brand+"\n Color : "+l2.color+"\n Price : "+l2.price+"\n Ram : "+l2.ram+"\n Processor : "+l2.processor);
        System.out.println("============================");
        Laptop l3=new Laptop("HP", "SILVER", 60000, "12GB", "Intel");
        System.out.println("Brand ; "+l3.brand+"\n Color : "+l3.color+"\n Price : "+l3.price+"\n Ram : "+l3.ram+"\n Processor : "+l3.processor);
    }
}
