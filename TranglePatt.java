import java.util.*;
public class TranglePatt {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter num");
      int N=sc.nextInt();
      for(int i=0;i<N;i++){
          for(int j=0;j<i;j++){
            System.out.print("*");
          }
          System.out.println();
      }
    }
}
