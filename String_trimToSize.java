public class String_trimToSize {
    public static void main(String args[]){
        StringBuffer st=new StringBuffer("Rohit");
        System.out.println("Initial capacity of Rohit is:  "+st.length());
        System.out.println("Addint 16 char in string:  "+st.capacity());
        st.trimToSize();
        System.out.println("after the trimToSize() method:  "+st.length());
    }
}
