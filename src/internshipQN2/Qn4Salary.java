/**
 * 
 */
package internshipQN2;

import java.util.Scanner;

/**
 * 
 */
public class Qn4Salary {
	public void salary() {
		int n = 1;
		Scanner sc = new Scanner(System.in);
		while(n<=4) {
			System.out.println("Enter the post of staff!");
			String staff = sc.nextLine();
			
			switch(staff) {
			case "md" :
				double mdBonus = (20*230000)/100;
				double mdTotalSalary = 230000 + mdBonus;
				System.out.println("Total Salary of MD is : " + mdTotalSalary);
				break;
				
				
			case "ceo" :
				double ceoBonus = (25.79*250000)/100;
				double ceoTotalSalary = 250000 + ceoBonus;
				System.out.println("Total Salary of CEO is : " + ceoTotalSalary);
				break;
				
			case "manager" :
				double managerBonus = (16*176000)/100;
				double managerTotalSalary = 176000 + managerBonus;
				System.out.println("Total Salary of Manager is : " + managerTotalSalary);
				break;
				
			case "helper" :
				double helperBonus = (9*145900)/100;
				double helperTotalSalary = 145900 + helperBonus;
				System.out.println("Total Salary of Helper is : " + helperTotalSalary);
				break;
				
			 default:
	             System.out.println("Error! Invalid operator.");
	             break;
			}
				n++;
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		Qn4Salary s = new Qn4Salary();
		
		s.salary();
	}

}
