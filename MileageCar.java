package hacktoberFest;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class MileageCar {

	public static void main(String args[]) {

		// Scanner scanner = new Scanner(System.in);

		double userMiles;
		double userGallons;
		double milesPerGallon;
		String userStringOutput;

		userStringOutput = JOptionPane.showInputDialog("Please enter the miles");
		userMiles = Double.parseDouble(userStringOutput);

		userStringOutput = JOptionPane.showInputDialog("Please enter the gallons of gas used");
		userGallons = Double.parseDouble(userStringOutput);

		milesPerGallon = userMiles / userGallons;

		JOptionPane.showMessageDialog(null, "Miles per gallon is " + milesPerGallon);
		System.exit(0);

		/*
		 * System.out.println("Please enter the miles: "); userMiles =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Please enter the gallons of gas used: "); userGallons =
		 * scanner.nextDouble();
		 * 
		 * milesPerGallon = userMiles / userGallons;
		 * 
		 * System.out.println("Miles per Gallon is " + milesPerGallon);
		 */
	}

}
