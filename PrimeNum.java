import java.util.*;
public class PrimeNum {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       int N=sc.nextInt();
       if(N==2){
        System.out.println("Prime number");
       }else{
        boolean result=true;
        for(int i=2;i<N;i++){
            if(N%i==0){
                result=false;
                break;
            }
        }
        if(result==true){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime number");
        }
       }
    }
}
