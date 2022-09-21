public class Student {
    static String institutename="VPKBIRT Baramati";
    public static void Student1(){
        String name="Rishi";
        int rollnumber=1234;
        String gender="male";
        System.out.println("1st Student Details");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollnumber);
        System.out.println("Gender : "+gender);
    }
    public static void Student2(){
        String name="Prakash";
        int rollnumber=2345;
        String gender="male";
        System.out.println("2nd Student Details");
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollnumber);
        System.out.println("Gender : "+gender);
    }
    public static void main(String[] args) {

        Student1();
        System.out.println("Institute Name : "+institutename);
        System.out.println(" ");
        Student2();
        System.out.println("Institute Name : "+institutename);

    }
}
