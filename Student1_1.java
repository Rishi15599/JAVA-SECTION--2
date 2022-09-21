//par ------
//constructor chaining ------
public class Student1_1 {
    int id;
    String name;
    Student1_1(int id){
        this("Aarna");
        this.id=id;
    }
    Student1_1(String name){
        this.name=name;
    }
    public void idDisplay(){
        System.out.println(id);
    }
    public void nameDisplay(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Student1_1 s1=new Student1_1(123);
        s1.idDisplay();
        s1.nameDisplay();
    }
}
