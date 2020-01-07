package CarApplication;

import java.util.ArrayList;

public class CarAppTestClass {

	public static void main(String[] args) {
		
		
		ArrayList<Car> carList	= new ArrayList<>();
		Car usedCarOne = new UsedCar("Jeep", "Cherokee", 2016, 22000.22, 42000.00);
		Car carOne = new Car();
		Car carTwo = new Car("Chrysler", "300", 2011, 18000.00);
		
		carOne.setMake("Ford");
		carOne.setModel("Pinto");
		carOne.setPrice(10000.00);
		carOne.setYear(1994);
		
//		usedCarOne.setMake("Jeep");
//		usedCarOne.setModel("Cherokee");
//		usedCarOne.setYear(2016);
//		usedCarOne.setPrice(22000.22);
//		usedCarOne.setMileage(42000.88);
		
		carList.add(carTwo);
		carList.add(usedCarOne);
		
		System.out.println(carOne);
		System.out.println(carTwo);
		System.out.println(carList);
		
		
		System.out.println(carList);
		
		

	}

}
