public class polymorphismcode58 {
    public class poly{
        private static void display(int a){
            System.out.println("Argument:"+a);
        }
        private static void display(int a,int b){
            System.out.println("Argument:"+a+ "and" +"b");
        }
    }
    public static void main(String[] args) {
   poly.display(2);
   poly.display(2, 3);
 }   
}
