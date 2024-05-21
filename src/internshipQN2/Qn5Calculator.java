/**
 * 
 */
package internshipQN2;

import java.util.Scanner;

/**
 * 
 */
public class Qn5Calculator {
	public void calculator() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		
		while(n<4) {
			System.out.println("Enter the operator number");
			char op = sc.next().charAt(0);
			
			double result;
			
			switch(op) {
			case '+' :
				result = n1+n2;
				System.out.println("Addition is : " + result);
				break;
				
			case '-' :
				result = n1-n2;
				System.out.println("Subtraction is : " + result);
				break;
				
			case '*' :
				result = n1*n2;
				System.out.println("Multiplication is : " + result);
				break;
				
			case '/' :
				result = n1/n2;
				System.out.println("Division is : " + result);
				break;
				
			 default:
		         System.out.println("Error! Invalid operator");
		         break;
			}
			n++;
		}
		sc.close();
		
		
	}    
	public static void main(String[] args) {
		Qn5Calculator c = new Qn5Calculator();
		
		c.calculator();
		
	}

}
