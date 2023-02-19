import java.io.PushbackInputStream;
import java.lang.Character.UnicodeBlock;
import java.lang.Thread.State;
import java.lang.invoke.MutableCallSite;//
//import java.lang.invoke.ClassSpecializer.Factory;
import java.lang.module.FindException;
import java.net.PortUnreachableException;
import java.net.SocketImpl;
import java.net.SocketTimeoutException;
import java.net.http.HttpRequest;
import java.nio.channels.AlreadyBoundException;
import java.nio.channels.NetworkChannel;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.Pipe;
import java.nio.channels.ScatteringByteChannel;
import java.rmi.StubNotFoundException;
import java.rmi.server.SocketSecurityException;
import java.security.DigestOutputStream;
import java.security.PublicKey;
import java.security.cert.PKIXBuilderParameters;
import java.security.interfaces.ECKey;
import java.sql.Blob;
import java.sql.SQLOutput;
import java.sql.Savepoint;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleToIntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.jar.Attributes.Name;
import java.util.random.RandomGenerator;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

import javax.annotation.processing.SupportedOptions;
import javax.imageio.stream.FileCacheImageOutputStream;
import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner14;
import javax.management.ObjectName;
import javax.management.modelmbean.ModelMBean;
import javax.management.monitor.StringMonitor;
import javax.management.relation.RoleInfo;
import javax.management.relation.RoleResult;
import javax.naming.directory.SchemaViolationException;
import javax.naming.ldap.SortControl;
import javax.print.FlavorException;
import javax.print.attribute.standard.RequestingUserName;
import javax.security.auth.kerberos.KerberosCredMessage;
import javax.security.sasl.Sasl;
import javax.sound.midi.Soundbank;
import javax.sound.midi.VoiceStatus;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.SourceDataLine;
import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
import javax.swing.GrayFilter;
import javax.swing.Icon;
import javax.swing.Renderer;
import javax.swing.SortingFocusTraversalPolicy;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.DocumentEvent.ElementChange;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicBorders.MarginBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.TabExpander;
import javax.swing.text.TableView;
import javax.swing.text.AbstractDocument.AbstractElement;
import javax.swing.text.AbstractDocument.BranchElement;
import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.text.DefaultStyledDocument.ElementSpec;
import javax.swing.text.html.FormSubmitEvent;
import javax.swing.text.html.StyleSheet;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;

// import org.jcp.xml.dsig.internal.MacOutputStream;
import org.w3c.dom.html.HTMLBaseElement;
import org.xml.sax.SAXException;



// import java.net.SocketImpl;
// import java.net.SocketTimeoutException;
// import java.time.Period;
// import java.util.Scanner;
// import java.util.jar.Attributes.Name;

// import javax.print.attribute.standard.DialogTypeSelection;
// import javax.script.ScriptException;
// import javax.swing.GrayFilter;
// import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
// import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;
// import javax.swing.text.DefaultStyledDocument.ElementSpec;
// import javax.xml.transform.Source;

// // int [] arr={2,3,4,5,6,7};
//     // int temp;
//     // int l=arr.length;
//     // int n=Math.floorDiv(l, 2);
//     // for(int i=1; i<n; i++){
//     //     temp=arr[i];
//     //     arr[i]=arr[l-1-i];
//     //     arr[l-1-i]=temp;
//     // }
//     // for(int element:arr){
//     //     System.out.println(element);
//     // }
//     // int [] arr={23,657,32,89,2};
//     // int mx=0;
//     // for(int element: arr){
//     //     if(element>mx){
//     //         mx=element;
//     //     }
//     // }
//     // System.out.println("The "+mx);
//     // int [] arr={2,-45,67,90,23};
//     // int min=Integer.MIN_VALUE;
//     // for(int element:arr){
//     //     if(element<min){
//     //         min=element;
//     //     }
//     //     System.out.println(min);
//     // }
//                      // Sorted
//                     //  boolean isSorted=true;
//                     //  int arr[]={1,2,3,4,5};
//                     //  for(int i=1; i<arr.length-1; i++){
//                     //     if(arr[i]>arr[i+1]){
//                     //         isSorted=false;
//                     //         break;
//                     //     }
//                     //  }
//                     //  if(isSorted){
//                     //     System.out.println("The array is sorted");
//                     //  }else{
//                     //     System.out.println("The Array is not sorted");
//                     //  }
//                     // boolean isSorted=true;
//                     // int []arr={2,7,1,8,90};
//                     // for(int i=1; i<arr.length-1; i++){
//                     //     if(arr[i]>arr[i+1]){
//                     //         isSorted=false;
//                     //         break;
//                     //     }
//                     // }
//                     // if(isSorted){
//                     //     System.out.println("Sorted");
//                     // }else{
//                     //     System.out.println("Not sorted");
//                     // }
//                                 //  //Method is present in the main function otherwise java
//                                 //  public class Conditionaloperator{
//                                 //     static int logic(int a, int b){
//                                 //         int c;
//                                 //         if(a>b){
//                                 //             c=(a+b)+5;
//                                 //         }else{
//                                 //             c=(a-b)-5;
//                                 //         }
//                                 //         return c;
//                                 //     }
//                                 //     public static void main(String[] args) {
//                                 //         int x=2;
//                                 //         int y=3;
//                                 //         int  z;
//                                 //         z=logic(x, y);
//                                 //         int e=5;
//                                 //         int d=2;
//                                 //         int w;
//                                 //          w=logic(e, d);
//                                 //         System.out.println(z);
//                                 //         System.out.println(w);

//                                   //Method with void
//                                 //   public class Conditionaloperator{
//                                 //     static void telljoke(){
//                                 //         System.out.println("You: “Ok Google, tell me a joke.”");
//                                 //     }
//                                 //     // public static void main(String[] args) {
//                                 //     //     telljoke();
//                                 //     }
//                                   // changing the array
                                  // public class Conditionaloperator{
                                  //   static void change (int arr[]){
                                  //       arr[0]=43;
                                  //       arr[1]=22;
                                  //       arr[2]=50;
                                  //       }
                                  //       public static void main(String[] args) {
                                  //        int [] marks={2,3,4,5,6};
                                  //       change(marks);
                                  //       System.out.println("Changing the array is:"+marks[0]);
                                  //       System.out.println("change:"+marks[1]);

                                  //       }
                                  //       }
//                                 //     }

// //  public class Conditionaloperator{
// //   public static void main(String[] args) {
// //  int [][] mat1={{2,3,4},{2,1,4}};
// //  int [][] mat2={{1,2,4},{2,4,4}};
// //  int [][] result={{0,0,0},{0,0,0}};
// //  for(int i=0; i<mat1.length; i++){
// //   for(int j=0; j<mat1[i].length; j++){
// //     System.out.printf("Settings is i=%d and j=%d\n",i,j );
// //     result[i][j]=mat1[i][j]+mat2[i][j];
// //   }
// //  }
// //  for(int i=0; i<mat1.length; i++){
// //   for(int j=0; j<mat1[i].length; j++){
// //     System.out.println(result[i][j]);
// //     result[i][j]=mat1[i][j]+mat2[i][j];
// // //   }
// // //  }
// // //   }
// // //  }
// // public class Conditionaloperator{
// //   /* static void Table(int n){
// //     for(int i=10;  i>=1; i--){

// //       System.out.printf("%d X %d =%d\n",n,i,n*i);
// //     }
// //   }
// //   */
// //   /*static void pattern(int n){
// //     for(int i=0; i<n; i++){
// //       for(int j=0; j<i+1; j++){
// //         System.out.print("*");
// //       }
// //       System.out.println();
// //     }

// //   }  */
// //   /*static int sumNatural(int n){
// //     if(n==1){
// //       return 1;
// //     }else{
// //       return n+sumNatural(n-1);
// //     }
// //   }/* */
// //   /*static void star(int n){
// //     for(int i=0; i<n; i++){
// //       for(int j=0; j<n-i; j++){
// //         System.out.printf("*");
// //       }
// //       System.out.println();
// //     }
// //   }/* */
// //  /*static int fabionacciseries(int n){
// //   if(n==1 || n==2){
// //     return n-1;
// //   }
// //   else{
// //     return fabionacciseries(n-1)+fabionacciseries(n-2);
// //   }
// //  }/* */
// //  static void pattern(int n){
// //   if(n>0){
// //     pattern(n-1);
// //     for(int i=0; i<n; i++){
// //       System.out.printf("*");
// //     }
// //     System.out.println();
// //   }
// //  }
// //   public static void main(String[] args) {
// //   pattern(4);
// //   }

// // }
// public class Conditionaloperator{
//   static int tab(int n){
//     if(n==1){
//       return 1;
//     }else{
//       return n+tab(n-1);
//     }
//   }
//   public static void main(String[] args) {
//     System.out.println("THe sum is:"+tab(4));
//   }
// }
//   class Empolyee{
//     int id;
//     String  name;
//     public void detail(){
//       System.out.println("Your id is:"+id);
//       System.out.println("Your name is:"+name);

//     }
//   }
//   public class Conditionaloperator{
//   public static void main(String[] args) {
//     Empolyee Mubashir= new Empolyee();
//     Empolyee hasham= new Empolyee();
//     Mubashir.id=12;
//     hasham.id=13;
//     Mubashir.name="Muhammad Mubashir";
//     hasham.name="Hasham jahangeer";
//     // System.out.println(Mubashir.id);
//     // System.out.println(Mubashir.name);
//        Mubashir.detail();
//        hasham.detail();
//   }
// /}
//v class Empolyee{
//   int salary;
//   String name;
//   public int getsalary(){
//     return salary;
//   }
//   public String getname(){
//     return name;
//   }
//   public void setname(String n){
//     name=n;
//   }
// }
// public class Conditionaloperator{

//   public static void main(String[] args) {
//     Empolyee Mubashir=new Empolyee();
//     Mubashir.setname("Muhammad Mubashir");
//     Mubashir.salary=233;
//     System.out.println(Mubashir.getname());
//     System.out.println(Mubashir.salary);
//   }
// }
// class cellphone{
//   public void cell(){
//     System.out.println("Phone call....");
//   }
//   public void viberate(){
//     System.out.println("Phone Viberating...");
//   }
//   public void Ring(){
//     System.out.println("Phone ringing....");
//   }
// }
// public class Conditionaloperator{

//   public static void main(String[] args) {
//     cellphone sc=new cellphone();
//     sc.cell();
//     sc.Ring();
//     sc.viberate();
//   }
// }
// class calculate{
//   int side;
//   public int area(){
//     return side*side;
//   }
//   public int parameter(){
//     return 4*side;
//   }
// }
// public class Conditionaloperator{

//   public static void main(String[] args) {
//     calculate sc=new calculate();
//     sc.side=3;
//     System.out.println(sc.area());
//     System.out.println(sc.parameter());
//   }
// }
// class player{
//   public void fir(){
//     System.out.println("Fire on the enemy");
//   }
//   public void Hit(){
//     System.out.println("Hitting from the enemy");
//   }
//   public void run(){
//     System.out.println("Run from the enemy");
//   }
// }
// public class Conditionaloperator{
//   public static void main(String[] args) {
//     player mubashir=new player();
//     mubashir.run();
//     mubashir.Hit();
//   }
// }
// class Empolyee{
//   public int square(int side){
//     return side*side;
//   }
//   public int parameter(int side){
//     return side*4;
//   }
// }
// public class Conditionaloperator{

//   public static void main(String[] args) {
//   Empolyee Mubahsir=new Empolyee();
//   Mubahsir.square(3);
//   Mubahsir.parameter(3);
//   System.out.println(Mubahsir.square(3));
//   System.out.println(Mubahsir.parameter(3));

//   }
// }
// class MyEmployee{
//   private int id;
//  private String name;
//  public String getname(){
//   return name;
//  }
//  public void setname( String n){
//   name=n;
//  }
//  public int getid(){
//   return id;
//  }
//  public void setid(int i){
//   id=i;
//  }
// }

// public class Conditionaloperator{
//   public static void main(String[] args) {
//     MyEmployee Mubashir=new MyEmployee();
//     Mubashir.setname("Muhammad Mubashir");
//     System.out.println(Mubashir.getname());
//     Mubashir.setid(12);
//     System.out.println(Mubashir.getid());
//   }
// }
// import java.util.Random;
// public class Conditionaloperator{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter 0 for Rack, 1 for Paper, 2 for Sessior");
//     int userinput=sc.nextInt();
//     Random random=new Random();
//     int computerinput=random.nextInt(3);
//      if(userinput==computerinput){
//       System.out.println("Darw math");
//      }
//     else if(userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1){
//       System.out.println("You Win");
//     }else{
//       System.out.println("Computer Win");
//     }
//     System.out.println("computer Choice: "+userinput);
//   }
// }
// class Empolyee{
//   private int id;
//   private  String name;
//   public Empolyee(){
//     id=34;
//     name="Muhammad Mubashir";

//   }

//   public Empolyee(String myname, int myid){
//     id=myid;
//     name=myname;

//   }
//   public Empolyee(String myname){
//     id=2;
//     name=myname;

//   }


//   public int getid(){
//     return id;
//   }
//   public void setid(int i){
//     id=i;

//   }
//   public String getname(String n){
//     return name;
//   }
//   public void setname(String n){
//     name=n;
//   }
// }
// public class Conditionaloperator{
//   public static void main(String[] args) {
//     Empolyee Mubashir=new Empolyee();
//     System.out.println(Mubashir.getid());
//     System.out.println(Mubashir.getname(null));
//   }
// }
// public class Conditionaloperator{
//   static void star(){
//     for(int i=0; i<=5; i++){
//       for(int j=1; j<=5+i; j++){
//         System.out.printf("*");
//       }
//       System.out.println();
//     }
//   }
//   public static void main(String[] args) {
//    star();
//    }
// }
// class Empolyee{
//       int salary;
//       String name;
//       public int getsalary(){
//         return salary;
//       }
//       public String getname(){
//         return name;
//       }
//       public void setname(String n){
//         name=n;
//       }
//     }
//     public class Conditionaloperator{

//       public static void main(String[] args) {
//  v       Empolyee Mubashir=new Empolyee();
//         Mubashir.setname("Muhammad Mubashir");
//         Mubashir.salary=233;
//         System.out.println(Mubashir.getname());
//         System.out.println(Mubashir.salary);
//       }
//     }
// class Clyinder{
//     private int height;
//     private int Area;
//     public int getheight(){
//         return height;
//     }
//     public void setheight(int height){
//         this.height=height;
//     }
//     public int getarea(){
//         return Area;
//     }
//     public void setarea(int area){
//         Area=area;
//     }
// }
// public class Conditionaloperator{
//     public static void main(String[] args) {
//      Clyinder myclyinder=new Clyinder();
//      myclyinder.setarea(2);
//      System.out.println(myclyinder.getarea());
//      myclyinder.setheight(21);
//      System.out.println(myclyinder.getheight());

//     }
// }
// class Clyinder{
//     private int height;
//     private int radius;
//     public int getheight(){
//         return height;
//     }
//     public void setheight(int height){
//         this.height=height;
//     }
//     public int getradius(){
//         return radius;
//     }
//     public void setradius(int radius){
//         radius=radius;
//     }
//     public double surfacearea(){
//         return 2*3.14*radius*height+2*3.14*radius*radius;
//     }
//     public double volume(){
//         return 3.14*radius*radius*height;
//     }
// }
// public class Conditionaloperator{
//     public static void main(String[] args) {
//      Clyinder myclyinder=new Clyinder();
//      myclyinder.setradius(2);
//      System.out.println(myclyinder.getradius());
//      myclyinder.setheight(21);
//      System.out.println(myclyinder.getheight());
//      System.out.println(myclyinder.surfacearea());
//      System.out.println(myclyinder.volume());

//     }
// }
//     class cylinder{
//         private int radius;
//         private int height;
//         public cylinder(int radius,int height){
//             this. radius=radius;
//             this.height=height;

//         }
//         public int geradius(){
//             return radius;
//         }
//         public void setradius(int radius){
//             radius=radius;
//         }
//         public int getheight(){
//             return height;
//         }
//         public void setheight(int height){
//             height=height;
//         }
//     }
// public class Conditionaloperator{
//     public static void main(String[] args) {
//         cylinder mCylinder=new cylinder(2, 3);
//         System.out.println(mCylinder.geradius());
//         System.out.println(mCylinder.getheight());

//     }
// }
// class cylinder{
//     private int length;
//     private int breadth;
//     public cylinder(){
//         this.length=2;
//         this.breadth=2;
//     }
//     public cylinder(int length,int breadth){
//         this.length=length;
//         this.breadth=breadth;
//     }
//     public int getlength(){
//         return length;
//     }
//     public int getbreadth(){
//         return breadth;
//     }
//     public void setlength(int length){
//         length=length;
//     }
//     public void setbreath(){
//          breadth=breadth;
//     }
// }
// public class Conditionaloperator{
//     public static void main(String[] args) {
//         cylinder Mubashir=new cylinder();
//         System.out.println(Mubashir.getbreadth());
//         System.out.println(Mubashir.getlength());
//     }
// }
// class Base{
//     int x;
//     public int getx(){
//         return x;
//     }
//     public void setx(int x){
//         System.out.println("I am a setter value is x now");
//     this.x=x;
//     }
//     public void printMe(){
//         System.out.println(" I Am A Constructor");
//     }
// }
// class Derived extends Base{
//     int y;
//     public int gety(){
//         return y;
//     }
//     public void sety(int y){
//         this.y=y;
//     }
// }
// public class Conditionaloperator{
//     public static void main(String[] args) {
//          Base Mubashir=new Base();

//         Mubashir.setx(3);
//         System.out.println(Mubashir.getx());

//         //Now the derived calss is
//         Derived d=new Derived();
//         d.sety(2);
//         System.out.println(d.gety());
//     }

// }
//}
// class Dog{
//     int dog;
//     public int getdog(){
//         return dog;
//     }
//     public void setdog(int dog){
//         System.out.println("i am a Pakistani Dog");
//         this.dog=dog;
//     }
//      Dog(){
//         System.out.println("I am a constructor Dog");
//     }

// }
// class derived extends Dog{
//     int germandog;
//     public int getgermdog(){

//         return germandog;
//     }
//     public void setgermdog(int germandog){
//         System.out.println("I am a germen dog");
//         this.germandog=germandog;
//     }
//     derived(){
//         System.out.println(" I am a cat");
//     }
// }
// public class Conditionaloperator{
//     public static void main(String[] args) {
//         Dog m=new Dog();
//         //m.setdog(2);
//         //System.out.println(m.getdog());
//         derived b=new derived();
//         //b.setgermdog(4);
//         //System.out.println(b.getgermdog());

//     }
// }
// class base{
//     base(){
//         System.out.println("i am a Consrtuctor");
//     }
//     base(int x){
//         System.out.println("i am a over loaded constructor");
//     }
//     base(int a,int b){
//         System.out.println("i am a two veriable constructor");
//     }
// }
// class derived extends base{
//     derived(){
//         System.out.println(" i am a derived constructor");
//     }
//     derived(int a,int b){
//         super(a);
//         System.out.println("i am a two derived constructor");
//     }
// }
// public class Conditionaloperator{
//     public static void main(String[] args) {
//         derived a=new derived(2,3);
//     }
// }
// public class Conditionaloperator{
//     public static void main(String[] args) {
//       int [][] mat1={{3,4,5},{3,6,7}};
//       int [][] mat2={{3,4,5},{3,6,7}};
//       int [][] reslt={{0,0,0},{0,0,0}};
//       for(int i=0; i<mat1.length; i++){
//         for(int j=0; j<mat1[i].length; j++){
//             System.out.printf(" Settings is i=%d and j=%d\n",i,j);
//             int [][] mat1={{3,4,5},{3,6,7}};
//         }
//       }

//     }
// }
                                // Method Overriding


// class A{
//   public int a;
//   public int meth1(){
//     return 4;
//   }
//   public void meth2(){
//     System.out.println(" I am a Mthod 2 class A");
//   }

// }
// class B extends A{
//   public void meth2(){
//     System.out.println("I am a class of method 2 to A");
//   }
//   public void meth3(){
//     System.out.println(" i am a class 3 to C:");
//   }
// }
// public class Conditionaloperator{
//   public static void main(String[] args) {
//     A a=new A();
//     a.meth2();
//     B b=new B();
//     b.meth2();

//   }
// }
                   //Dynamic Mathod Dispach

          //          class Phone{
          //           public void on(){
          //             System.out.println("I am A Phone");
          //           }
          //           public void off(){
          //             System.out.println("I am oFF");
          //           }
          //          }
          //          class Smartphone extends Phone{
          //           public void on(){
          //             System.out.println(" I am a smart phone");
          //           }
          //           public void swatch(){
          //             System.out.println("I am a switch");
          //           }
          //          }
          // public class Conditionaloperator{
          //   public static void main(String[] args) {
          //     Phone obj=new Smartphone();
          //     obj.on();

          //   }
          // }



          // import java.util.Random;
          // import java.util.Scanner;

          // class Game{
          //     public int number;
          //     public int inputNumber;
          //     public int noOfGuesses = 0;

          //     public int getNoOfGuesses() {
          //         return noOfGuesses;
          //     }

          //     public void setNoOfGuesses(int noOfGuesses) {
          //         this.noOfGuesses = noOfGuesses;
          //     }

          //     Game(){
          //         Random rand = new Random();
          //         this.number = rand.nextInt(100);
          //     }
          //     void takeUserInput(){
          //         System.out.println("Guess the number");
          //         Scanner sc = new Scanner(System.in);
          //         inputNumber = sc.nextInt();
          //     }
          //     boolean isCorrectNumber(){
          //         noOfGuesses++;
          //         if (inputNumber==number){
          //             System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
          //             return true;
          //         }
          //         else if(inputNumber<number){
          //             System.out.println("Too low...");
          //         }
          //         else if(inputNumber>number){
          //             System.out.println("Too high...");
          //         }
          //         return false;
          //     }

          // }
          // public class Conditionaloperator {
          //     public static void main(String[] args) {
          //         /*
          //             Create a class Game, which allows a user to play "Guess the Number"
          //             game once. Game should have the following methods:
          //             1. Constructor to generate the random number
          //             2. takeUserInput() to take a user input of number
          //             3. isCorrectNumber() to detect whether the number entered by the user is true
          //             4. getter and setter for noOfGuesses
          //             Use properties such as noOfGuesses(int), etc to get this task done!
          //          */

          //         Game g = new Game();
          //         boolean b= false;
          //         while(!b){
          //         g.takeUserInput();
          //         b = g.isCorrectNumber();
          //         }

          //     }
          // }
        //   class Circle{
        //     public int radius;
        //     public double Circle(){
        //       return Math.PI*this.radius*this.radius;
        //     }
        //     Circle(){
        //       System.out.println("Iam constructor");
        //     }
        //     Circle(int r){
        //       System.out.println("I am constructor of class1");
        //       this. radius=r;
        //     }
        //   }
        //   class Cylinder extends Circle{
        //     public int height;
        //      Cylinder(int r,int h){
        //       super(r);
        //       System.out.println("i am  a parameter");
        //       this.height=h;
        //     }

        //     public double Cylinder1(){
        //       return Math.PI*this.radius*this.radius;
        //     }

        //   }
        // public class Conditionaloperator{
        //   public static void main(String[] args) {
        //     Cylinder obj=new Cylinder(2, 3);

        //   }
        // }
        // class salary{
        //   private int salary;
        //   private String name;
        //   public int getsalary(){
        //     return salary;
        //   }
        //   public void setsalary(int salary){
        //     this. salary=salary;
        //   }
        //   public String getname(){
        //     return name;
        //   }
        //   public void setname(String n){
        //     this.name=n;
        //   }
        // }
        // public class Conditionaloperator{
        //   public static void main(String[] args) {
        //     salary obj=new salary();
        //     obj.setsalary(2);
        //     System.out.println(obj.getsalary());
        //     obj.setname("yawaseo");
        //     System.out.println(obj.getname());
        //   }
        // }
        // class Empolyee{
        //   public int salary;
        //   public String name;
        //   Empolyee(int salary,String name){
        //     this.name=name;
        //     this.salary=salary;
        //   }
        //   public int getsalary(){
        //     return salary;
        //   }
        //   public void setsalary(int salary){
        //   this.salary=salary;
        //   }
        //   public String name(){
        //     return name;
        //   }
        //   public void name(String name){
        //     this.name=name;
        //   }
        // }
        // public class Conditionaloperator{
        //   public static void main(String[] args) {
        //     Empolyee mubashir=new Empolyee(2, "Mubashir");
        //   }
        // // }

        // public class Conditionaloperator{
        //   public static  double max(int max1,int max2) {
        //     if(max1>max2)
        //     return max1;
        //     else
        //     return  max2;
        //   }
        //   public static  double max(double max1,int max2) {
        //     if(max1>max2)
        //     return max1;
        //     else
        //     return  max2;
        //   }
        //   public static void main(String[] args) {
        //     System.out.println(max(1, 2));
        //   }
        // }
 // public class Conditionaloperator{
    // public static double Max(int max1,double max2){
    //   int result;
    //   if(max1>max2)
    //   {
    //     result=max1;
    //     return result;
    //   }else{
    //     return max2;
    //   }
    // }
    // public static double Max1(double max1,int max2){
    //   int result;
    //   if(max1>max2)
    //   {
    //     result=max2;
    //     return result;
    //   }else{
    //     return max2;
    //   }
    // }
  //  public class Conditionaloperator{
  //   public static void main(String[] args) {
  //     Scanner sc=new Scanner(System.in);
  //     System.out.println("Enter the Number of he ath and bth variable:");
  //     int a=sc.nextInt();
  //     int b=sc.nextInt();
  //     System.out.printf("before the Swap  of is :=%d",a);
  //     System.out.printf("Before the b swap is =%d",b);
  //     a=a+b;
  //     b=a-b;
  //     a-=b;
  //     System.out.printf("The after the swwap of a is: =%d",a);
  //     System.out.printf("After the b swap is=%d",b);
  //   }
  //  }

//  public class Conditionaloperator{
//   public static void main(String[] args) {
//     System.out.println("Enter the Number of the ath and the bth variable:");
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int quadratic=(b*b-4*a*b)/2*a;
//     System.out.println("The quadratuic equation is:"+quadratic);
//     }
//  }

// public class Conditionaloperator{
//   public static void main(String[] args) {
//     int pin,withdraw,balance,mini_statement,transfer_amount,Choose_option;
//     int total_balance=1000;
//     System.out.println("Enter the user PIN");
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     if(a==1999){
//       System.out.println("Welcome to our Bank");
//       System.out.println("Choose_option\n 1: Total_balance\n 2: withdraw_amount\n 3: mini_statement \n 4: Transfer_amount");
//       Scanner thi=new Scanner(System.in);
//       int Choose_Option=thi.nextInt();
//       switch(Choose_Option){
//         case 1:
//         System.out.printf("your Total Balance is =%d\n",total_balance);
//         break;
//         case 2:
//         System.out.println("Enter the Widthraw amount");
//         Scanner ft=new Scanner(System.in);
//         int Withdraw_amount=ft.nextInt();
//        total_balance-=Withdraw_amount;
//        System.out.printf("The WWithdarw amount is =%d\n and the total_balance is=%d\n",Withdraw_amount,total_balance);
//        break;
//        case 3:
//        System.out.println("Enter the Mini_Statement:");
//        Scanner fifth=new Scanner(System.in);
//        String name=fifth.next();
//        System.out.println("yes "+name+"Ok successfull");
//        System.out.println("Enter the Father name");w
//        Scanner six=new Scanner(System.in);
//        String fathername=six.next();
//        System.out.println("yes "+fathername+"Ok successfull");
//        System.out.println("Enter the Finger Verification  pin code onBank to leep success");
//        Scanner sev=new Scanner(System.in);
//        String fingerverificaiton=sev.next();
//       System.out.println("No"+fingerverificaiton+"Keep stay on the bank verification Documnet");
//       break;
//       case 4:
//       System.out.println("Enter the Transfer_amount");
//       Scanner eig=new Scanner(System.in);
//       int transfer=eig.nextInt();
//       total_balance-=transfer;
//       System.out.printf("YOur transfer amount is =%d\n and the totla balance is=%d\n",transfer,total_balance);
//       break;

//       }
//     }else{
//       System.out.println("Sorry Wrong Input");
//     }

// }

// }

// public class Conditionaloperator{
//   public static void main(String[] args) {
//     int PIN,balance,Widthraw,mini_statement,Transfer_amount;
//     int Total_balance=1000;
//     System.out.println("Enter the PIN");
//     Scanner sc=new Scanner(System.in);
//     int pin=sc.nextInt();
//     if(pin==1000){
//       System.out.println("Choose_option\n 1: Checking balance\n 2: Width_darw_amount\n 3: Mini_+statement \n 4: Transfer Amount");
//     Scanner fir=new Scanner(System.in);
//     int a=fir.nextInt();
//     switch(a){
//       case 1:
//       System.out.println("Your total Balance is:"+Total_balance);
//       break;
//       case 2:
//       System.out.println("Enter the Width_draw Amount:");
//       Scanner thi=new Scanner(System.in);
//       int width_draw=thi.nextInt();
//       Total_balance-=width_draw;
//       System.out.printf("Your Width Darw amount is =%d\n and the total Balance is =%d\n",width_draw,Total_balance);
//       break;
//       case 3:
//       System.out.println("Enter the mini_staement");
//       break;
//       case 4:
//       System.out.println("Enter the Transfer amount");
//       Scanner fout=new Scanner(System.in);
//       int transfer_amount=fout.nextInt();
//       Total_balance-=transfer_amount;
//       System.out.printf("Your transfer amount is =%d\n and total balnce is=%d\n",transfer_amount,Total_balance);
//       break;
//       default:
//       System.out.println("Sorry Wrong input ");
//       break;
//     }

//     }
//     else{
//       System.out.println("Sorry Wrong input");
//     }
//   }
// }
// public class Conditionaloperator{
// public  int logic(int x,int y){
//     int z;
//     if(x>y){
//        z=x+y;
//     }else{
//        z=x-y;
//     }
//     return z;
//   }
//   public static void main(String[] args) {
//   int a=4;
//   int b=2;
//   int c;
//   Conditionaloperator obj=new Conditionaloperator();
//   c=obj.logic(a, b);
//   System.out.println(c);

//   }
// }
// public class Conditionaloperator{
//   static int sum(int ...arr){
//     int resulti
//     =0;
//         for(int a:arr){
//       resulti+=a;
//     }
//     return resulti;
//   }
//   public static void main(String[] args) {
//     System.out.println("Enter the Multiple Number to  sum:");
//     System.out.println("The sum of :"+sum(3,5,7,8));
//     System.out.println("The sum of "+sum(57,2,6787777,211));
//   }
// }

// public class Conditionaloperator{
//   public static int fab(int n){
//     if(n==1 || n==2){
//       return 1;
//     }else{
//       return fab(n-1)+fab(n-2);
//     }
//   }
//   public static void main(String[] args) {
//     System.out.println("Enter the Number to print the fab of term");
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     System.out.println("The term is:"+fab(a));
//   }
// }
//  abstract class parnet{
//   public parnet(){
//     System.out.println("Hello Mubashir");
//   }
//   public void hello(){
//     System.out.println("Hello World");
//   }
//   abstract public void greet();
// }
// class child extends parnet{
//   public void greet(){
//     System.out.println("Good Morning");
//   }
// }
//  abstract class child2 extends parnet{
// public void greet(){
//   System.out.println("Good Afternoon");
// }
// }
// public class Conditionaloperator{
//   public static void main(String[] args) {
//     child obj=new child();
//     obj
//   }
// }
//     System.out.println("Enter the Number to print the fab of term");
//     System.out.println("Enter the Number to print the fab of term");

//  abstract class Empolyee{
//   int salary;
//   String name;
//   public Empolyee(int salary, String name ){
//     this.salary=salary;
//     this.name=name;
//   }
//   public int getsalary(){
//     return salary;
//   }
//   public void setsalary(int n){
//     this.salary=n;
//   }
//   public String getname(){
//     return name;
//   }
//   public void setname(String n){
//     this.name=n;
//   }
//   abstract public void greet();
// }
// class child extends Empolyee{
// public child(int salary, String name) {
//     super(salary, name);
//     //TODO Auto-generated constructor stub
//   }

// public void greet(){
//   System.out.println("Sorry");
// }
// }
//  public class Conditionaloperator{
//   public static void main(String[] args) {
//     child obj=new child(200000, "Mubsahir");
//     System.out.println(obj.getsalary());
//     System.out.println(obj.getname());
//   }
//  }
// class Circle{
//   int radius;
//   int height;
//   public double  area(int  radius){
//     double  reslt=Math.PI*radius*radius;
//     return reslt;

//   }
// }
// class Cylinder extends Circle{
//   public double cylinderarea(int radius,int height){
//     double result=2*Math.PI*radius*(radius+height);
//     return result;
//   }
// }
// class Rectangle{
//   int radius;
//   int width;
//   int length;
//   public double Rectangle_area(double width,double height){
//     double reslt=width*height;
//     return reslt;
//   }


// }
// class Cuboid extends Rectangle{
//   public double Cuboid_area(double length, double height,double width)
//   {
//     double reslt=2*(length*width+width*height+length*height);
//     return reslt;
//   }
// }
// import java.util.random.RandomGenerator;
// public class Conditionaloperator{
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter 0 for Rack, 1 for Paper, 2 for Sessior");
//       int userinput=sc.nextInt();
//       Random random=new Random();
//       int computerinput=random.nextInt(3);
//        if(userinput==computerinput){
//         System.out.println("Darw math");
//        }
//       else if(userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1){
//         System.out.println("You Win");
//       }else{
//         System.out.println("Computer Win");
//       }
//       System.out.println("computer Choice: "+userinput);
//     }
//     }

// public class Conditionaloperator {

//   public void finalize() throws Throwable{
//   System.out.println("Object is destroyed by the Garbage Collector");
// }

//   public static void main(String[] args) {
//   Conditionaloperator test = new Conditionaloperator();
//   test = null;
//   System.gc();
//   }
// }

// class xyz
// {
// xyz()
// {
// System.out.println("Constructor method........");
// }
// protected void finalize()
// {
// System.out.print("Garbage Collected.....");
// }
// }
// class Conditionaloperator
// {
// public static void main(String args[])
// {
// xyz ob=new xyz();
// ob=null;
// System.gc();
// }
// }


//  abstract class Pen{
//    String name;
//    int [] id;
//    double []salary;
//    Pen(){
//     this.name=name;
//     this.id=new int[100];
//     this.salary=new double[500000];
//    }
//    void empolyeeid(int id){
//     if(id>=1 && id<=20){
//       System.out.println("this is ");
//       System.out.println("all the salary are:"+id);
//     }else if(id>=20 && id<=50){
//       System.out.println("all the empolyee are Graduate");
//       System.out.println("The empolyee id is:"+id);
//     }
//    }

// }
// class Newpen extends Pen{

// }
// public class Conditionaloperator{
//   public static void main(String[] args) {
//     Newpen obj=new Newpen();
//     obj.empolyeeid(1);

//   }
// }
// public class Conditionaloperator {
//   public static void main(String[] args) {
//       // Generate a random number between 1 and 100
//       Random rand = new Random();
//       int numberToGuess = rand.nextInt(100) + 1;

//       // Create a Scanner object for input
//       Scanner input = new Scanner(System.in);

//       // Initialize the number of guesses to 0
//       int numberOfGuesses = 0;

//       // Start the game loop
//       while (true) {
//           // Get the player's guess
//           System.out.print("Enter your guess: ");
//           int guess = input.nextInt();
//           numberOfGuesses++;

//           // Check if the guess is correct
//           if (guess == numberToGuess) {
//               System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " tries.");
//               break;
//           } else if (guess < numberToGuess) {
//               System.out.println("Too low! Try again.");
//           } else {
//               System.out.println("Too high! Try again.");
//           }
//       }

//       // Close the Scanner object
//       input.close();
//   }
// }
// class Encapsulation{
//   int salary,id;
//   String name,depeartment;
//   Encapsulation(int id, int salary, String name, String depeartment){
// this.depeartment=depeartment;
// this.id=id;
// this.name=name;
// this.salary=salary;
//   }
//   public void setsalary(int salary){
//     this.salary= salary;
//   }
//   public int gersalary(){
//     return salary;
//   }
//   public void setid(int id){
//     this.id=id;
//   }
//   public int getid(){
//     return id;
//   }
//   public void setname(String name){
//     this.name=name;
//   }
//   public String getname(){
//     return name;
//   }
//   public void setdepartment(String depeartment){
//     this.depeartment=depeartment;
//   }
//   public String getdepeartment(){
//     return depeartment;
//   }

// }
// // Java program of above implementation
// public class Conditionaloperator {
//   /* Class Pair is used to return two values from getMinMax() */
//     static class Pair {
//       int min;
//       int max;
//     }
//     static Pair getMinMax(int arr[], int n) {
//       Pair minmax = new Pair();
//       int i;
  
//       /*If there is only one element then return it as min and max both*/
//       if (n == 1) {
//         minmax.max = arr[0];
//         minmax.min = arr[0];
//         return minmax;
//       }
  
//       /* If there are more than one elements, then initialize min
//     and max*/
//       if (arr[0] > arr[1]) {
//         minmax.max = arr[0];
//         minmax.min = arr[1];
//       } else {
//         minmax.max = arr[1];
//         minmax.min = arr[0];
//       }
  
//       for (i = 2; i < n; i++) {
//         if (arr[i] > minmax.max) {
//           minmax.max = arr[i];
//         } else if (arr[i] < minmax.min) {
//           minmax.min = arr[i];
//         }
//       }
  
//       return minmax;
//     }
  
//     /* Driver program to test above function */
//     public static void main(String args[]) {
//       int arr[] = {1000, 11, 445, 1, 330, 3000};
//       int arr_size = 6;
//       Pair minmax = getMinMax(arr, arr_size);
//       System.out.printf("\nMinimum element is %d", minmax.min);
//       System.out.printf("\nMaximum element is %d", minmax.max);
  
//     }
  
//   }
public class Conditionaloperator{
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int mynumber=(int)(Math.random()*100);
   int userNumber=0;
   do{
    System.out.println("Enter the Number to less then 100");
    userNumber=sc.nextInt();
    
    if(userNumber==mynumber){
      System.out.println("wohoo your number is quall to computer number");
      break;
    }else if(userNumber>mynumber){
      System.out.println("Your Number is too larger:");
    }else {
      System.out.println("Your  Number is too small");
    }

   }while(userNumber>=0);
   System.out.println("your Number is :"+userNumber);
  }
}