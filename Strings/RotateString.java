import java.util.Scanner;

public class RotateString { 

public static void main ( String [] args ) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the string");	
	String s = sc.nextLine();
	
	System.out.println("Enter the Rotation type");
	String r = sc.nextLine();
	
	System.out.println("Enter the no. of Rotations");
	int n = sc.nextInt();
	
	int len = s.length();
	
	n = n % len; //effective rotations
	
	char[] result = new char[len];
	
	if(r.equals("R"))
	{
		for(int i=0;i<len;i++)
		{
			result[i] = s.charAt( ( i + n ) % len );
			
		}
		
	}
	else if(r.equals("L"))
	{
		for(int i=0;i<len;i++)
		{
			result[i] = s.charAt( (i+len-n)%len );
		}
		
	}
	
	
	System.out.println("Rotated String : " + new String(result));
	
	
}




}