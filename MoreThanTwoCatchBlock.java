public class MoreThanTwoCatchBlock {
    public static void main(String args[]){
        int mark[]={10,20,30};
        try{
            System.out.println(10/0);//ArithmaticException
            System.out.println(mark[4]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
