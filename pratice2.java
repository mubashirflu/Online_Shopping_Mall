import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.Flow.Subscriber;
import java.util.function.DoubleToIntFunction;

import javax.print.FlavorException;
import javax.print.attribute.standard.MediaSize.Engineering;
import javax.swing.SortingFocusTraversalPolicy;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
import javax.swing.text.AbstractDocument.BranchElement;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

import org.w3c.dom.events.MutationEvent;

// import java.net.http.WebSocketHandshakeException;
// import java.util.Scanner;
// import java.util.function.DoubleToIntFunction;

// import javax.lang.model.element.Element;
// import javax.print.FlavorException;
// import javax.print.DocFlavor.STRING;
// import javax.swing.text.AbstractDocument.BranchElement;
// import javax.swing.text.html.HTMLDocument.BlockElement;
// import javax.xml.stream.events.EndElement;
// import javax.xml.transform.Source;

// public class pratice2{
//     public static void main(String[] args) {
    //    float [] number={2.0f,3.0f,4.0f,5.0f,6.0f};
    //    float sum=0;
    //    for(float calculate: number){
    //     sum=sum+calculate;
    //    }
    //    System.out.println(sum);
    // int [] marks={2,4,56,7,8};
    // int num=59;
    // boolean isInArray=false;
    // for(int element:marks){
    //     if(num==element){
    //         isInArray=true;
    //         break;
    //     }
    // }
    // if(isInArray){
    //     System.out.println("Yes");
    // }else{
    //     System.out.println("False");
    // }
    // int [] marks={30,50,70,80,90};
    // int sum=0;
    // for(int element: marks){
    //     sum=sum+element;
    // }
    // System.out.println("The average is:"+sum/marks.length);
    // int [][] mat1={{1,2,3},{4,5,6}};
    // int [][] mat2={{3,4,1},{3,4,3}};
    // int [][] Resultant={{0,0,0},{0,0,0}};
    // for(int i=0; i<mat1.length; i++){
    //     for(int j=0; j<mat1[i].length; j++){
    //         System.out.format("Setting is i=%d and j=%d\n",i,j);
    //         Resultant[i][j]=mat1[i][j]+mat2[i][j];
    //     }
    // }
    // for(int i=0; i<mat1.length; i++){
    //     for(int j=0; j<mat1[i].length; j++){
    //         System.out.print(Resultant[i][j]+" ");
    //         Resultant[i][j]=mat1[i][j]+mat2[i][j];
    //     }
    //     System.out.println("");
    // }
    // int [] arr={1,2,3,4,5,6,7};
    // int l=arr.length;
    // int temp;
    // int n=Math.floorDiv(l, 2);
    // for(int i=0; i<n; i++){
    //     temp=arr[i];
    //     arr[i]=arr[l-1-i];
    //     arr[l-i-1]=temp;
    // }
    // for(int element: arr){
    //     System.out.println(element);
    // }
    // int [][] mat1={{1,2,3},{5,6,7}};
    // int [][] mat2={{4,5,6},{3,6,8}};
    // int[][] result={{0,0,0},{0,0,0}};
    // for(int i=0; i<mat1.length; i++){
    //     for(int j=0; j<mat1[i].length; j++){
    //         System.out.printf("The matris is i=%d and j=%d\n",i,j);
    //         result[i][j]=mat1[i][j]+mat2[i][j];        }
    // }
    
    // for(int i=0; i<mat1.length; i++){
    //     for(int j=0; j<mat1[i].length; j++){
    //         System.out.print(result[i][j]+" ");
    //         result[i][j]=mat1[i][j]+mat2[i][j];        }
    // }
    // System.out.println("\n");
// /*int[][] mat1={{2,3,4},{2,6,4}};
// int[][] mat2={{2,2,4},{1,3,4}};
// int[][] result={{0,0,0},{0,0,0}};
// for(int i=0; i<mat1.length; i++){
//     for(int j=1; j<mat1[i].length; j++){
//         System.out.format("srtting: is i=%d and j=%d\n",i,j);
//         result[i][j]=mat1[i][j]+mat2[i][j];
//     }
// }for(int i=0; i<mat1.length; i++){
//     for(int j=1; j<mat1[i].length; j++){
//         System.out.print(result[i][j]+" ");
//         result[i][j]=mat1[i][j]+mat2[i][j];

// } 
// }
// }
// }
// /* 
// String name="Muhammad Mubashir";
// System.out.println(name.length());
// System.out.println(name.toLowerCase());
// System.out.println(name.toUpperCase());
// System.out.println(name.translateEscapes());
// System.out.println(name.substring(3));
// System.out.println(name.replace('M', 'K'));
// System.out.println(name.startsWith("M"));
// System.out.println(name.endsWith("r"));
// System.out.println(name.charAt(5));
// System.out.println(name.indexOf("M"));
// System.out.println(name.lastIndexOf("s"));
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter your Age:");
// int age=sc.nextInt();
// if(age==2  || age<=12){
//     System.out.println("Happy Birth day");
// }else{
// System.out.println("Chall Bay Chall");
// }
// int n=3;
// int i=1;
// int Factorial=1;
// while(i<=n){
//     Factorial*=i;
//     i++;
// }
// System.out.println(Factorial);
// // }
// // }
// public class pratice2{
//     public static void main(String[] args) {
//         // int [] arr={2,3,5,6,7};
//         // int num=3;
//         // boolean isInArray=false;
//         // for(int element: arr){
        //     if(num==element){
        //         isInArray=true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("Sorry");
        // }
        // int [][] mat1={{2,3,4},{2,3,4}};
        // int [][] mat2={{4,4,4},{4,7,3}};
        // int [][] Resultant={{0,0,0},{0,0,0}};
        // for(int i=0; i<mat1.length; i++){
        //     for(int j=0; j<mat1[i].length; j++){
        //         System.out.printf(" Setting is i=%d and j=%d\n",i,j);
        //         Resultant[i][j]=mat1[i][j]+mat2[i][j];
        //     }
        // }        for(int i=0; i<mat1.length; i++){
        //     for(int j=0; j<mat1[i].length; j++){
        //         System.out.print(Resultant[i][j]);
        //         Resultant[i][j]=mat1[i][j]+mat2[i][j];
        //     }
        //     System.out.println(" ");
        // int [] arr={2,3,4,5,6};
        // int l=arr.length;
        // int n=Math.floorDiv(l, 2);
        // int temp;
        // for(int i=0; i<n; i++){
        //     temp=arr[i];
        //     arr[i]=arr[l-i-1];
        //     arr[l-i-1]=temp;
        // }
        // for(int element: arr){
        //     System.out.println(element+" ");
        // }
    // int [] arr={2,3,5,6,7};
    // int max=0;
    // for(int element:arr){
    //     if(element>max){
    //         max=element;
    //     }
      
    // }
    // System.out.println(max);
    // boolean isSorted=true;
    // int [] arr={1,2,3,4,5};
    // for(int i=0; i<arr.length-1; i++){
    //     if(arr[i]>arr[i+1]){
    //         isSorted=false;
    //         break;
    //     }
    // }
    // if(isSorted){
    //     System.out.println("yes");
    // }else{
    //     System.out.println("false");
    // }
    // int [] arr={2,3,4,5,6,7};
    // int num=3;
    // boolean isInArray=false;
    // for(int element: arr){
    //     if(num==element){
    //         isInArray=true;
    //         break;
    //     }
    // }
    // if(isInArray){
    //     System.out.println("true");
    // }else{
    //     System.out.println("False");
    // }
    // int [][] mat1={{2,3,4},{3,4,5}};
    // int [][] mat2={{2,1,2},{2,5,1}};
    // int [][] result={{0,0,0},{0,0,0}};
    // for(int i=0;i<mat1.length; i++){
    //     for(int j=0; j<mat1[i].length; j++){
    //         System.out.printf("Settings is i=%d and j=%d\n",i,j);
    //         result[i][j]=mat1[i][j]+mat2[i][j];
    //     }
    // }
    // for(int i=0;i<mat1.length; i++){
    //     for(int j=0; j<mat1[i].length; j++){
    //         System.out.print(result[i][j]);
    //         result[i][j]=mat1[i][j]+mat2[i][j];
//     //     }
//     //     System.out.println("\n ");
//     String sc="123";
//     System.out.println(reverse(sc));
//   }}
// public class pratice2{
//     public static void main(String[] args) {
//     String  name="Muhammad Mubashir";
//     System.out.println(name.length());
//     System.out.println(name.toUpperCase());
//     System.out.println(name.toLowerCase());
//     System.out.println(name.replace("m", "s"));
//     System.out.println(name.startsWith("M"));
//     System.out.println(name.endsWith("r"));
//     }
// }
