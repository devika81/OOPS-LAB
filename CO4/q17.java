import java.util.*;

public class q17 {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice,key;
        String value;

        do 
          {
 
            System.out.println(" 1.ADD\n 2.REMOVE\n 3.REPLACE\n 4.DISPLAY\n ENTER YOUR CHOICE:");
            choice = sc.nextInt();

            switch(choice)
               {

                  case 1:
                  System.out.println("Enter key: ");
                  key = sc.nextInt();
                  System.out.println("Enter value: ");
                  value = sc.next();
                  hm.put(key, value);
                  break;

                  case 2:

                  System.out.println("Enter key to be removed: ");
                  key = sc.nextInt();
                  hm.remove(key);
                  break;

                  case 3:
                  
                  System.out.println("Enter key: ");
                  key = sc.nextInt();
                  System.out.println("Enter value to be replaced: ");
                  value = sc.next();
                  hm.replace(key, value);
                  break;

                  case 4:

                  System.out.println(hm);
                  break;

                  default:

                  System.out.println("INVALID ENTRY!!");
                  break;

               }

          } while(choice!=0);

            sc.close();
    }
}
