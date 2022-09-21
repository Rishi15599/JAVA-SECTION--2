public class Employee2 {
    int employeeId;
    String employeeName;
    static String companyName="Google";
    public static void main(String[] args) {
        Employee2 e1=new Employee2();
        System.out.println("1st Employee details are : ");
        e1.employeeId=321;
        e1.employeeName="Rishi";
        System.out.println("Employee Id : "+e1.employeeId+"Employee Name : "+e1.employeeName+"Company Name : "+companyName);

        Employee2 e2=new Employee2();
        System.out.println("2nd Employee details are : ");
        e1.employeeId=324;
        e1.employeeName="Prakash";
        System.out.println("Employee Id : "+e2.employeeId+"Employee Name : "+e2.employeeName+"Company Name : "+companyName);

    }
}
