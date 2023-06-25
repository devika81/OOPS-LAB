import java.util.*;

public class q15 {
    
    public static void main(String[] args) {
        
        Set<Integer> hs1 = new LinkedHashSet<>();
        Set<Integer> hs2 = new LinkedHashSet<>();

        Scanner sc = new Scanner(System.in);
        int choice,element,n;

        do 
          {
   
            System.out.println(" 1.INSERT HASHSET1\n 2.INSERT HASHSET2\n 3.REMOVE\n 4.UNION\n 5.INTERSECTION\n 6.SUBSET\n 7.SIZE\n ENTER YOUR CHOICE:");
            choice = sc.nextInt();
            
            switch(choice)
               {

                  case 1:

                  System.out.println("Enter number of elements in hashset1:");
                  n = sc.nextInt();
                  for(int i=0;i<n;i++)
                     {
                        System.out.println("Enter element:");
                         element = sc.nextInt();
                         hs1.add(element);
                     }
                  break;

                   case 2:

                  System.out.println("Enter number of elements in hashset2:");
                  n = sc.nextInt();
                  for(int i=0;i<n;i++)
                     {
                        System.out.println("Enter element:");
                         element = sc.nextInt();
                         hs2.add(element);
                     }
                  break;

                   case 3:

                    System.out.println("Enter element to be deleted: ");
                    element = sc.nextInt();
                    hs1.remove(element);
                    break;

                    case 4:

                    hs1.addAll(hs2);
                    System.out.println("UNION: " +hs1);
                    break;

                    case 5:

                    hs1.retainAll(hs2);
                    System.out.println("INTERSECTION: " +hs1);
                    break;

                    case 6:

                    System.out.println(hs1.containsAll(hs2));
                    break;

                    case 7:

                    System.out.println("SIZE OF HASHSET1: "+hs1.size());
                    System.out.println("SIZE OF HASHSET2: " +hs2.size());
                    break;

                    default:
                     
                    System.out.println("INVALID ENTRY!!");
                    break;

               }

          } while(choice!=0);

          sc.close();
    }
}
