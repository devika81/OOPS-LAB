//Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle,
//Square and Circle. Test the package by finding the area of these figures


//package src;
import Graphics.*;

import java.util.*;

class q1{

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            int choice;
            
            
            do
            {
                System.out.println(" 1 for rectangle\n 2 for triangle\n 3 for square\n 4 for circle\n Enter your choice:");
            
                choice = sc.nextInt();

                 switch(choice)
                   {

                       case 1:
                       System.out.println("Enter length and breadth of a rectangle:");
                       int length = sc.nextInt();
                       int breadth = sc.nextInt();
                       rectangle rect = new rectangle(length, breadth);
                       rect.area();
                       break;
                       
                       case 2:
                       System.out.println("Enter base and height of a triangle:");
                       float base = sc.nextFloat();
                       float height = sc.nextFloat();
                       triangle tri = new triangle(base,height);
                       tri.area();
                       break;

                       case 3:
                       System.out.println("Enter side of a square:");
                       int side = sc.nextInt();
                       square sq = new square(side);
                       sq.area();
                       break;

                       case 4:
                       System.out.println("Enter radius of a circle:");
                       int radius = sc.nextInt();
                       circle c = new circle(radius);
                       c.area();
                       break;

                       case 0:
                       break;

                       default:
                       System.out.println("INVALID ENTRY!!");

                   }

             }while(choice!=0);
    
        }

    }




