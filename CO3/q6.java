//Create an interface having prototypes of functions area() and perimeter(). Create two
//classes Circle and Rectangle which implements the above interface. Create a menu driven
//program to find area and perimeter of objects.

import java.util.Scanner;

interface Shapes{

    void area();
    void perimeter();

}


class Circle implements Shapes{

    float radius;
    public Circle(float radius){
        
        this.radius = radius;

    }

    public void area(){

        System.out.println("Area of circle:");
        System.out.println(3.14 * radius * radius);

    }

    public void perimeter(){
     
        System.out.println("Perimeter of circle:");
        System.out.println(2 * 3.14 * radius);

    }
}


class Rectangle implements Shapes{

    float length,breadth;
    public Rectangle(float length, float breadth){

        this.length = length;
        this.breadth = breadth;
    }
  
    public void area(){

        System.out.println("Area of rectangle:");
        System.out.println(length*breadth);

    }

    public void perimeter(){
     
        System.out.println("Perimeter of rectangle:");
        System.out.println(2 * (length+breadth));

    }
    
}


class q6{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;

    do
  {
        System.out.println(" 1. Cicle\n 2. Rectangle\n 3. Exit program\n Enter your choice:\n");
        choice = sc.nextInt();


        switch(choice)
             {

                case 1:

                   System.out.println("Enter radius of the circle");
                   float radius = sc.nextInt();
                   Circle obj1 = new Circle(radius);
                   obj1.area();
                   obj1.perimeter();
                   break;
                
                case 2:
                
                    System.out.println("Enter length and breadth of the rectangle");
                    float length = sc.nextInt();
                    float breadth = sc.nextInt();
                    Rectangle obj2 = new Rectangle(length,breadth);
                    obj2.area();
                    obj2.perimeter();
                    break;

                case 3:
                
                    System.out.println("Exiting program...");
                    break;

                default:
                    
                    System.out.println("INVALID ENTRY!!");
                    break;
             }
  }   while(choice!=3);

  sc.close();

 }

}
