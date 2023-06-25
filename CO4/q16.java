import java.util.*;

public class q16 {
    
    public static void main(String[] args) {
        
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        int n1,n2,element,i;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of elements in hashset1: ");
        n1 = sc.nextInt();
        for(i=0;i<=n1;i++)
           {
             System.out.println("Enter element: ");
             element = sc.nextInt();
             hs1.add(element);
           }

        
        System.out.println("Enter number of elements in hashset2: ");
        n2 = sc.nextInt();
        for(i=0;i<=n2;i++)
           {
             System.out.println("Enter element: ");
             element = sc.nextInt();
             hs2.add(element);
           }   

        //displaying both hashsets...
        System.out.println("Hashset1: " +hs1);
        System.out.println("Hashset2: " +hs2);

        //Checking both hashsets are equal...
        if(n1==n2)
          {

            Boolean bool = hs1.equals(hs2);

            if(bool)
             {
                System.out.println("Both hashsets are equal...");
             }

             else
             {
                System.out.println("Both hashsets are not equal...");
             }

          }
        sc.close();
    }
}
