public class MethodOverriding {
    class parent{
        public void ParentMethod(){
            System.out.println("This is parent class method");
        }
    }
    class child extends parent{
       // @Override
         public void ParentMethod(){
            System.out.println("This is child class method");
        }
    }
    public static void main(String args[]){
      MethodOverriding obj=new MethodOverriding();
      parent obj1=obj.new child();
      obj1.ParentMethod();
      
    }
}
