import java.util.*;

class login extends Exception
{
    login(String s)
      {
        super(s);
      }
}

class Authentication
{

    String username,password;

    public Authentication(String username, String password)
      {
         this.username = username;
         this.password = password;
      
      }

    public void check(String login_username, String login_password)
      {

         try
           {
            if(!username.equals(login_username)|!password.equals(login_password))
              {
                throw new login("Enter valid username or password!!");
              }

            else 
              {
                System.out.println("Login successfully!!");
              }
            }

         catch (login e)
            {

              System.out.println(e); 

            }

      }

}


public class q3 
{
    
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");  //setting password at first
        String username = sc.next();
        System.out.println("Enter password: ");  //setting password at first
        String password = sc.next();

        Authentication obj = new Authentication(username,password);

        System.out.println("Enter login username: ");  //entering username at the time of login
        String login_username = sc.next();
        System.out.println("Enter login password: ");  //entering password at the time of login
        String login_password = sc.next();  

        obj.check(login_username,login_password);

        sc.close();

     }

}



