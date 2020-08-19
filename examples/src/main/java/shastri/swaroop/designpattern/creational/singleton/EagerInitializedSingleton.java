package shastri.swaroop.designpattern.creational.singleton;

//this is the easiest method to create a singleton class but it has a drawback that
// instance is created even though client application might not be using it.
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
