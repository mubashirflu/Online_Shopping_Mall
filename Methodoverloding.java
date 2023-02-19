// import java.util.Scanner;
// import java.util.AbstractMap.SimpleImmutableEntry;

// import javax.swing.text.DefaultStyledDocument.ElementSpec;

// // public class Methodoverloding {
// // static void foo(){
// //     System.out.println("Hello Bro!");
// // }
// // static void foo(int a){
// //     System.out.println("Good Morninig Bro");
// // }
// // static void foo(int a,int b){
// //     System.out.println("Hello Good ! BRO");
// // }
// //     public static void main(String[] args) {
// //     foo();
// //     foo(100);
// //     foo(10, 20);
// //  }   
// // }
// // public class Methodoverloding{
// //     static int sum(int ...arr){
// //         int Result=0;
// //         for(int a:arr){
// //             Result+=a;
// //         }
// //         return Result;
// //     }
// //     public static void main(String[] args) {
// //         System.out.println("The sum of 4 and 2 is="+sum(4,2));
// //     }
// // }
// /*public class Methodoverloding{
//     static int factorial_iterativative(int n){
//         // if(n==0 || n==1){
//         //     return 1;
//         // }else{
//         //     return n*factorial(n-1);
//         // }
//          if(n==0 || n==1){
//             return 1;
//         }else{
//             int product=1;
//             for(int i=1; i<=n; i++){
//                 product*=i;
//             }
//             return product;
//         }
//     }
//     public static void main(String[] args) {
//         int n=4;
//         System.out.println("The factorial of the Given Number is:"+factorial_iterativative(n)); 
              
//     }
// }*/
// public class Methodoverloding{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Number of term:");
//         int n=sc.nextInt();
//         int t1=0;
//         int t2=1;
//         int next_term=t1+t2;
//         // System.out.printf("The fabionaccis series is=%d ",next_term);
//         for(int i=1; i<=n; i++){
//             System.out.printf("The series is=%d\n:",next_term);
//             t1=t2;
//             t2=next_term;
//             next_term=t1+t2;
//         }
//     }
// }