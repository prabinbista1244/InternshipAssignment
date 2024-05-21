/**
 * 
 */
package internshipQn1;

/**
 * 
 */
public class Qn5MarksOfStudent {
	public void printMark() {
		int totalMarks = 0;
		int[] marks = {99,80,87,88,69};
		
		for(int i = 0; i<marks.length; i++) {
			totalMarks = totalMarks + marks[i];
		}
		float percent = (totalMarks*100)/500;
		
		System.out.println("The total marks is : " + totalMarks);
		System.out.println("The percent is : " + percent);
	}
	public static void main(String[] args) {
		Qn5MarksOfStudent ms = new Qn5MarksOfStudent();
		
		ms.printMark();
		
	}

}
