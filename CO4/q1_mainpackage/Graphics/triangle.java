package Graphics;

public class triangle implements Area{

       float base,height;

       public triangle(float base, float height)
       {

             this.base = base;
             this.height = height;
       }


       public void area()

          {

               System.out.println("Area of a triangle = " +(0.5*base*height));
          }
    

}
