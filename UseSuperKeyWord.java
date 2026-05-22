class parent{
    parent(){
        System.out.println("This ia Parent class Constructor");
    }
}
class chield extends parent{
    chield(){ 
    super();
}
}
public class UseSuperKeyWord {
    public static void main(String args[]){
      chield obj=new chield();
    }
}
