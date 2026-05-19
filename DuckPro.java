import java.util.*;
public class DuckPro{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int N=sc.nextInt();
        boolean result=false;
        for(int i=N;i>0;i/=10){
            int ld=i%10;
            if(ld==0){
               result=true;
               break;
            }
        }
        if(result==true){
            System.out.println("Duck Number");
        }else{
            System.out.println("Not Duck Number");
        }
    }
}