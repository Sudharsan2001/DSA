/*
pattern printing: matrix = ["abc","def","ghi"]

sample input1: 4

output:
****
*abc*
*def*
*ghi*
****

sample input2: 5

output:
*****
*****
*abc*
*def*
*ghi*
*****
*****
*/


public class PatternPrinting{
	
	public static void main(String[] args){
		
		String[] matrix = {"abc","def","ghi"};
		
		pattern(matrix, 4);
		System.out.println();
		pattern(matrix, 5);
		System.out.println();
		pattern(matrix, 6);
	}
	
	public static void pattern(String[] matrix, int n)
	{
		int maxLen = 0;
		for(String str : matrix)
		{
			if(str.length() > maxLen) maxLen = str.length();
		}
		
		if(n < maxLen + 1) 
		{
			System.out.println("Invalid size. The input size must be at least " + (maxLen + 1));
			return;
		}
		
		int borderRows = n - matrix.length;
		
		//Top border
		for(int i = 0 ;i<borderRows;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//rows with the matrix content
		
		for(String str : matrix)
		{
			System.out.print("*");
			System.out.print(str);
			System.out.print("*");
			System.out.println();
		}
		
		//Bottom border
		
		for(int i = 0 ;i<borderRows;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
}