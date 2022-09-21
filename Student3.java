//--------Constructor Overloding-----------

public class Student3 {
    String name;
    long phoneNo;
    String address;
    double marks;
    int age;
    Student3(){
        System.out.println("Student Details :");
    }
    Student3(String name){
        this.name=name;
    }
    Student3(String name, long phoneNo){
        this.name=name;
        this.phoneNo=phoneNo;
    }
    Student3(String name, long phoneNo,String address){
        this.name=name;
        this.phoneNo=phoneNo;
        this.address=address;
    }
    Student3(String name, long phoneNo,String address,double marks){
        this.name=name;
        this.phoneNo=phoneNo;
        this.address=address;
        this.marks=marks;
    }
    Student3(String name, long phoneNo,String address,double marks,int age){
        this.name=name;
        this.phoneNo=phoneNo;
        this.address=address;
        this.marks=marks;
        this.age=age;
    }
    public static void main(String[] args) {
        Student3 s1=new Student3();
        System.out.println("==========================");
        Student3 s2=new Student3("Rishi");
        System.out.println("Student Name ; "+s2.name);
        System.out.println("==========================");

        Student3 s3=new Student3("Rishi",8271402611l);
        System.out.println("Student name : "+s3.name+"\nStudent Phone no : "+s3.phoneNo);
        System.out.println("==========================");

        Student3 s4=new Student3("Rishi",8271402611l,"Bihar");
        System.out.println("Student Name : "+s4.name+"\nStudent Phone no : "+s4.phoneNo+"\nStudent Address : "+s4.address );
        System.out.println("==========================");

        Student3 s5=new Student3("Rishi",8271402611l,"Bihar",78);
        System.out.println("Student Name : "+s5.name+"\nStudent Phone no : "+s5.phoneNo+"\nStudent Address : "+s5.address+"\nStudent Marks : "+s5.marks );
        System.out.println("==========================");

        Student3 s6=new Student3("Rishi",8271402611l,"Bihar",78,23);
        System.out.println("Student Name : "+s6.name+"\nStudent Phone no : "+s6.phoneNo+"\nStudent Address : "+s6.address+"\nStudent Marks : "+s6.marks+"\nStudent Age : "+s6.age );

    }
    
}

