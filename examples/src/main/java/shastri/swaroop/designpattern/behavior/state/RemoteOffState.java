package shastri.swaroop.designpattern.behavior.state;

public class RemoteOffState implements State {
    @Override
    public void doAction() {
        System.out.println("Remote switched off..");
    }
}
