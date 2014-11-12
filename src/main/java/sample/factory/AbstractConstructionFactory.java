package sample.factory;

import sample.product.Office;
import sample.product.Apartment;
import sample.product.House;

/**
 * Provides the different types of products
 *
 * @author malalanayake
 */
public interface AbstractConstructionFactory {

    public Apartment createApartment();

    public House createHouse();

    public Office createOffice();
}
