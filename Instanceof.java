class Animal{

}
class Dog extends Animal{

}

public class Instanceof {
    public static void main(String args[]){
       Animal obj=new Dog();
       Dog obj1=(Dog) obj;
       System.out.println(obj instanceof Animal);
       System.out.println(obj1 instanceof Dog);
       System.out.println(obj instanceof Dog);
       System.out.println(obj1 instanceof Animal);
      //false
      Animal ref=new Animal();
      System.out.println(ref instanceof Dog);
    }
}
