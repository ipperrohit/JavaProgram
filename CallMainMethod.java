public class CallMainMethod {
    public static void CallMain(){
       main(null);
    }
    public static void main(String args[]){
        System.out.println("Main method");
        CallMainMethod.CallMain();
     
    }
}
