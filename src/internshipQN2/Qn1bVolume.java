/**
 * 
 */
package internshipQN2;


/**
 * 
 */
public class Qn1bVolume extends Qn1aArea {
	public void volume(int BaseArea, int h) {
		int volume = BaseArea*h;
		
		System.out.println("The area is : " + BaseArea);
		System.out.println("The volume is : " + volume);
		
	}
	
	public static void main(String[] args) {
		Qn1bVolume v = new Qn1bVolume();
		
		int baseArea = getArea(20,40); 
		v.volume(baseArea, 20);
//		System.out.println("The area is : " + baseArea);
		
		
	}

}
