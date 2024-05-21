/**
 * 
 */
package internshipQn1;

/**
 * 
 */
public class Qn3OddNumber {
	
	public void oddNumber() {
		
		int[] odd = new int[50];
		int j = 0;
		int k = 0;

		for(int i = 1; i<=100; i++) {
			if(i%2 == 1) {
				odd[j] = i;
				j++;
				
			}
			k = j;
			
		}
		System.out.println("The odd number are : ");
		for(int i = 0; i<k; i++) {
			System.out.println(odd[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Qn3OddNumber od = new Qn3OddNumber();
		
		od.oddNumber();
	}

}
