public class LaptopThis {
    String brand;
    String color;
    int price;
    String ram;
    String processor;
    LaptopThis(String brand, String color, int price, String ram,String processor){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.ram=ram;
        this.processor=processor;
    }
    public static void main(String[] args) {
        System.out.println("1st Laptop Detials are :");
        Laptop l1=new Laptop("MSI", "RED", 49000, "8GB", "Intel");
        System.out.println(":-Brand : "+l1.brand+"\n:-Color : "+l1.color+"\n:-Price : "+l1.price+"\n:-Ram : "+l1.ram+"\n:-Processor : "+l1.processor);
        System.out.println("============================");

        System.out.println("2nd Laptop Detials are :");
        Laptop l2=new Laptop("LENOVO", "BLACK", 40000, "4GB", "Intel");
        System.out.println(":-Brand : "+l2.brand+"\n:-Color : "+l2.color+"\n:-Price : "+l2.price+"\n:-Ram : "+l2.ram+"\n:-Processor : "+l2.processor);
        System.out.println("============================");

        System.out.println("3rd Laptop Detials are :");
        Laptop l3=new Laptop("HP", "SILVER", 60000, "12GB", "Intel");
        System.out.println(":-Brand : "+l3.brand+"\n:-Color : "+l3.color+"\n:-Price : "+l3.price+"\n:-Ram : "+l3.ram+"\n:-Processor : "+l3.processor);
    }
}
