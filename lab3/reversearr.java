package lab3;

public class reversearr {

	public static void main(String[] args) {
		 int[] originalArray = {1, 2, 3, 4, 5};
	        int[] reversedArray = new int[originalArray.length];
	        
	        System.out.print("Original array: ");
	        for (int i = 0; i < originalArray.length; i++) {
	            System.out.print(originalArray[i] + " ");
	        }

	        int j = 0;
	        for (int i = originalArray.length - 1; i >= 0; i--) {
	            reversedArray[j] = originalArray[i];
	            j++;
	        }
	        
	        System.out.print("\nReversed array: ");
	        for (int i = 0; i < reversedArray.length; i++) {
	            System.out.print(reversedArray[i] + " ");
	        }
	        System.out.println();
	}

}
