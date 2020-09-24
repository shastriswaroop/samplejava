package shastri.swaroop.designpattern.behavior.strategy;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid using UPI Pyament...");
    }
}
