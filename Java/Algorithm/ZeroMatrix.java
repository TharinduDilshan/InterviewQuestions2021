/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

You must do it in place.

EXAMPLE:-
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
*/
public class ZeroMatrix {
	public void setZeroes(int[][] matrix) 
	{
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j]==0)
					convertZero(matrix, i, j);
			}
		}
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j]==Integer.MIN_VALUE+10)
					matrix[i][j]=0;
			}
		}
	}

	private void convertZero(int[][] matrix, int row, int col)
	{
		for(int i=0; i<matrix[0].length; i++)
		{
			if(matrix[row][i]!=0)
					matrix[row][i]= Integer.MIN_VALUE+10;
			}
		
		for(int i=0; i<matrix.length; i++)
		{
			if(matrix[i][col]!=0)
				matrix[i][col]= Integer.MIN_VALUE+10;
		}
	}
}
