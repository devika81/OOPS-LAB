import java.util.Scanner;

interface Calc{

    void calculate();

}

class Bill implements Calc{

    int product_id;
    String product_name;
    int quantity;
    int unit_price;
    int total;

    public Bill(int product_id, String product_name, int quantity, int unit_price) {

        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }
   
    public void  calculate(){

        total = quantity * unit_price;
        System.out.print(" \t\t " +total+"\n");

    }

    public void display(){

        System.out.print("\n"+product_id+" \t\t "+product_name+" \t\t "+quantity+" \t\t "+unit_price);
        calculate();

    }
   
}


class q7{

    public static void main(String[] args) {
        
        int net_amount = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n = sc.nextInt();
        Bill b[] = new Bill[n];
        System.out.println("Enter details of product:");

        for(i=0;i<n;i++)
             {
 
                 System.out.println("Product id:");
                 int product_id = sc.nextInt();
                 System.out.println("Name of product:");
                 String product_name = sc.next();
                 System.out.println("Quantity:");
                 int quantity = sc.nextInt();
                 System.out.println("Unit price:");
                 int unit_price = sc.nextInt();
                 System.out.println();

                 b[i] = new Bill(product_id, product_name, quantity, unit_price);

             }

        System.out.println("Displaying details of product:\n");
        System.out.println("Product Id \t Name \t Quantity \t Unit price \t Total price");
        System.out.println("-------------------------------------------------------------------------");

        for(i=0;i<n;i++)
           {

                  b[i].display();
                  net_amount = net_amount + b[i].total;

           }

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Net. Amount:" +net_amount);

    }

}