public class College {
    static long sal=3000;
    void c(){
        System.out.println("Salary of the faculty : "+sal);
    }
}
class faculty extends College{
    String name;
    double bonus;
    String subject;
    faculty(){
        this.name=name;
        this.bonus=bonus;
    }
    //public void fac(String name,double bonus,String subject){
     //   System.out.println("Faculty Name : "+name+"\nFaculty Bonus : "+bonus+"\nFaculty Subject : "+subject);
    //}
}
class Main{
public static void main(String[] args) {
    faculty f1=new faculty("Rishi",2000);
    f1.fac("Rishi",3000,"Scince");
    f1.fac("Prakash",3500,"Scince");
    }
    
}
