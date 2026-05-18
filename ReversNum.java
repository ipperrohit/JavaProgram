import java.util.*;
public class ReversNum {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter n");
       int N=sc.nextInt();
       int rev=0;
       for(int i=N;i>0;i/=10){
        int ld=i%10;
        rev=rev*10+ld;
       }
       System.out.println(rev);
    }
}
