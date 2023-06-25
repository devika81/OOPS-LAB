import java.util.*;

public class q12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int choice,element;

        do 
          {

            System.out.println(" 1.Push\n 2.Pop\n 3.Peek\n 4.Display\n Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
               {
                   case 1:

                   System.out.println("Enter element to be inserted");
                   element = sc.nextInt();
                   stack.push(element);
                   break;

                   case 2:

                   System.out.println("Enter the index in which the element will be deleted");
                   element = sc.nextInt();
                   stack.remove(element);
                   break;

                   case 3:

                   System.out.println("Top element: " +stack.peek() );
                   break;

                   case 4:

                   System.out.println("\n"+ stack);
                   break;

                   default:

                   System.out.println("INVALID ENTRY!!");
                   break;

               }

          }while(choice!=0);

          sc.close();
    }
}
