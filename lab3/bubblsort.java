package lab3;

public class bubblsort {

	public static void main(String[] args) {
		 int[] numbers = {64, 34, 25, 12, 22, 11, 90};
	        int n = numbers.length;
	        
	        System.out.print("ORIGINAL ARRAY: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (numbers[j] > numbers[j + 1]) {
	                    int temp = numbers[j];
	                    numbers[j] = numbers[j + 1];
	                    numbers[j + 1] = temp;
	                }
	            }
	        }
	        
	        System.out.print("\nSORTED ARRAY: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        System.out.println();
	}

}
