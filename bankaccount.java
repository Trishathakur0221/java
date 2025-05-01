class bank{
    String accountholder;
    int accountnumber;
    float balance;
    float amount;
    
    void deposit(){
        balance=balance+amount;
        System.out.println("Deposited amount: "+amount);
        System.out.println("New balance: "+balance);
    }
    void withdraw(){
        balance=balance-amount;
        System.out.println("Withdrawn amount: "+amount);
        System.out.println("New balance: "+balance);
    }
}

public class bankaccount {
    public static void main(String[] args) {
        bank obj=new bank();
        obj.accountholder="John Doe";
        obj.accountnumber=123456789;
        obj.balance=0f;
        obj.amount=1000f;
        obj.deposit();
        
        obj.withdraw();
        
    }
    
}
