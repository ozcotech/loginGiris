import java.util.Scanner;
/**
 * loginGiris
 */
public class loginGiris {
  public static void main(String[] args) {

  String userName, password, islem, newPassword;

  Scanner info = new Scanner(System.in);

  System.out.print("Enter Username: ");

  userName = info.nextLine();

  System.out.print("Enter Password: ");

  password = info.nextLine();

  if (userName.equals("ozkan") && (password.equals("123456"))){

    System.out.println("Login Success..");
  }
    else {
      System.out.println("Something went wrong, please check your information..\n");

      System.out.println("If you don't remember your password, enter '1' to reset your password(remember: the new password must not be the same as the old password)\n\nIf you want to enter the current password, correctly enter'2'");

      islem = info.nextLine();

      switch (islem) {

        case "1":

          System.out.print("Enter New Password: ");

          newPassword = info.nextLine();

          if (newPassword.equals("123456")){

          System.out.println("New Password Not Created, please enter new password.");

            System.out.print("Enter New Password: ");

            newPassword = info.nextLine();

            if (!newPassword.equals("123456")){

              System.out.println("New Password Created. Enter username and new password");

              System.out.print("Enter Username: ");

              userName = info.nextLine();

              System.out.print("Enter New Password: ");
              
              newPassword = info.nextLine();
              
              System.out.println("Login Success..");
              
            }
          }  
            else{
             System.out.println("New Password Created. \nEnter username and new password");

             System.out.print("Enter Username: ");

             userName = info.nextLine();

             System.out.print("Enter New Password: ");

             newPassword = info.nextLine();

             System.out.println("New Password Created and login success..");
             
          }
          
          break;
      
        default:
          System.out.print("Enter Correct Password Again: ");

          password = info.nextLine();

          if (password.equals("123456")){

          System.out.println("Login Success..");

          }
          break;
      }
      
    }

  info.close();

  }
  
}

