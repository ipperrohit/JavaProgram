public class MultipleInheritance {
    class Grantparent{
        public void GrantParentMethod(){
            System.out.println("this is Grantparent class method");
        }
    }
    class parent extends Grantparent{
        public void ParentMethod(){
            System.out.println("this is Parent mathod");
        }
    }
    class child extends parent{
        public void childMethod(){
            System.out.println("This is child class method");
        }
    }
    public static void main(String args[]){
       
        MultipleInheritance obj=new MultipleInheritance();
       
       child obj3=obj.new child();
       obj3.childMethod();
       obj3.GrantParentMethod();
    }
}
