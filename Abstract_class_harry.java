//  abstract class parent{
//     public  parent(){
//         System.out.println("i am a base 2 conductor");
//     }
//     public void sayhello(){
//         System.out.println("Hello");
//     }
//     abstract public void greet();
//     abstract public void greet2();
// }
//  abstract class second extends parent{
//     @Override
//     public void greet(){
//         System.out.println("Hello boy");
//     }
//     @Override
//     public void greet2(){
//         System.out.println("Hello Girls");
//     }
// }
// public class Abstract_class_harry {
//     public static void main(String[] args) {
   
        
//     }
// }
interface Bycycle{
    public void speedup(int increment );
    public void BreakUp(int decrement );
}
interface MyBycycle{
    public void ruk(int increment );
    public void Chall(int decrement );
}
class MubahsirCycle implements Bycycle,MyBycycle{
    void Motor(){
        System.out.println("Pee Pee POOO");
    }
    public void speedup(int increment ){
        System.out.println(" Speed Up");
    }
    public void BreakUp(int decrement ){
        System.out.println("Break Up");
    }
    public void ruk(int increment ){
        System.out.println("Rukk Ja Yar");
    }
    public void Chall(int increment ){
        System.out.println("Chaalll Aray ");
    }

}
public class Abstract_class_harry{
    public static void main(String[] args) {
    MubahsirCycle yes=new MubahsirCycle();
    yes.BreakUp(2);   
    yes.ruk(2); 
    }
}