package practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayActivity {

	public static void main(String[] args) {

		int[] myIntArray = {1,2,3,4,5};
		
		// Reverse an array
		for(int i=myIntArray.length-1; i >=0; i--) {
			System.out.println(myIntArray[i]);
		}
		
		//Convert array to arrayList
		List<Integer> myIntList = new ArrayList<>();
		
		for (Integer integer : myIntArray) {
			myIntList.add(integer);
		}
		
		// Transpose a matrix
		int[][] my2DArray = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		int[][] myTranspose = new int[5][3];
		
		for(int i=0; i<my2DArray.length;i++) {
			for(int j=0; j<my2DArray[0].length;j++) {
				myTranspose[j][i] = my2DArray[i][j];
			}
		}
		for(int i=0; i<myTranspose.length;i++) {
			for(int j=0; j<myTranspose[0].length;j++) {
				System.out.print(myTranspose[i][j]+ " ");
			}
			System.out.println();
			
		}
	}

}
