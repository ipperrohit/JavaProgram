public class HierarchicalInheritance {
    class parent{
        public void ParentMethod(){
            System.out.println("This is Parent class method");
        }
    }
    class child1 extends parent{
        public void child1Method(){
                System.out.println("this is chil1 method");
        }
    }
    class child2 extends parent{
        public void child2Method(){
                System.out.println("this is chil2 method");
        }
    }
    class child3 extends parent{
        public void child3Method(){
                System.out.println("this is chil3 method");
        }
    }
    public static void main(String args[]){
        HierarchicalInheritance obj=new HierarchicalInheritance();
        child3 obj1=obj.new child3();
        obj1.ParentMethod();
        obj1.child3Method();
    }
}
