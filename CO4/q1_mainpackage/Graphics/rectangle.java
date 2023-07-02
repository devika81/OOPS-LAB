package Graphics;

public class rectangle implements Area {
    
    int length,breadth;

    public rectangle(int length,int breadth)
    {

           this.length = length;
           this.breadth = breadth;

    }

    public void area()
   {

           System.out.println("Area of a rectangle = " +(length*breadth)); 
   }     


}
