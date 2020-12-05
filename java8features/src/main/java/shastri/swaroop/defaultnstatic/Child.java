package shastri.swaroop.defaultnstatic;

public class Child extends Parent implements Interface1{
    public static void main(String[] args) {
        Interface1.show();
        Parent.show();
    }
}
