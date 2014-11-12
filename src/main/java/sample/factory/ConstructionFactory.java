package sample.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is a Simple Factory implementation to produce the one of the
 * factories
 *
 * @author malalanayake
 */
public class ConstructionFactory {

    public enum FactoryName {

        CementFactory, WoodenFactory
    }

    public static AbstractConstructionFactory getInstance(FactoryName className) {
        AbstractConstructionFactory abstractConstructionFactory = null;
        try {

            abstractConstructionFactory = (AbstractConstructionFactory) Class.forName("sample.factory." + className).newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConstructionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ConstructionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConstructionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return abstractConstructionFactory;
    }
}
