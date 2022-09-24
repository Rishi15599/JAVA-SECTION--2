//par-This()------
//constructor chaining ------
//error 

public class Test {
    {

    }
    Test(String s){
        this('a');
        this('b');
    }
    public static void main(String[] args) {
        Test t1=new Test("java");
    }
}
