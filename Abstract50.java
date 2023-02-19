
 abstract class Bike{
    abstract public void run();
}
class subBike extends Bike{
    public void run(){
        System.out.println("Safely Running");
    }
}
public class Abstract50 {
 public static void main(String[] args) {
    subBike obj=new subBike();
    obj.run();
 }   
}
