
import java.util.*;

class q11 {

    public static void main(String[] args) {
        
        LinkedList <Integer> ll = new LinkedList<>();
        int choice,element;
        Scanner sc = new Scanner(System.in);

        do
          {
      
             System.out.println(" 1. ADD\n 2.REMOVE\n 3.REPLACE\n 4.ADD AT A SPECIFIC INDEX\n 5.SEARCH\n 6.DISPLAY\n 7.CLEAR\n Enter your choice:");
             choice = sc.nextInt();

             switch(choice)
                {
 
                   case 1:

                   System.out.println("Enter an element to be inserted:");
                   element = sc.nextInt();
                   ll.add(element);
                   break;

                   case 2:

                   System.out.println("Enter index in which the element will be removed:");
                   int index = sc.nextInt();
                   ll.remove(index);
                   break;

                   case 3:

                   System.out.println("Enter index in which the element will be replaced:");
                   index = sc.nextInt();
                   ll.set(index,10);
                   break;

                   case 4:

                   System.out.println("Enter index to which an element will be inserted:");
                   index = sc.nextInt();
                   System.out.println("Enter element to be inserted:");
                   element = sc.nextInt();
                   ll.add(index,element);
                   break;

                   case 5:

                   System.out.println("Enter an element to be searched");
                   element = sc.nextInt();
                     if(ll.contains(element))
                        System.out.println("ELEMENT FOUND!!");
                     else  
                        System.out.println("ELEMENT NOT FOUND!!");
                    break;
                    
                    case 6:

                    System.out.println("\n"+ll);
                    break;

                    case 7:

                    ll.clear();
                    break;

                    default:

                    System.out.println("INVALID ENTRY!!");
                    break;

                }

          }while(choice!=0);

          sc.close();

    }
}
    

