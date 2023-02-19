class Area{
    int length;
    int breath;
    Area(int length, int breath){
        this.length=length;
        this.breath=breath;
    }
    public int  getArea(){
        int area=length*breath;
        return area;
    }
}
public class Encapsulationcode53 {
public static void main(String[] args) {
Area obj=new Area(2, 3);
System.out.println(obj.getArea());
}    
}
