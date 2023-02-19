import javax.sql.rowset.serial.SerialArray;

class Empolyee{
    int salary=20000;
    int bonus(){
        return salary;
    }
}
class allempolyee extends Empolyee{
int inrement=5000;
}
public class inheritancecode56 {
    public static void main(String[] args) {
        allempolyee Mubahsir=new allempolyee();
        System.out.println("The Bonus is"+Mubahsir.inrement);
        //System.out.println("The salary is: "+Mubahsir.salary);
    
    }
    
}
