package za.ac.cput.factory.vehicle;

import za.ac.cput.domain.util.Misc;
import za.ac.cput.domain.vehicle.Bus;

public class BusFactory {

    public static Bus GenerateBuilder(int quanty,String model,int engine,String brand,String road){
        return new Bus.Builder()
                        .setBusId(Misc.generatedId())
                        .quantity(quanty)
                        .modelNo(model)
                        .engineNumber(engine)
                        .brandName(brand)
                        .roadWorty(road)
                        .build();
    }
}
