import java.util.Scanner;

class Person{
    String name;
    String gender;
    String address;
    int age;

    

    public Person(String name,String gender,String address,int age){
          this.name = name;
          this. gender = gender;
          this.address = address;
          this.age = age;
    }
}

class Employee extends Person{
    int empid;
    String company_name;
    String qualification;
    int salary;

    public Employee(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.company_name=company_name;
        this.qualification=qualification;
        this.salary=salary;
    }
}

class Teacher extends Employee{
   String subject;
   String department;
   int teacherid;

   public Teacher(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary,String subject,String department,int teacherid){
    super(name,gender,address,age,empid,company_name,qualification,salary);
    this.subject=subject;
    this.department=department;
    this.teacherid=teacherid;
   }

    public void display(){
         System.out.println("Name:"+name);
         System.out.println("gender:"+gender);
         System.out.println("address:"+address);
         System.out.println("age:"+age);
         System.out.println("empid:"+empid);
         System.out.println("company_name:"+company_name);
         System.out.println("qualification:"+qualification);
         System.out.println("salary:"+salary);
         System.out.println("subject"+subject);
         System.out.println("department:"+department);
         System.out.println("teacherid:"+teacherid);
    }
   }


class q3{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n =sc.nextInt();
        Teacher teachers[]=new Teacher[n];
        

        for(int i=0;i<n;i++){

        System.out.println("Enter name,gender,address,age,empid,comapany_name,qualification,salary,subject,department,teacherid of person"+(i+1));
        String name = sc.next();
        String gender = sc.next();
        String address = sc.next();
        int age = sc.nextInt();
        int empid = sc.nextInt();
        String company_name = sc.next(); 
        String qualification = sc.next();
        int salary = sc.nextInt();
        String subject = sc.next();
        String department = sc.next();
        int teacherid = sc.nextInt();

        teachers[i] = new Teacher(name, gender,address, age, empid, company_name, qualification, salary, subject, department, teacherid);

        }
       
        System.out.println("Details:");
        for(int i=0;i<n;i++){
            teachers[i].display();
            System.out.println("***************************************");
        }

    }
}