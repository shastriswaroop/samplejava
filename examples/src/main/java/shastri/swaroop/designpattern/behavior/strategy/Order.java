package shastri.swaroop.designpattern.behavior.strategy;

public class Order {
    int orderCost;
    PaymentStrategy strategy;
    Order(int cost, PaymentStrategy strategy){
        this.strategy =strategy;
        this.orderCost = cost;
    }

    public void payToSeller(){
        this.strategy.pay();
    }
}
