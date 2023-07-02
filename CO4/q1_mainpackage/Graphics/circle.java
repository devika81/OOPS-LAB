package Graphics;

public class circle implements Area{

   float radius;

   public circle(float radius)
      {

          this.radius = radius;
      }

   public void area()
      {

         System.out.println("Area of a circle = " +(3.14*radius*radius));
      }   
    
}
