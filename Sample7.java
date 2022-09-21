// addition ,subtraction ,multiplication ,division
import java.util.Scanner;
public class Sample7 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Eter the first value :");
     int a=sc.nextInt();
     System.out.println("Enter the second value :"); 
     int b=sc.nextInt();
     int c,d,e,f;
     c=addition(a,b);
     System.out.println("Addition of two numbers is = "+c);
     d=subtraction(a,b);
     System.out.println("Subtraction of two number is = "+d);
     e=multiplication(a,b);
     System.out.println("Multiplication of two number is = "+e);
     f=division(a,b);
     System.out.println("Division of two number = "+e);
    }
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
}
