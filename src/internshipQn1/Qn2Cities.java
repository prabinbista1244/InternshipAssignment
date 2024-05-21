/**
 * 
 */
package internshipQn1;

import java.util.Scanner;

/**
 * 
 */
public class Qn2Cities {
	public void citiesName() {
		String[] cities = new String[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<6; i++) {
			System.out.println("Enter the " + i + "th cities name");
			cities[i] = sc.nextLine();
			
		}
		
		for(int i = 0; i<6; i++) {
			System.out.println("the " + i + "th cities name is : " + cities[i]);
			
		}
		sc.close();
	}
	public static void main(String[] args) {
		Qn2Cities c = new Qn2Cities();
		
		c.citiesName();
	}

}
