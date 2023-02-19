import java.util.Scanner;
public class code_43 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number if ath and Bth variable:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();

    if((a==123 && b==456)|| (c==789 && d==101)){
        System.out.println("True");
    }else{
        System.out.println("Fasle");
    }
 }   
}
