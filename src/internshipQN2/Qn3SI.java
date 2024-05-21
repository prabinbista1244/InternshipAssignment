/**
 * 
 */
package internshipQN2;

import java.util.Scanner;

/**
 * 
 */
public class Qn3SI {
	static int p, t, r;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principal");
		p = sc.nextInt();
		
		System.out.println("Enter the time");
		t = sc.nextInt();
		
		System.out.println("Enter the rate");
		r = sc.nextInt();
		
		sc.close();
	}
	
	public void processing(int p, int t, int r) {
		double si = (p*t*r)/100;
		double amount = p + si;
		
		System.out.println("The simple interest is : " + si);
		System.out.println("The total amout is : " + amount);
	}
	
	public void output() {
		
	}
	public static void main(String[] args) {
		Qn3SI s = new Qn3SI();
		
		s.input();
		s.processing(p, t, r);
		s.output();
		
	}

}
