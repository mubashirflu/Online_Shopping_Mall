import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class Bank_Managment{
    private String name,email;
    private long account;
    private int pin;
    public String getname(){
        return name;
    } 
    public void setname(String name){
        this.name=name;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){

        this.email=email;
    }
    public long getaccount(){
        return account;
    }
    public void setaccount(int account){
        this.account=account;
    }
    public int getpin(){
    return pin;
    }
    public void setpin(int pin){
        this.pin=pin;
    }
}
public class Encapsulationcode54 {
public static void main(String[] args) {
Bank_Managment obj=new Bank_Managment();
obj.setaccount(12343444);
obj.setemail("yawaseo791@gmail.com");
obj.setname("Mubashir");
obj.setpin(9990);
System.out.println("The account is:"+obj.getaccount());
System.out.println("The email is:"+obj.getemail());
System.out.println("The name is:"+obj.getname());
System.out.println("The pin is:"+obj.getpin());    
}    
}
