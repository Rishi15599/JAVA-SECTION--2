public class Employee {
    int empId;
    String name;
    double salary;
    String address;
    int age;
    static String cName="Odessa";
    void Employee(int empId){
        this.empId=empId;
    }
    void Employee(String name,String address){
        //this.name=name;
        //this.address=address;
        this("Rishi","Bihar");
    }
    void Employee(int salary,int age){
        //this.salary=salary;
        //this.age=age;
    }
    public void empId(){
        System.out.println();
    }
    
    public static void main(String[] args) {
        Employee e=new Employee(50000,23);


        
    }
}
