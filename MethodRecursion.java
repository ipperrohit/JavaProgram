public class MethodRecursion { 
     static int count=0;
    public static void showName(){
        System.out.println("Rohit");
        if(count==5){
            return;
        }
        count++;
        showName();
    }
    public static void main(String args[]){
          MethodRecursion.showName();
    }
}
