import java.math.MathContext;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

//Question 1
// public class online_java_pratice {
// public static void main(String[] args) {
// char ch='a';
// int ascii=ch;
// System.out.println("The value of Ascii is:"+ascii);// to be find the value of ASCII
// }
// }
// // Question 2
// public class online_java_pratice{
//     public static void main(String[] args) {
//         int dividend=25, diviser=4;
//         int quotient=dividend/diviser;
//         int remainder=dividend%diviser;
//         System.out.println("The value of the Quotient is:"+quotient);
//         System.out.println("The value of the Remainder is:"+remainder);
//     }
// }
// Question 3
// public class online_java_pratice{
//     public static void main(String[] args) {
//         System.out.println("Enter the Number of ath and bth variable");
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("After swap is:"+a);
//         System.out.println("After bth swap is:"+b);
//     }
// }
// // Question 4
// public class online_java_pratice{
//     public static void main(String[] args) {
//         System.out.println("Enter the Number");
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         if(a %2==0){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//     }
// }
// Question 5
// public class online_java_pratice{
//     public static void main(String[] args) {
//         System.out.println("Enter the Alphabet");
//         Scanner sc=new Scanner(System.in);
//         String a=sc.next();
//         if(a=="a" || a=="e" || a=="i" || a=="o"|| a=="u"){
//             System.out.println("Volwel Words");
//         }else{
//             System.out.println("Not volwel");
//         }
//     }
// }
// Question 6
// public class online_java_pratice{
//     public static void main(String[] args) {
//         System.out.println("Entet Three Numbers");
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         if(a>=b && a>=c){
//             System.out.println("A is Greater"+a);
            
//         }else if(b>=a && b>=c){
//             System.out.println("B is greater"+b);
//         }else{
//             System.out.println("C is greater"+c);
//         }
//     }
// }
// Question 7
// public class online_java_pratice{
//     public static void main(String[] args) {
//         int year=2020;
//         boolean leap=false;
//         if(year %4==0){
//             if(year %100==0){
//                 if(year %400==0){
//                     leap =true;
//                 }else{
//                     leap =false;
//                 }
//             }else{
//                 leap =true;
//             }
//         }else{
//             leap=false;
//         }if(leap){
//             System.out.println(year+"Leap year");
//         }else{
//             System.out.println(+year+"Not leap");
//         }
//     }
// }
// // Question 8
// public class online_java_pratice{
//     public static void main(String[] args) {
//         System.out.println("Enter the Number");
//         Scanner sc=new Scanner(System.in);
//         double a=sc.nextDouble();
//         if(a>0.0){
//             System.out.println("The value is positive"+a);
//         }else if(a<0.0){
//             System.out.println("The value is Negative"+a);
//         }else{
//             System.out.println("The value is:"+a);
//         }
//     }
// }
// Question 9
// public class online_java_pratice{
//     public static void main(String[] args) {
//         char c = '*';

//         if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
//             System.out.println(c + " is an alphabet.");
//         }else{
//             System.out.println(c + " is not an alphabet.");
//     }
//         }
// }

            
//Question 10
// public class online_java_pratice{
//     public static void main(String[] args) {
//         int num=100, sum=0;
//         for(int i=1; i<=num ; i++){
//             sum=sum+i;
//         }
//         System.out.println("The sum of the Natural Number is:"+sum);
//     }
// }
//Question 10
// public class online_java_pratice{
//     public static void main(String[] args) {
//         int n=3;
//         int factorial=1;
//         for(int i=1; i<=n; i++){
//             factorial*=i;
//         }
//         System.out.println("The factorial of the Given Number is:"+factorial);
//     }
// }
//Question 11
// public class online_java_pratice{
//     public static void main(String[] args) {
//         int n=2;
//         for(int i=1; i<=10; i++){
//             System.out.printf("%d X %d =%d\n",n,i,n*i);
//         }
//     }
// }

//Question 12
// public class online_java_pratice{
//     public static void main(String[] args) {
//         int n1=90, n2=100, lcm;
//         lcm=(n1>n2)?n1:n2;
//         while(true){
//             if(lcm %n1==0 && lcm %n2==0){
//                 System.out.printf("The LCM of %d and %d and %d",n1,n2,lcm);
//             break;
//             }
//             lcm++;
//         }
//     }
// }
//Question 13;
// public class online_java_pratice{
//     public static void main(String[] args) {
//         char n;
//         for(n='A'; n<='Z'; n++){
//             System.out.println(n+"");
//         }
//     }
// }
//Question 14
// public class online_java_pratice{
//     public static void main(String[] args) {
        
//     int num = 1234, reversed = 0;
    
//     System.out.println("Original Number: " + num);

//     // run loop until num becomes 0
//     while(num != 0) {
    
//       // get last digit from num
//       int digit = num % 10;
//       reversed = reversed * 10 + digit;

//       // remove the last digit from num
//       num /= 10;
//     }

//     System.out.println("Reversed Number: " + reversed);
//     }
// }
