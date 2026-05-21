public class AccessNonStaticMethodToNonStaticBlock {
    public void first(){
        System.out.println("this is non static method");
    }
    public void second(){
        first();
    }
    public static void main(String args[]){
       AccessNonStaticMethodToNonStaticBlock obj=new AccessNonStaticMethodToNonStaticBlock();
       obj.second();
    }
}
