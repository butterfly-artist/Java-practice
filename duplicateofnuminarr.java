package demo;

public class dublicate5A {
	    public static void main(String[] args) {
	        int[] numbers = {4, 2, 7, 4, 9, 2, 1, 7};

	        System.out.println("Duplicate values:");
	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[i] == numbers[j]) {
	                    System.out.println(numbers[i]);
	                    break; // Avoid printing the same duplicate again
	                }
	            }
	        }
	    }
}

// // OUTPUT
// Duplicate values:
// 4
// 2
// 7
