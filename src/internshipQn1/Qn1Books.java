/**
 * 
 */
package internshipQn1;

import java.util.Scanner;

/**
 * 
 */
public class Qn1Books {
	public void booksPrice() {
		int totalPrice = 0;
		int[] price = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			System.out.println("Enter the price of " + i + "th the book");
			price[i] = sc.nextInt();
			totalPrice = totalPrice + price[i];
		}
		int avgPrice = totalPrice/10;
		
		System.out.println("The total price of the books is : " + totalPrice);
		System.out.println("The average price of the books is : " + avgPrice);
		
		sc.close();
		
	}
	
	public static void main(String[] args) {
		Qn1Books b = new Qn1Books();
		
		b.booksPrice();
		
	}

}
