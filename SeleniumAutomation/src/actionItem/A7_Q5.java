package actionItem;

/*
* Q5. Create a function to find out the highest number of an integer array.
* 
*/


public class A7_Q5 {

	public static void main(String[] args) {
		int[] myArray = {909858749, 250, 1288476766, 69, 99, -6785, 649832847};
		System.out.println("The highest number of this array >> "+highestNumber(myArray));
	}
	
	public static int highestNumber(int[] array) {
		int highestNum = 0;		
		
		for(int num :array) {
			if(num > highestNum) {
				highestNum = num;
			}
		}
		return highestNum;		
	}
	

}
