import java.util.*;

public class q13 {
    
    public static void main(String[] args) {
        
        int choice,element;
        Queue<Integer> queue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        
        do 
          {
  
             System.out.println(" 1.Push\n 2.Pop\n 3.Peek\n 4.Display\n Enter your choice:");
             choice = sc.nextInt();

             switch(choice)
                {

                    case 1:

                    System.out.println("Enter element to be inserted:");
                    element = sc.nextInt();
                    queue.offer(element);
                    break;

                    case 2:
                    
                    queue.poll();
                    System.out.println("DELETED SUCCESSFULLY!!");
                    break;

                    case 3:

                    System.out.println("Top element: " +queue.peek());
                    break;

                    case 4:

                    System.out.println("\n" +queue);
                    break;

                    default:

                    System.out.println("INVALID ENTRY!!");
                    break;
                }
          }while(choice!=0);
    }
}
