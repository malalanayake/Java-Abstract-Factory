package sample.factory;

import sample.product.Office;
import sample.product.Apartment;
import sample.product.impl.WoodenOffice;
import sample.product.House;
import sample.product.impl.WoodenApartment;
import sample.product.impl.WoodenHouse;

/**
 * Concrete implementation WoodenFactory
 *
 * @author malalanayake
 */
public class WoodenFactory implements AbstractConstructionFactory {

    @Override
    public Apartment createApartment() {
        return new WoodenApartment();
    }

    @Override
    public House createHouse() {
        return new WoodenHouse();
    }

    @Override
    public Office createOffice() {
        return new WoodenOffice();
    }
}
