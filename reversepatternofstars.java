package demo;

public class Numberpattern {
	public static void main(String []arg) {
	int i,j,space;
	for (i = 1; i <= 5; i++) {
	    space = 6 - i;
	    for (j = 1; j <= space; j++)
	        System.out.print(" ");
	    for (j = 1; j <= i; j++)
	        System.out.print("*");
	    System.out.println();
	}
}
}
// output
 //     *
 //    **
 //   ***
 //  ****
 // *****
