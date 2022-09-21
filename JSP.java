public class JSP {
    String facultyName="Rishi";
    String subject="java";
    public void teaching(){
        System.out.println(facultyName+" : is teaching : "+subject);
    }
}
class Std extends JSP{
    String stdName="Prakash";
    public void learning(){
        System.out.println(stdName+" : is learning : "+subject+" : from : "+facultyName);
    }
}
class Employee extends Std{
    String employeeName="Raj";
    public void working(){
        System.out.println(employeeName+" : is developing on app related to : "+subject);
    }
}
class Main{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.teaching();
        e.learning();
        e.working();
        System.out.println("=================================");
        Std s=new Std();
        s.teaching();
        s.learning();
        //s.working();
        System.out.println("-----------------------------------");
        JSP j=new JSP();
        j.teaching();
        //j.learning();
        //j.working();
    }
}
