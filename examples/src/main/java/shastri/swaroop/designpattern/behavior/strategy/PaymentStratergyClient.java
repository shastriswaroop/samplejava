package shastri.swaroop.designpattern.behavior.strategy;

public class PaymentStratergyClient {

    public static void main(String[] args) {
        Order order1 = new Order(100,new NetBankingPayment());
        order1.payToSeller();
        Order order2 = new Order(1020,new UPIPayment());
        order2.payToSeller();
    }
}
