public class code_49{
    public static void main(String[] args) {
        System.out.println(size2(2, 2));        
    }
    public static double size(int i, double j){
        if(i>j)
        return i;
        else
        return j;
    }
    public static double size2(double i, int j){
        if(i>j)
        return i;
        else
        return j;
    }
}