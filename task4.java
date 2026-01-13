import java.util.Scanner;

public class main{
  public static Scanner inp = new Scanner(System.in);
  public static void main(String[] args){
    User uzi = new User("uzi2011","123");
    uzi.login("uzi","123");
    uzi.login("uzi2011","1234");
    uzi.login("uzi2011","123");
  }
}
class User{
  private String user;
  private String password;
  User(String user, String password){
    this.user = user;
    this.password = password;
  }
  public void login(String user, String password){
    if(this.user.equals(user) && this.password.equals(password)){
      System.out.println("Logged In Successfully");
    }else{
      System.out.println("Invalid Credentials");
    }
  }
}
