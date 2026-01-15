public class project{
  public static void main(String[] args){
  }
}
class Book{
  private ArrayList<String> bookList = new ArrayList<>[];
  private ArrayList<boolean> avlblty = new ArrayList<>[];
}
class Library extends Book{
  void available(){
    System.out.print("  Available Books");
    for(int i = 0; i < bookList.size(); i++){
      System.out.println("  " + (i+1) + ". " + bookList.get(i));
    }
  }
  void add(String book){
    bookList.add(book);
    avlblty.add(true);
    System.out.print("  " + book + " added to collection");
  }
}
class Student extends Library{
  void issue(String bookName){
    for(int i = 0; i < bookList.size(); i++){
      if(avlblty.get(i) == true){
        if(bookName.equals(bookList.get(i)){
          avlblty.get(i) = false;
          System.out.println("  Book Successfully Issued");
        }else System.out.println("  Book Not Found");
      }else System.out.println("  Book Not Available");
    }
  }
  void return(String bookName){
    for(int i = 0; i < bookList.size(); i++){
      if(avlblty.get(i) == false){
        if(bookName.equals(bookList.get(i)){
          avlblty.get(i) = true;
          System.out.println("  Book Successfully Returned");
        }else System.out.println("  Book Not Found");
      }else System.out.println("  Book Already Returned");
    }
  }
}
