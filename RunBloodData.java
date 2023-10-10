package package1;
import java.util.InputMismatchException;
import java.util.regex.*;
import java.util.Scanner;
public class RunBloodData {
	public static void main(String[] args)throws Exception {
		Scanner scn = new Scanner(System.in);
		while(true) {	
			try{	
				System.out.println("*************************************");
				System.out.print("Enter the bloodtype of patient: ");
				String inp1 = scn.nextLine().toUpperCase();
				if (!inp1.matches("[A || B || AB]*")) {
					System.out.println("Please try again");
					System.out.println("*************************************");
					continue;
					
				}
				
				System.out.print("Enter the Rhesus factor (+ or - ): ");
				String inp2 = scn.nextLine().toUpperCase();
				if(!inp2.matches("[+ || -]*")) {
					System.out.println("Please try again");
					System.out.println("*************************************");
					
					continue;
				}
				
				if(inp1.isEmpty()) {
					BloodData bd2 = new BloodData();
					bd2.display();
					System.out.println("************************************");
				}
				else{
					BloodData bd = new BloodData(inp1, inp2);
					bd.display();
					System.out.println("*************************************");
				}
				System.out.print("Do you want to enter more [Y or N]? ");
				String decide = scn.next().toUpperCase();
				if(decide.equals("Y")) {
					scn.nextLine();
					continue;
				}
				else {
					break;
				}
			}
			
			catch(InputMismatchException ime) {
				System.err.println("Invalid Input. Try Again.");
			}
		}
	}
}
