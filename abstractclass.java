abstract class payment{
    abstract void pay(int a);
    void print(){
        System.out.println("payment done");
    }
}
    class upiPayment extends payment{
        void pay(int a){
            System.out.println("payment done via upi");
        }

    }


class abstractclass{
    public static void main(String[] args) {
        upiPayment obj=new upiPayment();
        obj.pay(5000);
    }
}
