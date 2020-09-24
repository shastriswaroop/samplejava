package shastri.swaroop.designpattern.behavior.state;

public class RemoteOnState implements State{
    @Override
    public void doAction() {
        System.out.println("Remote switched on..");
    }
}
