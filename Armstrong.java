import java.util.*;
public class Armstrong {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       int N=sc.nextInt();
       int count=0;
       for(int i=N;i>0;i/=10){
        count++;
       }
       int pow=0;
       for(int i=N;i>0;i/=10){
        int ld=i%10;
          pow=pow+(int)Math.pow(ld,count);
       }
       if(N==pow){
        System.out.println("Armstrong number");
       }else{
        System.out.println("Not");
       }
    }
}
