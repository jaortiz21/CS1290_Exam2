import java.util.*;

/**
 Given a matrix, any element that is equal to 0 will turn
 every other element in its corresponding row and column
 to become a 0 as well.
*/

public class ZeroMatrix{

    public static void main(String[] args){
	int[][] matrix  = {{1,5,8,22}, {0,11,2,12}, {1,200,47,14}, {99,32,65,0}};
	
	printArray(matrix);
	int[][] zero = zeroMatrix(matrix);
	System.out.println();
	printArray(zero);
    }

    public static void printArray(int[][] a){
	for(int i = 0; i < a.length; i++){
	    for(int j = 0; j < a[i].length; j++){
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();
	}
    }

    public static int[][] zeroMatrix(int[][] matrix){
	boolean[] rowZero = new boolean[matrix.length];
	boolean[] columnZero = new boolean[matrix[0].length];
	Arrays.fill(rowZero, false);
	Arrays.fill(columnZero, false);

	//find zeros in array before transforming columns and rows
	for(int i = 0; i < matrix.length; i++){
	    for(int j = 0; j < matrix[i].length;j++){
		if(matrix[i][j] == 0 && !rowZero[i]){
		    rowZero[i] = true;
		}
		if(matrix[i][j] == 0 && !columnZero[j]){
		    columnZero[j] = true;
		}
	    }
	}

	//zero rows
	for(int i = 0; i < rowZero.length; i++){
	    if(rowZero[i]){
		for(int j = 0; j < rowZero.length; j++){
		    matrix[i][j] = 0;
		}
	    }
	}
	//zero columns
	System.out.println(Arrays.toString(columnZero));
	for(int i = 0; i < columnZero.length; i++){
	    if(columnZero[i]){
		for(int j = 0; j < columnZero.length; j++){
		    matrix[j][i] = 0;
		}
	    }
	}

	return matrix;
    }
}
