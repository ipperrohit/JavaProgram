import java.util.*;
public class SpyNum {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int N=sc.nextInt();
      int Sum=0;
      int product=1;
      for(int i=N;i>0;i/=10){
        int ld=i%10;
        Sum=Sum+ld;
        product=product*ld;
      }
      if(Sum==product){
        System.out.println("Spy Number");
      }else{
        System.out.println("Not Spy");
      }
    }
}
