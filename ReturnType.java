public class ReturnType {
    public static float Sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String args[]){
      ReturnType.Sum(1,3);
      System.out.println(ReturnType.Sum(1,3));
    }
}
