package arithmetic;

  public class Arithmetic implements operations
  {
  

         public void add(int num1, int num2)  
      {

        System.out.printf("Result = "+(num1+num2));
      }  

      public void sub(int num1, int num2) 
          {

             System.out.printf("Result = " +(num1-num2));
          }  

            public void mult(int num1, int num2)
    {

        System.out.printf("Result =" +(num1*num2));

    }

      public void div(int num1, int num2)
    {

          System.out.printf("Result = "  +(num1/num2));
    }  

  }