import java.util.*;
public class DigitInNum {
    public static void main(String args[]){
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter Digit");
       int D=sc.nextInt();
       System.out.println("Enter Number");
       int N=sc.nextInt();
       boolean result=false;
       for(int i=N;i>0;i/=10){
        int ld=i%10;
        if(D==ld){
            result=true;
            break;
        }
       }
       if(result==true){
        System.out.println("Digit is there in number");

       }else{
        System.out.println("Digit is not there in number");
       }
    }
}
