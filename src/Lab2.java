
import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {		
		
		
		//variables declared
		double lengthRoom;
		double widthRoom;
		double area;
		double perimeter;
		double heightRoom;
		double volume;
		char userChar;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	
	//prompt for input and assign 
	do {	
		System.out.println("Enter length: ");
		Scanner length = new Scanner(System.in);
		lengthRoom = length.nextDouble();
		System.out.println("Enter width :");
		Scanner width = new Scanner(System.in);
		widthRoom = width.nextDouble();
		System.out.println("Enter height:");
		Scanner height = new Scanner(System.in);
		heightRoom = height.nextDouble();
		
		// math 
		area = lengthRoom * widthRoom;
		perimeter = 2 * (lengthRoom + widthRoom);
		volume = lengthRoom * widthRoom * heightRoom;
		
		//display results
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Volume: " + volume );
		
		// loop as needed
		System.out.println("Continue? (y/n):");
		Scanner repeat = new Scanner(System.in);
		userChar = repeat.next().charAt(0);
	} while (userChar == 'y');
		 
	}

}
