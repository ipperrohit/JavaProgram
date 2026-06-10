public class PrintCharUsingSynchronized {
    public static void main(String args[]){
       StringBuffer st=new StringBuffer("Rohit");
       for(int i=0;i<st.length();i++){
           System.out.println(st.charAt(i));
       }
    
       
    }
}
