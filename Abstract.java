
abstract class Empolyee{
    int salary;
    String name;
    public Empolyee(int salary, String name ){
      this.salary=salary;
      this.name=name;
    }
    public int getsalary(){
      return salary;
    }
    public void setsalary(int n){
      this.salary=n;
    }
    public String getname(){
      return name;
    }
    public void setname(String n){
      this.name=n;
    }
    abstract public void greet();
  }
  class child extends Empolyee{
  public child(int salary, String name) {
      super(salary, name);
      //TODO Auto-generated constructor stub
    }
  
  public void greet(){
    System.out.println("Sorry");
  }
  }

public class Abstract {
public static void main(String[] args) {
// Abstract class asi class jin ka koi objext nhi banta q nahi banta q ka woh to ak standard hoti hain
// Abstarct clas asi class jin ka andar abstract method hon
//abstract class asi classs jin ki madad se dosri class bane gaie
      child obj=new child(200000, "Mubsahir");
      System.out.println(obj.getsalary());
      System.out.println(obj.getname());
        
}
}
