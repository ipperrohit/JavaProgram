class parent{
    protected String name;

    public void setname(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class GetterSetter {
    public static void main(String args[]){
   parent obj=new parent();
   obj.setname("Rohit");
   obj.getName();
   System.out.println(obj.getName());
    }
}
