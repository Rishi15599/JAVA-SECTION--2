public class Product {
    String ProductName="HP Laptop";
    public void product(){
        System.out.println(ProductName+" : placed the order successfully");
    }
}
class Gpay extends Product{
    public void gpayPayment(){
        System.out.println("paying by Gpay");
    }
}
class cashOnDelivery extends Product{
    public void cashOnDelivery(){
        System.out.println("paying by cash");
    }
}
class MainProduct{
    public static void main(String[] args) {
        Gpay g=new Gpay();
        g.product();
        g.gpayPayment();
        cashOnDelivery c=new cashOnDelivery();
        c.product();
        c.cashOnDelivery();
    }
}