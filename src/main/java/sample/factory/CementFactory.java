package sample.factory;

import sample.product.impl.CementOffice;
import sample.product.Office;
import sample.product.Apartment;
import sample.product.impl.CementApartment;
import sample.product.impl.CementHouse;
import sample.product.House;

/**
 * Concrete implementation CementFactory
 *
 * @author malalanayake
 */
public class CementFactory implements AbstractConstructionFactory {

    @Override
    public Apartment createApartment() {
        return new CementApartment();
    }

    @Override
    public House createHouse() {
        return new CementHouse();
    }

    @Override
    public Office createOffice() {
        return new CementOffice();
    }
}
