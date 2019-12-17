package CarApplication;

import java.util.ArrayList;

public class CarAppTestClass {

	public static void main(String[] args) {
		
		
		Car carOne = new Car();
		Car carTwo = new Car("Chrysler", "300", 2011, 18000.00);
		ArrayList<Car> carList	= new ArrayList<>();
		carList.add(carOne);
		carList.add(carTwo);
		
		carOne.setMake("Ford");
		carOne.setModel("Pinto");
		carOne.setPrice(10000.00);
		carOne.setYear(1994);
		
		System.out.println(carOne);
		System.out.println(carTwo);
		
		System.out.println(carList);
		
		

	}

}
