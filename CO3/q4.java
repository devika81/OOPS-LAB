//Write a program has class Publisher, Book, Literature and Fiction. Read the information
//and print the details of books from either the category, using inheritance.


import java.util.Scanner;


class Publisher{
   
    String publication_name;


    public Publisher(String publication_name){
        this.publication_name = publication_name;
    }
}


class Book extends Publisher{


    String author;
    int price;


    public Book(String publication_name,String author, int price){
    
        super(publication_name);
        this.author = author;
        this.price = price;
    }
}


class Literature extends Book{


    String genre;
    String book_name;


    public Literature(String publication_name,String author,int price,String genre,String book_name){
        super(publication_name,author,price);
        this.genre = genre;
        this.book_name = book_name;
    }

    public void display(){
       System.out.println("**********************************************************************");
       System.out.println("Details of literature:");
       System.out.println();
       System.out.println("Name of publication: " +publication_name);
       System.out.println("Name of author: " +author);
       System.out.println("Price of book: " +price);
       System.out.println("Genre of book: " +genre);
       System.out.println("Name of book: " +book_name);
       System.out.println("**********************************************************************");
    
    }
}

class Fiction extends Book{

    
     String genre;
     String book_name;


     public Fiction(String publication_name,String author,int price,String genre,String book_name){
        super(publication_name,author,price);
        this.genre = genre;
        this.book_name = book_name;
    }



    public void display(){
       System.out.println("**********************************************************************");
       System.out.println("Details of fiction:");
       System.out.println();
       System.out.println("Name of publication: " +publication_name);
       System.out.println("Name of author: " +author);
       System.out.println("Price of book: " +price);
       System.out.println("Genre of book: " +genre);
       System.out.println("Name of book: " +book_name);
       System.out.println("**********************************************************************");
    }
}




class q4{
    public static void main(String[] args) {
       
        System.out.println(" 1 for literature\n 2 for fiction\n Enter your choice:\n ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
              {
                case 1:
               
                System.out.println("Enter name of publication, name of author, price, genre, name of book[LITERATURE]");

                String publication_name1 = sc.next();
                String author1 = sc.next();
                int price1 = sc.nextInt();
                String genre1 = sc.next();
                String book_name1 = sc.next();
             
                Literature l = new Literature(publication_name1,author1,price1,genre1,book_name1);
                l.display();
                break;

                case 2:
                
                System.out.println("Enter name of publication, name of author, price, genre, name of book[FICTION]");

                String publication_name2 = sc.next();
                String author2 = sc.next();
                int price2 = sc.nextInt();
                String genre2 = sc.next();
                String book_name2 = sc.next();

                Fiction f = new Fiction(publication_name2,author2,price2,genre2,book_name2);

                f.display();
                break;

              }
              sc.close();
    }
}
   
