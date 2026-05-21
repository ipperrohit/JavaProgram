public class MultipleClasses {
    public static void Class1Method(){
        System.out.println("This is Method 1");
    }
    static  class demo2{
        public static void Demo2Method(){
            System.out.println("This is mathod 2");
        }
    }
     static class demo3{
        public static void Demo3Method(){
            System.out.println("This is mathod 3");
        }
    }
    public static void main(String args[]){
       MultipleClasses.Class1Method();
       demo2.Demo2Method();
       demo3.Demo3Method();
    }
}
