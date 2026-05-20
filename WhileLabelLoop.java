import java.util.*;
public class WhileLabelLoop {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int N=1;
       OuterLoop:
       while(N<=10){
        
        System.out.println(N);
        N++;
       }
    }
}
