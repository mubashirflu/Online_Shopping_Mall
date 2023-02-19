import javax.swing.plaf.synth.SynthOptionPaneUI;

class person{
    private int age;
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
}
public class Encapsulationcode55 {
 public static void main(String[] args) {
    person obj=new person();
    obj.setage(2);
    System.out.println("The age is:"+obj.getage());
 }   
}
