import java.util.HashMap;

public class CarService {

    HashMap<String,HashMap<String,CarServicePrice>> servicePrices = new HashMap<>();

    public CarService() {
        servicePrices  = new HashMap<>();

        HashMap<String,CarServicePrice> hatchBackServicePrice = new HashMap<>();
        hatchBackServicePrice.put("BS01",new CarServicePrice("Basic Servicing",2000));
        hatchBackServicePrice.put("EF01",new CarServicePrice("Engine Fixing",5000));
        hatchBackServicePrice.put("CF01",new CarServicePrice("Clutch Fixing",2000));
        hatchBackServicePrice.put("BF01",new CarServicePrice("Brake Fixing",1000));
        hatchBackServicePrice.put("GF01",new CarServicePrice("Gear Fixing",3000));

        servicePrices.put("Hatchback",hatchBackServicePrice);

        HashMap<String,CarServicePrice> sedanServicePrice = new HashMap<>();
        sedanServicePrice.put("BS01",new CarServicePrice("Basic Servicing",4000));
        sedanServicePrice.put("EF01",new CarServicePrice("Engine Fixing",8000));
        sedanServicePrice.put("CF01",new CarServicePrice("Clutch Fixing",4000));
        sedanServicePrice.put("BF01",new CarServicePrice("Brake Fixing",1500));
        sedanServicePrice.put("GF01",new CarServicePrice("Gear Fixing",6000));

        servicePrices.put("Sedan",sedanServicePrice);

        HashMap<String,CarServicePrice> suvServicePrice = new HashMap<>();
        suvServicePrice.put("BS01",new CarServicePrice("Basic Servicing",5000));
        suvServicePrice.put("EF01",new CarServicePrice("Engine Fixing",10000));
        suvServicePrice.put("CF01",new CarServicePrice("Clutch Fixing",6000));
        suvServicePrice.put("BF01",new CarServicePrice("Brake Fixing",2500));
        suvServicePrice.put("GF01",new CarServicePrice("Gear Fixing",8000));

        servicePrices.put("SUV",suvServicePrice);
    }
}
