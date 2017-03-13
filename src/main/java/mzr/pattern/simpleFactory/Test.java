package mzr.pattern.simpleFactory;

/**
 * Created by mzr on 17-3-13.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car bmw = factory.createCar("BMW");
        Car byd = factory.createCar("BYD");
    }
}