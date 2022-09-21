public class Employee1_1 {
    String name;
    int id;
    public void SwipeCard(){
        System.out.println("Swipping the card");
    }
}
class Developer extends Employee{
    Developer(String name,int id){
        this.name=name;
        //this.id=id;
    }
    public void WrittingCode(){
        System.out.println(name+" : writing code to devlop on application");
    }
}
class TeamLead extends Employee1_1{
    TeamLead(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void Managing(){
        System.out.println(name+" : managing employees");
    }
}
class MainClass{
    public static void main(String[] args) {
        Developer d=new Developer("Rishi",123);
        //d.SwipeCard();
        d.WrittingCode();
        //d.Managing();
        System.out.println("----------------");
        TeamLead t=new TeamLead("Prakah",213);
        t.SwipeCard();
        t.Managing();
        //t.WrittingCode();
    }
}
