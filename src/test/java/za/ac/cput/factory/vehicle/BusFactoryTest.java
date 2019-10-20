package za.ac.cput.factory.vehicle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.vehicle.Bus;

import static org.junit.Assert.*;

public class BusFactoryTest {
  private  int quanty;
  private  String model;
  private int engine;
   private String brand;
   private String road;
    @Before
    public void setUp() throws Exception {
        quanty =20;
        model= "%659*";
        engine =60;
        brand ="Toyota";
        road="1000K";

    }

    @Test
    public void generateBuilder() {

        Bus bus=BusFactory.GenerateBuilder(quanty,model,engine,brand,road);
        System.out.println(bus);
        Assert.assertNotNull(bus);

    }
}