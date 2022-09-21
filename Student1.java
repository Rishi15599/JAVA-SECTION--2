public class Student1 {
    String name;
    int rollnumber;
    String gender;
    static String institutename="jspider";
    public static void Student_1(){
        Student1 s1=new Student1();
        s1.name="Rishi";
        s1.rollnumber=1234;
        s1.gender="Male";
        System.out.println("Student name :"+s1.name);
        System.out.println("Roll Number :"+s1.rollnumber);
        System.out.println("Gender :"+s1.gender);
        System.out.println("Institute NAme :"+institutename);
        System.out.println();
        Student1 s2=new Student1();
        s2.name="Rishi";
        s2.rollnumber=4321;
        s2.gender="Male";
        System.out.println("Student name :"+s2.name);
        System.out.println("Roll Number :"+s2.rollnumber);
        System.out.println("Gender :"+s2.gender);
        System.out.println("Institute NAme :"+institutename);
    }
    public static void main(String[] args) {
        Student_1();
 }
}
