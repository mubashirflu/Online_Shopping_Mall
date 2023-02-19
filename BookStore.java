import javax.naming.spi.DirObjectFactory;

// class Liberary{
//     String[] Books;
//     int no_of_books;
//     Liberary(){
//         this.Books=new String[100];
//         this.no_of_books=0;
//     }
//     void addbook(String books){
//         this.Books[no_of_books]=books;
//         no_of_books++;
//         System.out.println(books+"Has been Added");
//     }
//     void showAvailableBooks(){
//         System.out.println("Available Book are:");
//         for(String Books:this.Books){
//             if(Books==null){
//                 continue;
//             }
//             System.out.println("*"+Books);
//         }
//     }
//     void issuedBooks(String Books){
//         for(int i=0; i<this.Books.length; i++){
//             if(this.Books[i].equals(Books)){
//                 System.out.println("The books has been added");
//                 this.Books[i]=null;
//                 return;
//             }
//         }
//         System.out.println("This books Dosent not Exists");
//     }
//     void returnbooks(String Books){
//         addbook(Books);
//     }
//     public void issueBook(String string) {
//     }
// }
// public class BookStore{
//     public static void main(String[] args) {
//         Liberary centralLibrary = new Liberary();
//                 centralLibrary.addbook("Think and grow Rich");
//                 centralLibrary.addbook("Algorithms");
//                 centralLibrary.addbook("C++");
//                 centralLibrary.showAvailableBooks();
        
//                 centralLibrary.issueBook("C++");
//                 centralLibrary.showAvailableBooks();
//                 centralLibrary.returnbooks("C++");
//                 centralLibrary.showAvailableBooks();       
//     }
// }