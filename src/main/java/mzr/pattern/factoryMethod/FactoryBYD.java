package mzr.pattern.factoryMethod;

/**
 * Created by mzr on 17-3-13.
 */
public class FactoryBYD implements FactoryCar {

    public BYD createCar() {

        return new BYD();
    }

}
