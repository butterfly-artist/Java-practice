package demo;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,space;
		for (i = 1; i <= 5; i++) {
		    space = 6 - i;
		    for (j = 1; j <= space; j++)
		        System.out.print(" ");
		    for (j = 1; j <= i; j++)
		        System.out.print("* ");
		    System.out.println();
		}
		for (i = 4; i >= 1; i--) {
		    space = 6 - i;
		    for (j = 1; j <= space; j++)
		        System.out.print(" ");
		    for (j = 1; j <= i; j++)
		        System.out.print("* ");
			//made changes
		    System.out.println();
		}
	}

}
