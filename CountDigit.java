import java.util.*;
public class CountDigit {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter NUmber");
     int N=sc.nextInt();
     int count=0;
     for(int i=N;i>0;i/=10){
        count++;
     }
     System.out.println(count);
    }
}
