public class ArithmaticException {
    public static void main(String args[]){
        System.out.println(1);
        try{
            System.out.println(1/0);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(2);
    }
}
