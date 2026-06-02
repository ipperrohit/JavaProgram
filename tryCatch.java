import java.io.FileReader;
public class tryCatch {
    public static void main(String args[]){
        System.out.println(1);
        System.out.println(2);
        
        try{
            FileReader f=new FileReader("abc.txt");
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(4);
        System.out.println(5);

        
    }
}
