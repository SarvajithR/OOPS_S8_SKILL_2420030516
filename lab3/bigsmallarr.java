package lab3;

public class bigsmallarr {

	public static void main(String[] args) {
		 int[] numbers = {45, 12, 78, 33, 91, 5};
	        int max = numbers[0];
	        int min = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }
	        
	        System.out.println("Biggest value: " + max);
	        System.out.println("Smallest value: " + min);
	}

}
