public class Flipkart {
    String productName = "LG TV 55 inch";
    double productCost = 65.56;
    public void Order(){
        System.out.println("Product Name :"+productName+"\nProduct Cost : "+productCost+"\nIs ordered sucessfully");
    }
}
class OrderStatus extends Flipkart{
    public void packing(){
        System.out.println(productName+" : Is packed sucessfully");
    }
    public void ship(){
        System.out.println(productName+" : Is packed & shipped successfully");
    }
}
class Main{
    public static void main(String[] args) {
        OrderStatus o=new OrderStatus();
        o.Order();
        System.out.println("=======================");
        o.packing();
        System.out.println("------------------------");
        o.ship();
    }
}
