package internshipQn3;

import java.util.Scanner;

public class Area {
	int l;
	int b;
	
	public void setDim(int length, int breadth) {
		l = length;
		b = breadth;
		
	}
	public int getArea() {
		int Area = l*b;
		return Area;
	}
	
	public static void main(String[] args) {
		Area a = new Area();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int l = sc.nextInt();
		
		System.out.println("Enter the breadth");
		int b = sc.nextInt();
		
		a.setDim(l,b);
		int area_of_rectangle = a.getArea();
		
		System.out.println("The area of rectangle is : " + area_of_rectangle);
		
		sc.close();
		
	}

}
