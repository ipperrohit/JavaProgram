public class AAA {
    public static void main(String args[]){
       demo1 obj=new demo1();
       obj.Demo1Method();
       demo2 obj2=new demo2();
       obj2.Demo2Method();
       demo3 obj3=new demo3();
      
       obj3.Demo3Method();
    }
}
 class demo1{
    public static void Demo1Method(){
        System.out.println("Method one");
    }
}
class demo2{
    public static void Demo2Method(){
        System.out.println("Method two");
    }
}
class demo3{
    public static void Demo3Method(){
        System.out.println("Method three");
    }
}
