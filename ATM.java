// import java.util.Scanner;

// import javax.swing.plaf.basic.BasicMenuUI.ChangeHandler;

// public class ATM{
//     public static void main(String[] args) {
//         int PIN,Chacking_balance,cash_withdraw,mini_statement,withdraw;
//         int Total_Balance=1000;
//         Scanner fir=new Scanner(System.in);
//         System.out.println("Enter the PIN");
//         int pin=fir.nextInt();
//         if(pin==6969){
//             System.out.println("Choose_option \n1 checking balance\n2 cash_withdraw\n3 mini_statement\n4 transfer_amount");
//             Scanner sc=new Scanner(System.in);
//             int choose_option=sc.nextInt();
//             switch(choose_option){
//                 case 1:
//                 System.out.printf("Your total Balance is =%d",Total_Balance);
//                 break;
//                 case 2:
//                 System.out.println("Enter the cash withdraw amount");
//                 Scanner thi=new Scanner(System.in);
//                 int draw=thi.nextInt();
//                 Total_Balance-=draw;
//                 System.out.printf("The withdraw amount is =%d and the total balance is=%d",draw,Total_Balance);
//                 break;
//                 case 3:
//                 System.out.println("Mini statement is:");
//                 break;
//                 case 4:
//                 System.out.println("Enter the Transfer amount ");
//                 Scanner four=new Scanner(System.in);
//                 int transfer=sc.nextInt();
//                 Total_Balance-=transfer;
//                 System.out.printf("The transfer amount is =%d and the totla balance is =%d ",Total_Balance,transfer);
//                 break;
//                 default:
//                 System.out.println("Sorry");
//             }
            
//         }else{
//             System.out.println("Sorry input wrong");
//         }
//         }
// }
import java.util.Scanner;;
public class ATM{
  public static void main(String[] args) {
    System.out.println("*****  Welcome to Meezan Bank ATM!  ******");
    int total_balance=1000;
    System.out.println("Please Enter Your Pin code...!");
    Scanner code=new Scanner(System.in);
    int pin=code.nextInt();
    if(pin==1000){
      System.out.println("Choose Option....!\n press 1: Chacking_Balance\n press 2: cash_withdraw\n press 3: Transfer_Amount\n press 4: Mini_Statement");
      Scanner option=new Scanner(System.in);
      int choose_option=option.nextInt();
      switch(choose_option){
        case 1:
        System.out.println("Your Current Amount is:"+total_balance);
        break;
        case 2:
        System.out.println("Enter your With_Draw Amount here..");
        Scanner draw=new Scanner(System.in);
        int withdraw=draw.nextInt();
        total_balance-=withdraw;
        System.out.printf("Your Current balance is: %d\n your withdraw amount is: %d\n",total_balance,withdraw);
        break;
        case 3:
        System.out.println("Enter the Reciver Account Code");
        Scanner transfer=new Scanner(System.in);
        int transfer_amounts=transfer.nextInt();
        System.out.println("Enter the Account Holder Name of Receiver");
        Scanner re=new Scanner(System.in);
        String receiver=re.next();
        System.out.println("Enter the Purpose t Sent Money");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println("Enter the Amount is here:");
        Scanner obj=new Scanner(System.in);
        int b=sc.nextInt();
        System.out.println("Are you sure to select (y/N) press Yes or No");
        Scanner thi=new Scanner(System.in);
        String c=thi.next();
        if(c.startsWith("y")){
        total_balance-=b;
          System.out.printf("Your Current Balance is: %d\n  Transfer Amunt is: %d\n",total_balance,b);
          System.out.println("The Receiver Account Code is************");
          System.out.println("Account Holder Name is:"+receiver);
          System.out.println("Purpose is:"+a);
        }else if(c.startsWith("N")){
          System.out.println("Your Amount is Back on your Account");
          
        }else{
          System.out.println("Soory Dont have any Account!");
        }
        break;
        case 4:
        System.out.println("Sorry Dont gave Mini_statement Found");
        break;
        default :
        System.out.println("Sorry");
        break;
      }
    }
    
    }
  }