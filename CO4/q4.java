import java.util.*;

class Userexception extends Exception
  {
     Userexception(String s)
        {
            super(s);
        }
  }


public class q4
{

   
    public static void main(String[] args) 
    {
        int i ,limit,numbers,sum=0,average;

        Scanner sc = new Scanner(System.in);

        System.out.println("How manu numbers?");
        limit = sc.nextInt();
        try
        {
        System.out.println("Enter the numbers: ");
        for(i=1; i<=limit ; i++)
           {

                numbers = sc.nextInt();
                
                if(numbers<0)
                  {
                      throw new Userexception("Negative numbers are invalid!!");
                  }

                else
                {
                       sum = sum + numbers;
                }  

           }
        
        average = sum/limit;
        
        System.out.printf("Average = " + average);
        }
        
        catch(Userexception e)
        {
            System.out.println(e);
        }

        sc.close();

    }

}
