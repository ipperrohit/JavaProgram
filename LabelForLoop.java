public class LabelForLoop {
    public static void main(String args[]){
        OuterLoop:
        for(int i=0;i<5;i++){
            InnerLoop:
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
