import java.util.Scanner;
public class EvenSumInDigit {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number");
       int N=sc.nextInt();
       int Esum=0;
       for(int i=N;i>0;i/=10){
        int ld=i%10;
        if(ld%2==0){
            Esum+=ld;
        }
       }
       System.out.println(Esum);
    }
}
