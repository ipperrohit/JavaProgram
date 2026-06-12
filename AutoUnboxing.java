public class AutoUnboxing {
    public static void main(String args[]){
        Byte i=10;
        int a=i.intValue();
        System.out.println(a);
        System.out.println(i.getClass());
        }
}
