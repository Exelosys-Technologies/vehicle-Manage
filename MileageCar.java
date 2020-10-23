package hacktoberFest;

import javax.swing.JOptionPane;


public class MileageCar {

	public static void main(String args[]) {


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

		
	}

}
