public class methodOverloding {
    class poly{
        public void Sum(int a,int b){
            System.out.println(a+b);
        }
        public void Sum(float a,float b){
            float c=a+b;
            System.out.println(c);
        }
    }
    public static void main(String args[]){
        methodOverloding obj=new methodOverloding();
        poly obj1=obj.new poly();
        obj1.Sum(1,4);
        obj1.Sum(1.0f,4);
        
    }
}
