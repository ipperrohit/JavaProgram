import java.util.*;
class Student{
      String name;
      int rollno;
      char div;
      boolean result;

      Student(String name,int rollno,char div,boolean result){
        this.name=name;
        this.rollno=rollno;
        this.div=div;
        this.result=result;
      }

      public  void Display(){
        System.out.println("name"+name);
        System.out.println("rollno"+rollno);
        System.out.println("div"+div);
        System.out.println("result"+result);
      }
}
public class Array {

    public static void main(String args[]){
            Student obj=new Student("Rohit",53,'A',true);
            obj.Display();
        }
}
