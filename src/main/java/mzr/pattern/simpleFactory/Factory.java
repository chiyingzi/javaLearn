package mzr.pattern.simpleFactory;

/**
 * Created by mzr on 17-3-13.
 */
public class Factory extends Car {
    public Car createCar(String type) {
        if ("BMW".equals(type)) {
            return new BMW();
        } else if ("BYD".equals(type)) {
            return new BYD();
        } else {
            return null;
        }
    }
}