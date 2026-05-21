public class NonStaticVarAccessability {
    int a=5;
    public  void show(){
        System.out.println(a);
    }
    public static void main(String args[]){
         NonStaticVarAccessability obj=new NonStaticVarAccessability();
         obj.show();
    }
}
