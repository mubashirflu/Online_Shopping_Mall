class Animal{
    void eat(){
        System.out.println("Animals is Eating!..... ");
    }
}
class Dog extends Animal{
    void mydog(){
        System.out.println("My dog id barking!......");
    }
}
public class Inheritancecode57 {
    public static void main(String[] args) {
  Dog obj=new Dog();
  obj.eat();
  obj.mydog();      
    }
    
}
