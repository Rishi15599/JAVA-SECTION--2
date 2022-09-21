public class Employee1 {
    int employeeId=321;
    String employeeName="Rishi";
    static String companyName="Google";

    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        System.out.println("1st employee details are :");
        System.out.println("Employee Id : "+e1.employeeId+"Employee Name : "+e1.employeeName+"Company Name : "+companyName);
        Employee1 e2=new Employee1();
        System.out.println("2nd employee details are :");
        e2.employeeId=323;
        e2.employeeName="Prakash";
        System.out.println("Employee Id : "+e2.employeeId+"Employee Name : "+e2.employeeName+"Company Name : "+companyName);
        Employee1 e3=new Employee1();
        e3.employeeId=325;
        e3.employeeName="Rishi Raj";
        System.out.println("3rd employee details are :");
        System.out.println("Employee Id : "+e3.employeeId+"Employee Name : "+e3.employeeName+"Company Name : "+companyName);
    
    }
}
