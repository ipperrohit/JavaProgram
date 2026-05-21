public class staticVarToNonStaticBlock {
    static int a=13;
    public void show(){
        
        staticVarToNonStaticBlock obj=new staticVarToNonStaticBlock();
        System.out.println(a);
    }
    public static void main(String args[]){
         staticVarToNonStaticBlock obj1=new staticVarToNonStaticBlock();
         obj1.show();
    }
}
