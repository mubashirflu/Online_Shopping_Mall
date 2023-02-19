import java.lang.reflect.Array;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.SortOrder;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
// public class DataStructure{
//   public static void main(String[] args) {
//     ArrayList<Integer> list=new ArrayList<Integer>();
//     //Adding process
//     list.add(0);
//     list.add(1);
//     list.add(2);
//     System.out.println(list);
//     
        // get 
//     int element =list.get(1);
//     System.out.println(element);
//     //  adding ele in betweeen
//     list.add(1, 2);
//     System.out.println(list);
//     // set process
//     list.set(0, 1);
//     System.out.println(list);
//     // remove 
//     list.remove(2);
//     System.out.println(list);
//     // size
//     int size=list.size();
//     System.out.println(size);
//     // loop
//     for(int i=0; i<list.size(); i++){
//       System.out.println(list.get(i));
//     } 
//     System.out.println();
//     // sorting
//     Collections.sort(list);
//     System.out.println(list);

//   }
// }
// import java.util.ArrayList;
// public class DataStructure{
//   public static void main(String[] args) {
//     ArrayList<Integer> list=new ArrayList<Integer>();
//     list.add(0);
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     System.out.println(list);

//     // get process
//     int element= list.get(3);
//     System.out.println(element);

//     // set process
//     list.set(3, 9);
//     System.out.println(list);

//     // remove
//     list.remove(1);
//     System.out.println(list)
//     ;
//     int size=list.size();
//     System.out.println(size);
//     for(int i=0; i<list.size(); i++){
//     System.out.println(list.get(i));
//     }


//   }
// }
public class DataStructure{
  public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<Integer>();
    list.add(8);
    list.add(1);
    int element=list.get(0);
    System.out.println(element);
    list.set(0, 2);
    System.out.println(list);
    list.remove(1);
    System.out.println(list);
  }
}