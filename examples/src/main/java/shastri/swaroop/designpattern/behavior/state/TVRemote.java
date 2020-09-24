package shastri.swaroop.designpattern.behavior.state;

public class TVRemote {
    State state = null;
    public void setState(State state) {
        this.state = state;
    }

    public void showState() {
        this.state.doAction();
    }

    public static void main(String[] args) {
        RemoteOffState off = new RemoteOffState();
        RemoteOnState on = new RemoteOnState();

        TVRemote tvRemote = new TVRemote();
        tvRemote.setState(on);
        tvRemote.showState();
        tvRemote.setState(off);
        tvRemote.showState();

    }
}
