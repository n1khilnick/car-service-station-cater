import java.util.HashMap;

public class BillGenerator{

    String carType;
    String [] serviceCodes;

    public BillGenerator(String carType, String[] serviceCodes) {
        this.carType = carType;
        this.serviceCodes = serviceCodes;
    }

    public void generateBill() {

        CarService carService = new CarService();
        HashMap<String, HashMap<String,CarServicePrice>> servicePrices = carService.servicePrices;
        HashMap<String, CarServicePrice> charges = servicePrices.get(carType);

        System.out.println("Type of Car – " + carType);
        System.out.println("Service Codes – " + String.join(", ", serviceCodes));


        int totalBill = 0;

        for (String serviceCode : serviceCodes) {
            totalBill += charges.get(serviceCode).servicePrice;
        }

        for (String serviceCode : serviceCodes) {
            System.out.println("Charges for " + charges.get(serviceCode).serviceName + "– ₹ " + charges.get(serviceCode).servicePrice);
        }
        if (totalBill > 10000) {
            System.out.println("Complimentary cleaning provided.");
        }
        System.out.println("Total Bill - ₹ " + totalBill);
    }

}
