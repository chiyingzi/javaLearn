package mzr.pattern.factoryMethod;

import mzr.pattern.simpleFactory.Factory;

/**
 * Created by mzr on 17-3-13.
 */
public class Test {
    public static void main(String[] args) {
        FactoryBMW factoryBMW = new FactoryBMW();
        BMW bmw = factoryBMW.createCar();

        FactoryBYD factoryBYD = new FactoryBYD();
        BYD byd = factoryBYD.createCar();
    }
}