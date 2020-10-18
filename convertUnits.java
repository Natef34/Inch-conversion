import java.util.*;

public class convertUnits
{
	public static void main (String args[])
	{
	  	//inches, base unit
		double	inches;
		//other units, dependent on inch
		double	feet, centimeters, meters, furlongs;
		Scanner input = new Scanner(System.in);

		System.out.println("How many inches is your measurement?");

	  	inches = input.nextInt();
		feet = inches/12;
		centimeters = inches*2.54;
		meters = inches/39.37;
		furlongs = inches/7920.02;
		
		System.out.println(inches+ " inches is equal to:");
		System.out.println(feet+ " feet");
		System.out.println(centimeters+ " centimeters");
		System.out.println(meters+ " meters");
		System.out.println(furlongs+ " furlongs");
	}
	
}