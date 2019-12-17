package CarApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Mogk Auto Lot! \n");
		System.out.println("Here you can enter and store information about cars!\n");
		System.out.println("How many cars are you entering information for?");
		
		int numCars= scnr.nextInt();
		
		int carCounter = 1;
		ArrayList<Car> carList	= new ArrayList<>();
		while (numCars > 0) {
			Car indiCar = new Car();
			
			System.out.println("Enter information for car number " + carCounter);
			
			System.out.print("Enter car make: ");
			String carMake = scnr.next();
			indiCar.setMake(carMake);
			
			System.out.print("Enter car model: ");
			String carModel = scnr.next();
			indiCar.setModel(carModel);
			
			System.out.print("Enter car year: ");
			int carYear = scnr.nextInt();
			indiCar.setYear(carYear);
			
			System.out.print("Enter car price: ");
			double carPrice = scnr.nextDouble();
			indiCar.setPrice(carPrice);
			
			System.out.println("-------------------------------------"
							+ "--------------------------------------");
			
			carList.add(indiCar);
			numCars--;
			carCounter++;
		}
		
		System.out.println("Current Inventory: ");
		for (int i = 0; i < carList.size(); i++) {
			System.out.printf(carList.get(i) + "\n");
		}
		
		
		
		
	}

}
