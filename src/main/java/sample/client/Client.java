package sample.client;

import sample.factory.AbstractConstructionFactory;
import sample.factory.WoodenFactory;
import sample.factory.ConstructionFactory;
import sample.product.Office;
import sample.product.Apartment;
import sample.product.House;

/**
 *
 * @author malalanayake
 */
public class Client {

    public static void main(String[] args) {
        AbstractConstructionFactory appartmentFactory = ConstructionFactory.
                getInstance(ConstructionFactory.FactoryName.CementFactory);
        Office floor = appartmentFactory.createOffice();
        floor.print();
        House house = appartmentFactory.createHouse();
        house.print();
        Apartment apartment = appartmentFactory.createApartment();
        apartment.print();

        AbstractConstructionFactory housingFactory = ConstructionFactory.
                getInstance(ConstructionFactory.FactoryName.WoodenFactory);
        Office floor2 = housingFactory.createOffice();
        floor2.print();
        House house2 = housingFactory.createHouse();
        house2.print();
        Apartment apartment2 = housingFactory.createApartment();
        apartment2.print();

    }
}
