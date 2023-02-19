// import polymorphismcode58.poly;

class polygon{
    public void render(){
        System.out.println("rending Polygon");
    }
}
class square extends polygon{
    public void render(){
        System.out.println("square polygon");
    }
}
class cirlce extends square{
    public void render(){
        System.out.println("circle Polygon");
    }

    public void setarea(int i) {
    }
}
public class polymorphismcode59 {
    public static void main(String[] args) {
    polygon obj=new polygon();
    obj.render();
    }
}
