interface Car{
    public void Start();
}
class Elecctric implements Car{
    public void Start(){
        System.out.println("Electric car start");
    }
}
class Diesel implements Car{
   public void Start(){
    System.out.println("Diesel car start");
        
    
   }
}
public class Interface {
    public static void main(String args[]){
      Car obj=new Diesel();
      obj.Start();
      Car obj1=new Elecctric();
      obj1.Start();
    }
}
