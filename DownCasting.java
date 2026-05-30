class Animal{
    public void AnimalMethod(){
        System.out.println("this is Animal class method");
    }
}

class Dog extends Animal{
    public void DogMethod(){
        System.out.println("This is Dog class method");
    }
}
public class DownCasting{
    public static void main(String args[]){
        Animal obj=new Dog();
        Dog obj1=(Dog) obj;
        obj1.DogMethod();
    }
}