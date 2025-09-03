package demo;

public class Multiofmatrix {

	public static void main(String[] args) {
		        int[][] A = {
		            {1, 2 ,4},
		            {3, 4 ,9},
		            {1, 9, 3}
		            };
		        int[][] B = {
		            {5, 6,7},
		            {7, 8,2},
		            {9,2,3}
		        };
		        int[][] result = new int[3][3];

		        for (int i = 0; i < 3; i++) {
		            for (int j = 0;j<3;j++) {
		                result[i][j] = 0;
		                for (int k = 0; k < 3; k++) {
		                    result[i][j] =result[i][j]+ A[i][k] * B[k][j];
		                }
		            }
		        }

		        System.out.println("Multiplication result:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
	}

}

// // OUTPUT
// Multiplication result:
// 55 30 23 
// 124 68 56 
// 95 84 34 
