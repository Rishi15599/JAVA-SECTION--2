//Constructor overloading -------------

public class PersonInfo {
    String firstName;
    String lastName;
    char gender;
    String DOB;
    String designation;
    PersonInfo(String lastName,String desString){
        this.lastName=lastName;
        this.designation=designation;
    }
    PersonInfo(String firstName,String lastName,String designation){
        this.firstName=firstName;
        this.lastName=lastName;
        this.designation=designation;
    }
    PersonInfo(String firstName,String lastName,char gender,String DOB,String designation){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.DOB=DOB;
        this.designation=designation;
    }
    public static void main(String[] args) {
        PersonInfo p0=new PersonInfo("Prakash","Salseman");
        System.out.println("Person Last name : "+p0.lastName+"\nPerson Designation"+p0.designation);
        System.out.println("=================================");
        PersonInfo p=new PersonInfo("Rishi","Prakash","Developer");
        System.out.println("Person first name : "+p.firstName+"\nPerson last name : "+p.lastName+"\nPerson Designation : "+p.designation);
        System.out.println("=================================");
        PersonInfo p1=new PersonInfo("Rishi","Prakash",'M',"15may2022","Testing");
        System.out.println("Person first name : "+p1.firstName+"\nPerson last name : "+p1.lastName+"\nPerson Gender : "+p1.gender+"\nPerson DOB : "+p1.DOB+"\nPerson Designation : "+p1.designation);
    }
}

