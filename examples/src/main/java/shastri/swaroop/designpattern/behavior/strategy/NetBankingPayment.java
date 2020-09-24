package shastri.swaroop.designpattern.behavior.strategy;

public class NetBankingPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("Paid using NetBanking Pyament...");
    }
}
