import java.util.*;
public class BuzzNum {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int N=sc.nextInt();
      int ld=N%10;
      if(ld==7 || N%7==0){
        System.out.println("Buzz Number");
      }else {
        System.out.println("Not Buzz Number");
      }
    }
}
