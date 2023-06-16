# Car Service Station Cater
This application, implemented in Java, is designed to manage a car service station and generate detailed bills for service requests. It caters to different types of cars (Hatchback, Sedan, SUV) and provides various services such as Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing, and Brake Fixing.

## Features

* Supports three types of cars: Hatchback, Sedan, and SUV.
* Provides different services with corresponding service codes and prices for each car type.
* Generates a detailed bill with the total amount based on the specified car type and service codes.

* Offers a complimentary cleaning if the total service bill exceeds ₹ 10000.

  ### Service Codes and Prices


    | Service Code | Service         | Hatchback  | Sedan  | SUV     |
    |--------------|-----------------|------------|--------|---------|
    | BS01         | Basic Servicing | ₹ 2000     | ₹ 4000 | ₹ 5000  |
    | EF01         | Engine Fixing   | ₹ 5000     | ₹ 8000 | ₹ 10000 |
    | CF01         | Clutch Fixing   | ₹ 2000     | ₹ 4000 | ₹ 6000  |
    | BF01         | Brake Fixing    | ₹ 1000     | ₹ 1500 | ₹ 2500  |
    | GF01         | Gear Fixing     | ₹ 3000     | ₹ 6000 | ₹ 8000  |


## Usage

1. Clone the repository:

2. Open the project in your preferred Java IDE.

3. Run the Main.java file.

4. Follow the prompts to enter the type of car (Hatchback, Sedan, or SUV) and the service codes for the requested services.

5. The software will generate a detailed bill with the total amount for the service request.

6. If the total service bill exceeds ₹ 10000, a complimentary cleaning will be provided and specified in the bill.

#### Examples
* Example 1:

  **Type of Car:** _Hatchback_

  **Service Codes:** _BS01, EF01_

  **Generated Bill:**

   _Charges for Basic Servicing:_ ₹ 2000 <br/>
  _Charges for Engine Fixing:_ ₹ 5000 <br/>
  _Total Bill:_ ₹ 7000 <br/>
 
* Example 2:
  
   **Type of Car:** SUV

   **Service Codes:** CF01, GF01, BF01

  **Generated Bill:**

   _Charges for Clutch Fixing:_ ₹ 6000 <br/>
  _Charges for Gear Fixing:_ ₹ 8000 <br/>
  _Charges for Brake Fixing:_ ₹ 2500 <br/>
  _Total Bill:_ ₹ 16500 <br/>
  _Complimentary Cleaning:_ Yes<br/>
