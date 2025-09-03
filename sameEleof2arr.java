package demo;
import java.util.Scanner;

public class commonof2arrays {

	public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.print("Enter size: ");
	    	int size=sc.nextInt();
	    	int numbers[]=new int[size];
	    	System.out.print("Enter the elements in array:");
	    	for(int i=0;i<size;i++) {
	    		numbers[i]=sc.nextInt();
	    	}
	    	System.out.print("Enter size of second: ");
	    	int size2=sc.nextInt();
	    	int number2[]=new int[size2];
	    	System.out.print("Enter the elements in array:");
	    	for(int i=0;i<size2;i++) {
	    		number2[i]=sc.nextInt();
	    	}
	        System.out.println("same element from 2 arrays:");
	        for (int i = 0; i <size; i++) {
	            for (int j =0; j <size2; j++) {
	            	if(numbers[i]==number2[j]) {
	            	System.out.println(numbers[i]);
	                    break; 
	                }
	            }
	        }
	        sc.close();
	    }
}

// OUTPUT
// Enter size: 4
// Enter the elements in array:1
// 2
// 3
// 4
// Enter size of second: 5
// Enter the elements in array:8
// 1
// 9
// 6
// 4
// same element from 2 arrays:
// 1
// 4


  
