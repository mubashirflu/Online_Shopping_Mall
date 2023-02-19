abstract class Emp{
    Emp(){
        System.out.println("Welcome to our portal");
    }
    public void Hello(){
        System.out.println("Hello how are you");
    }
    abstract public void run();
}
class SubEmp extends Emp{
    public void run(){
        System.out.println("ok");
    }
}
public class Abstract51 {
 public static void main(String[] args) {
    SubEmp obj=new SubEmp();
    obj.run();
 }   
}
