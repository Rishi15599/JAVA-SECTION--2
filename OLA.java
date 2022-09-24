//Single level inheritance ----


public class OLA {
    public void booking(){
        System.out.println("Travel Alone");
    }
}
class OlaShare extends OLA{
    public void share(){
        System.out.println("Travelling with stranger");
    }
}
class Main{
    public static void main(String[] args) {
        OlaShare o=new OlaShare();
        o.booking();
        o.share();
    }
}
