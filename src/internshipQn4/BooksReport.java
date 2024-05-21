package internshipQn4;

import java.util.Scanner;

public class BooksReport {
	public void display(int Tbooks, int Tcost, int MaxCost, int MinCost, int avgCost) {
		System.out.println("Totals\n-------------------------");
		System.out.println("Total number of books : " + Tbooks);
		System.out.println("Total number of books : " + Tcost);
		System.out.println("Total number of books : " + MaxCost);
		System.out.println("Total number of books : " + MinCost);
		System.out.println("Total number of books : " + avgCost);
	}
	
	public static void main(String[] args) {
		BooksReport br = new BooksReport();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of books");
		int totalBooks = sc.nextInt();
		
		System.out.println("Enter the total cost books");
		int totalCost = sc.nextInt();
		
		System.out.println("Enter the maximum cost of books");
		int maximumCost = sc.nextInt();
		
		System.out.println("Enter the minimum cost of books");
		int minimumCost = sc.nextInt();
		
		System.out.println("Enter the average cost of books");
		int averageCost = sc.nextInt();
		
		br.display(totalBooks, totalCost, maximumCost, minimumCost, averageCost);
		
		sc.close();
		
	}

}
