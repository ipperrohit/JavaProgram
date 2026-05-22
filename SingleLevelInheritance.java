public class SingleLevelInheritance {
    class parent{
        public void parentClassMethod(){
            System.out.println("This is parent class method");
        }
        
    }
    class child extends parent{

    }
    public static void main(String args[]){
      SingleLevelInheritance obj=new SingleLevelInheritance();
      child obj1=obj.new child();
      obj1.parentClassMethod();

    }
}
