import java.util.*;

public class q18 {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> hm = new HashMap<>();
        TreeMap<Integer,String> tm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int key;
        String value;


        System.out.println("Enter size of hashmap: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
           {

            System.out.println("Enter key: ");
            key = sc.nextInt();
            System.out.println("Enter value: ");
            value = sc.next();
            hm.put(key,value);   //putting key and value as a pair like a dictionary...

           }
        System.out.println(hm);

        tm.putAll(hm);    //coverting hashmap to treemap...

        System.out.println("\n TREEMAP: \n");  //displaying treemap...
        System.out.println(tm);
    }
}
