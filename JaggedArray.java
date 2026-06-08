public class JaggedArray {
    public static void main(String args[]){
        int mark[][]=new int[3][];
         mark[0]=new int[3];
         mark[1]=new int[1];
         mark[2]=new int[4];
         
         mark[0][0]=1;
         mark[0][1]=2;
         mark[0][2]=3;
         mark[1][0]=4;
         mark[2][0]=5;
         mark[2][1]=6;
         mark[2][2]=7;
         mark[2][3]=8;
         

         for(int i=0;i<mark.length;i++){
            for(int j=0;j<mark[i].length;j++){
                System.out.print(mark[i][j]);
            }
         }

         
     }
}
