public class NonStaticVarToStaticBlock {
    int a=12;
    public static void show(){
        NonStaticVarToStaticBlock obj=new NonStaticVarToStaticBlock();
        System.out.println(obj.a);
    }
    public static void main(String args[]){
        show();
    }
}
