package hacktoberFest;

import java.util.Scanner;

public class VehicleMain {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		double userMiles;
		double userGallons;
		double milesPerGallon;
		

		Audi audi = new Audi(40);

		audi.start();

		System.out.println("***********************The car has been started****************************");
		
		audi.steer(45);
		
		System.out.println("***********************The car steering set at 45 degrees******************");

		audi.accelarate(41);

		System.out.println("***********************After increasing the speed**************************");

		audi.accelarate(80);

		System.out.println("***********************After decreasing the speed**************************");

		audi.accelarate(20);

		System.out.println("***********************After shifting the gear*****************************");

		audi.changeGear(3);

		System.out.println("***********************After changing the velocity*************************");

		audi.changeVelocity(41, 4);

		System.out.println("***********************The car has been stopped****************************");

		audi.stop();
		
		System.out.println("***********************The car's mileage of the running speed****************************");
		
		audi.mileage();
		
		
		  System.out.println("Please enter the miles:\t"); 
		  userMiles = scanner.nextDouble();
		  
		  System.out.println("Please enter the gallons of gas used:\t"); 
		  userGallons =  scanner.nextDouble();
		  
		  milesPerGallon = userMiles / userGallons;
		  
		  System.out.println("Miles per Gallon is " + milesPerGallon);
		  
		  System.out.println(milesPerGallon + "is the average of vehicle");
		 
		
		

	}


}
