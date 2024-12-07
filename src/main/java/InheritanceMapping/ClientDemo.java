package InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

    public static void main(String[] args) {
        // Hibernate configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); // assuming the hibernate.cfg.xml is configured properly

        // Build SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // Create a session
        Session session = factory.openSession();

        // Start a transaction
        Transaction tx = session.beginTransaction();

        // Creating Device, Smartphone, and Tablet objects
        Device device = new Device();
        device.setBrand("GenericBrand");
        device.setModel("XYZ123");
        device.setPrice(500);

        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 15");
        smartphone.setPrice(999);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution(12.0);

        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S9");
        tablet.setPrice(600);
        tablet.setScreenSize(12.4);
        tablet.setBatteryLife(12);

        // Persisting objects
        session.persist(device);
        session.persist(smartphone);
        session.persist(tablet);

        // Committing the transaction
        tx.commit();

        System.out.println("Records inserted successfully!");

        // Closing session
        session.close();
        factory.close();
    }
}
