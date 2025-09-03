package demo;

public class patternwithNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,space;
		for (i = 1; i <= 5; i++) {
		    space = 6 - i;
		    for (j = 1; j <= space; j++)
		        System.out.print(" ");
		    for (j = 1; j <= i; j++)
		        System.out.print(j);
		    for (j = i-1; j >= 1; j--) {
                System.out.print(j );
            }
		    System.out.println();
		}
	}

	}

// OUTPUT
//      1
//     121
//    12321
//   1234321
//  123454321
