package mzr.pattern.factoryMethod;

/**
 * Created by mzr on 17-3-13.
 */
public class FactoryBMW implements FactoryCar {

    public BMW createCar() {

        return new BMW();
    }

}
