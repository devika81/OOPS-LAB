package Graphics;

public class square implements Area {

     int side;

     public square(int side)
       {

             this.side = side;
       }

     public void area()
      {

             System.out.println("Area of a squaree = " +(side*side));

      }
      
}
