class Account{
    private int Acc_no;
    private double balance;
    private int pin;

    public void SetAcc_NO(int Acc_no){
        this.Acc_no=Acc_no;
    }
    public void Setbalance(int balance){
        this.balance=balance;
    }
    public void Setpin(int pin){
        this.pin=pin;
    }
    public int getAccNo(){
        return Acc_no;
    }


    public double getbalance(){
        return balance;
    }
    public int getpin(){
        return pin;
    }

}
public class Account_getterSetter {
    public static void main(String args[]){
      Account obj=new Account();
      obj.SetAcc_NO(12345678);
      obj.Setbalance(42561);
      obj.Setpin(123);

      System.out.println(obj.getAccNo());
      System.out.println(obj.getbalance());
      System.out.println(obj.getpin());
    }
    
}
