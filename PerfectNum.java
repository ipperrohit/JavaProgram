import java.util.*;
public class PerfectNum {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int N=sc.nextInt();
    int FactSum=0;
    for(int i=1;i<N;i++){
        if(N%i==0){
            FactSum=FactSum+i;
        }
    }
    if(N==FactSum){
        System.out.println("Perfect Number");
    }else{
        System.out.println("Not Perfect Num");
    }
   }
}
