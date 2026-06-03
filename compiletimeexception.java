public class compiletimeexception {
    public static void main(String args[]){
        String str="ROHIT";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
