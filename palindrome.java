package assignmentjava;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1;
		Scanner sscan=new Scanner(System.in);
		System.out.println("Enter a string: ");
		var1=sscan.nextLine();
		String reverse= new StringBuilder(var1).reverse().toString();
	   System.out.println(reverse);
	   if(var1.equals(reverse)) {
		   System.out.println("This is palindrome ");
	   }else {
		   System.out.println("not palindrome ");
	   }
	   sscan.close();
	}

}
