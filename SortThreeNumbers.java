import java.util.Scanner; 
public class SortThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		double userIn1 = keyboard.nextDouble();
		System.out.println("Enter number 2: ");
		double userIn2 = keyboard.nextDouble();
		System.out.println("Enter number 3: ");
		double userIn3 = keyboard.nextDouble();
		
		//double out = result;
		
		
		//This is where I was confused the most, had to look it up
		displaySortedNumbers(userIn1, userIn2, userIn3);

	}
	
	public static void displaySortedNumbers(
			double num1, double num2, double num3) {
		
		double tempNum;
		
		if (num2 < num1 && num2 < num3) {
			tempNum = num1;
			num1 = num2;
			num2 = tempNum;
			
			
		}
		else if (num3 < num1 && num3 < num2) {
			tempNum = num1;
			num1 = num3;
			num3 = tempNum;
			
			
		}
		
		if(num3 < num2 ) {
			tempNum = num2;
			num2 = num3;
			num3 = tempNum;
			
			
			
		}
		
		//else if()
		
		System.out.println (" The numbers in increasing order are " + num1 + " " + num2 + " " + num3);
		
		
}
}
