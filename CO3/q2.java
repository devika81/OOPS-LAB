import java.util.Scanner;

class Employee{
    int Empid;
    String Name;
    int Salary;
    String Address;

    public Employee(int Empid,String Name,int Salary,String Address){
        this.Empid=Empid;
        this.Name=Name;
        this.Salary=Salary;
        this.Address=Address;
    }

}
class Teacher extends Employee{
    String department;
    String subjects;

    public Teacher(int Empid,String Name,int Salary,String Address,String department,String subjects){
         super(Empid, Name, Salary, Address);
         this.department=department;
         this.subjects=subjects;
    }
    
    
    public void display(){
                System.out.println("Employee id:"+Empid);
                System.out.println("name:"+Name);
                System.out.println("Salary:"+Salary);
                System.out.println("address:"+Address);
                System.out.println("department:"+department);
                System.out.println("subjects:"+subjects);
             }


}

public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();
        Teacher teachers[] = new Teacher[n];
        
        for(int i=0;i<n;i++){

            System.out.println("Enter employee id,name,salary,address,department,subjects of person "+(i+1));
            int Empid = sc.nextInt();
            String Name = sc.next();
            int Salary = sc.nextInt();
            String Address = sc.next();
            String department = sc.next();
            String subjects = sc.next();

           teachers[i] = new Teacher( Empid,Name,Salary,Address,department,subjects);

    }

    System.out.println("Details:");
    for(int i=0;i<n;i++)
      {
        teachers[i].display();
        System.out.println("*************************************************");
      }
   
    
}

}