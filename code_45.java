import java.util.Scanner;

public class code_45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Ath and Bth variable:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String result=(a<b)?"A is greator":"B is grator";
        System.out.println(result);
    }}
