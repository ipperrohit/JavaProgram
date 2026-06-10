public class MethodeleteCharAt {
     public static void main(String args[]){
        StringBuffer st=new StringBuffer("Rohit");

        for(int i=0;i<st.length();i++){
           if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'){
            st.deleteCharAt(i);
           }
        }
        System.out.print(st);
     } 
}
