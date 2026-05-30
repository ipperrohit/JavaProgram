class Animal{
    public void AnimalMethod(){
        System.out.println("This is animal class Method");
    }
}
class Dog extends Animal{
    public void DogMethod(){
        System.out.println("This is Dog class method");
    }
}
public class UpCasting {
    public static void main(String args[]){
      Animal obj=new Dog();
      obj.AnimalMethod();
    }
}
