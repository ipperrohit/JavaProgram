public class NoArgumentMethod {
    public static void Sum(){
        int a=3,b=8;
        int c=a+b;
        System.out.println(c);
    }

    public void Addition(){
        int a=8,b=8;
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String args[]){
      NoArgumentMethod obj=new NoArgumentMethod();
      NoArgumentMethod.Sum();
      obj.Addition();
    }
}
