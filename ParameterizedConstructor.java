public class ParameterizedConstructor {
    ParameterizedConstructor(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String args[]){
      ParameterizedConstructor obj=new ParameterizedConstructor(4,7);
      
    }
}
