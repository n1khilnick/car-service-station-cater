import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarServiceStation {

    public static void main(String[] args) throws InterruptedException {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Car Type: ");
        String carType = s.nextLine();

        System.out.print("What kind of the service you want ? Please enter below code(s) for type of service: ");

        String services = s.nextLine();
        String[] serviceCode = services.split(",");

        BillGenerator billGenerator = new BillGenerator(carType,serviceCode);
        System.out.println("Calculating and Generating Bill...");
        Thread.sleep(3000);
        billGenerator.generateBill();



    }
}
