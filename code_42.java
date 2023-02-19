import java.util.Scanner;

public class code_42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number if ath and Bth variable:");
        int a=sc.nextInt();
        int b=sc.nextInt();
    
        if((a==123 && b==222) || (a==123 && b==399)){
            System.out.println("True");
        }else{
            System.out.println("Fasle");
        }
    }
}
