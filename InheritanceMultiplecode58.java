class Animal{
    void animalof(){
        System.out.println("My Animal is Eating");
    }
}
class cat extends Animal{
    void catbarking(){
        System.out.println("My cat is Barking....");
    }
}
class parriot extends cat{
void myparriot(){
    System.out.println("My Parriot is flaying...");
}
}
public class InheritanceMultiplecode58 {
 public static void main(String[] args) {
 parriot mr=new parriot();
 mr.myparriot();
 mr.catbarking();   
 }   
}
