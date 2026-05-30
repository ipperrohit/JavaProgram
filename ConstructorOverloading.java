public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("This is 1st Constructor");
    }
    ConstructorOverloading(int a){
        super();
        
    }
    ConstructorOverloading(byte a){
      super();
        
    }
    public static void main(String args[]){
      ConstructorOverloading obj=new ConstructorOverloading();
      ConstructorOverloading obj1=new ConstructorOverloading();
      ConstructorOverloading obj2=new ConstructorOverloading(5);
    }
}
