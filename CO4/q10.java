import java.util.*;

class q10{

    public static void main(String[] args) {
    
        ArrayList <String> list = new ArrayList<>();
        int choice;
        String x;
        Scanner sc = new Scanner(System.in);

        do 
         {

            System.out.println(" 1. Add\n 2. Remove\n 3. Replace\n 4.display\n Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
               {

                case 1:

                   System.out.println("Enter a string to be inserted:");
                   x = sc.next();
                   list.add(x);
                   break;

                case 2:
                
                   System.out.println("Enter the string to be removed:");
                   x = sc.next();
                   list.remove(String.valueOf(x));
                   break;

                case 3:
                
                   System.out.println("Enter the index to which an element will be replaced:");
                   int index = sc.nextInt();
                   list.set(index, "a");
                   break;

                case 4:

                    System.out.println(list);
                    break;

                default:
                   
                   System.out.println("INVALID ENTRY!!");
                   break;
                   
               }
   
        }while(choice!=4);

        sc.close();



    }



}

