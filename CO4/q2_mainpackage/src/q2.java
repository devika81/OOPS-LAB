
import java.util.Scanner;

import arithmetic.*;


public class q2 {
    
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
          int  choice,num1,num2;
         Arithmetic obj1 = new Arithmetic();

        do
          {

             System.out.println(" \n 1 for addition\n 2 for subtraction\n 3 for multiplication\n 4 for division\n Enter your choice:");
             choice = sc.nextInt();

             switch(choice)
                {

                    case 1:
                    System.out.println("Enter 2 numbers:");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    
                    obj1.add(num1, num2);
                    break;

                    case 2:
                    System.out.println("Enter 2 numbers:");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    obj1.sub(num1, num2);
                    break;

                    case 3:
                    System.out.println("Enter 2 numbers:");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                   
                    obj1.mult(num1, num2);
                    break;

                    case 4:
                    System.out.println("Enter 2 numbers:");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                   
                    obj1.div(num1, num2);
                    break;

                    case 0:
                    break;

                    default:
                    System.out.println("INVALID ENTRY!!");
                    break;

                }

          }  while(choice!=0);
    }
}
