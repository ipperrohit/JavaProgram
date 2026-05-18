import java.util.*;
public class ProductOfNum {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter num");
      int N=sc.nextInt();
      int product=1;
      for(int i=N;i>0;i/=10){
        int ld=i%10;
        product*=ld;
      }
      System.out.println(product);
    }
}
