public class ConstructorChaining {
    ConstructorChaining(){
        System.out.println("No argument constructor");
    }
    ConstructorChaining(int a){
        this();
        System.out.println("Parametraized  argument constructor");
    }
    ConstructorChaining(String a){
        this(3);
        System.out.println("Parametraized byte argument constructor");
    }

    public static void main(String args[]){
      ConstructorChaining obj=new ConstructorChaining("Rohit");
    }
}
