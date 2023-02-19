abstract class mine{
    public mine(){
        System.out.println("Hello everyone");
    }
    public String hello(){
        System.out.println("Hello for you");
        return null;
    }
    abstract public void greet();
}
class sub extends mine{
    public void greet(){
        System.out.println("Welcome most officla person");
    }

}
abstract class sumemp2 extends mine{
    public void meth(){
        System.out.println("Hello every buddy");
    }
}
public class Abstract52 {
public static void main(String[] args) {
    sub obj=new sub();
    obj.greet();
}    
}
