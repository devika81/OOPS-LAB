import java.util.Scanner;


class q1{
    
    public void area(int radius)
    {
      double result=3.14*radius*radius;
      System.out.println("Area=");
      System.out.println(result);  
    }

   public void area(int length,int breadth)
    {
     int result = length*breadth;
     System.out.println("Area=");
     System.out.println(result);
    }
    
 
    public static void main(String args[]){

        System.out.println(" 1 for finding area of circle\n 2 for finding area of rectangle\n Enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
    
        switch(choice)
           {

             case 1:
             System.out.println("Enter radius");
             int radius = sc.nextInt();
             q1 obj1 = new q1();
             obj1.area(radius);
             break;
             case 2:
             System.out.println("Enter length and breadth");
             int length = sc.nextInt();
             int breadth = sc.nextInt();
             q1 obj2 = new q1();
             obj2.area(length,breadth);

           }
           
    }
}