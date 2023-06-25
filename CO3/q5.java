//Create classes Student and Sports. Create another class Result inherited from Student and
//Sports. Display the academic and sports score of a student.

import java.util.Scanner;

class Student{

         String student_name;
         int roll_no;

     public Student(String student_name,int roll_no){
      
        this.student_name = student_name;
        this.roll_no = roll_no;
    
     }

}



class Sports extends Student{
      
         String name_of_sports;
         String grade_scored;

    public Sports(String student_name,int roll_no,String name_of_sports,String grade_scored){
         
         super(student_name,roll_no);
         this.name_of_sports = name_of_sports;
         this.grade_scored = grade_scored;

    }


}



class Result extends Sports{

        int marks_scored;

    public Result(String student_name,int roll_no,String name_of_sports,String grade_scored,int marks_scored){

        super(student_name,roll_no,name_of_sports,grade_scored);
        this.marks_scored = marks_scored;
    }


    void display(){

        System.out.println("********************************************************************");
        System.out.println("Name of student: " +student_name);
        System.out.println("Roll number: " +roll_no);
        System.out.println("Name of sports: " +name_of_sports);
        System.out.println("Grade scored: " +grade_scored);
        System.out.println("Marks scored: " +marks_scored);
        System.out.println("********************************************************************");

    }

}





public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name,roll number,name of sports,grade,marks");

        String student_name = sc.next();
        int roll_no = sc.nextInt();
        String name_of_sports = sc.next();
        String grade_scored = sc.next();
        int marks_scored = sc.nextInt();

        Result r = new Result(student_name,roll_no,name_of_sports,grade_scored,marks_scored);

        r.display();
        
    }
}
