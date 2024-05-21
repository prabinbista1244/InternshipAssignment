/**
 * 
 */
package internshipQn1;

/**
 * 
 */
public class Qn4EvenNumber {
public void evenNumber() {
		
		int[] even = new int[50];
		int j = 0;
		int k = 0;

		for(int i = 1; i<=100; i++) {
			if(i%2 == 0) {
				even[j] = i;
				j++;
				
			}
			k = j;
			
		}
		System.out.println("The even number are : ");
		for(int i = 0; i<k; i++) {
			System.out.println(even[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Qn4EvenNumber ev = new Qn4EvenNumber();
		
		ev.evenNumber();
	}


}
