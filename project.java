import java.util.ArrayList;

public class project{
  public static void main(String[] args){
    Student stu = new Student();
    stu.add("Unexpected");
    stu.add("Rich Dad Poor Dad");
    stu.available();
    stu.issue("Rich Dad Poor Dad");
    stu.available();
    stu.returnBook("Rich Dad Poor Dad");
    stu.available();
  }
}
class Book{
  ArrayList<String> bookList = new ArrayList<>();
  ArrayList<Boolean> avlblty = new ArrayList<>();
}
class Library extends Book{
  void available(){
    System.out.println("  Available Books:");
    for(int i = 0; i < bookList.size(); i++){
      System.out.print("  " + (i+1) + ". " + bookList.get(i));
      if(avlblty.get(i) == true){
        System.out.println(" - Available");
      }else System.out.println(" - Not Available");
    }
  }
  void add(String book){
    bookList.add(book);
    avlblty.add(true);
    System.out.println("  " + book + " added to collection");
  }
}
class Student extends Library{
  void issue(String bookName){
    for(int i = 0; i < bookList.size(); i++){
      if(bookName.equals(bookList.get(i))){
        if(avlblty.get(i) == true){
          avlblty.set(i, false);
          System.out.println("  Book Successfully Issued");
          }else System.out.println("  Book Not Available");
          return;
        }
    }
    System.out.println("  Book Not Found");
  }
  void returnBook(String bookName){
    for(int i = 0; i < bookList.size(); i++){
      if(bookName.equals(bookList.get(i))){
        if(avlblty.get(i) == false){
          avlblty.set(i, true);
          System.out.println("  Book Successfully Returned");
          }else System.out.println("  Book Already Returned");
          return;
        }
    }
    System.out.println("  Book Not Found");
  }
}
