import java.util.*;
public class Power{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Base Value");
       int B=sc.nextInt();
       System.out.println("Enter raise value");
       int R=sc.nextInt();
       int Ans=1;
       if(R==0){
        System.out.println("1");
        
       }
       for(int i=1;i<=R;i++){
        Ans=Ans*B;
       }
    
       System.out.println(Ans);
    }
}