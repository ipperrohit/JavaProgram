import java.util.*;
public class OddDigitInNum {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int N=sc.nextInt();
      OuterLoop:
      for(int i=N;i>0;i/=10){
        int ld=i%10;
        if(ld%2!=0){
           System.out.println(ld);
        }
      }
    }
}
