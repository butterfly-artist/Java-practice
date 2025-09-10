package assignmentjava;
import java.util.Scanner;

public class largestevennum {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();
		        sc.close();

		        String digits = "";
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            if (Character.isDigit(ch) && digits.indexOf(ch) == -1) {
		                digits =digits+ ch;
		            }
		        }

		        char[] digitArray = digits.toCharArray();
		        java.util.Arrays.sort(digitArray);
		        String sorted = new StringBuilder(new String(digitArray)).reverse().toString();

		        // Step 3: Find an even digit to place at the end
		        String result = "";
		        boolean foundEven = false;
		        for (int i = 0; i < sorted.length(); i++) {
		            char ch = sorted.charAt(i);
		            if ((ch - '0') % 2 == 0 && !foundEven) {
		                foundEven = true;
		                continue; // Skip this digit for now, we'll add it at the end
		            }
		            result += ch;
		        }

		        if (foundEven) {
		            // Add the even digit at the end
		            for (int i = 0; i < sorted.length(); i++) {
		                char ch = sorted.charAt(i);
		                if ((ch - '0') % 2 == 0) {
		                    result += ch;
		                    break;
		                }
		            }
		            System.out.println("Largest even number: " + result);
		        } else {
		            System.out.println("-1");
		        }
	}

}
