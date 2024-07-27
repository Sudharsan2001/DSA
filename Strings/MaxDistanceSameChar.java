/*
given a string, find the maximum distance between the same two characters

sample input1: abacdeefghdei

sample output: 5

sample input: abcbda

sample output: 4
*/
/*
//Brute Force --> TC - o(n2) & SC - o(1)

public class MaxDistanceSameChar{
	public static void main(String[] args){
		String s1 = "abacdeefghdei";
		String s2 = "abcbda";
		
		System.out.println("Max distance between same char in s1 is :"+maxDistance(s1));
		System.out.println("Max distance between same char in s2 is :"+maxDistance(s2));

	}
	
	public static int maxDistance(String s){
		int maxDistance = 0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					int distance = j-i;
					if(distance > maxDistance) maxDistance=distance;
				}
			}
		}
		
		return maxDistance-1;
	}
}
*/


//Optimal --> TC -o(n) SC- o(n)
import java.util.HashMap;
public class MaxDistanceSameChar{
	public static void main(String[] args){
		String s1 = "abacdeefghdei";
		String s2 = "abcbda";
		
		System.out.println("Max distance between same char in s1 is :"+maxDistance(s1));
		System.out.println("Max distance between same char in s2 is :"+maxDistance(s2));

	}
	
	public static int maxDistance(String s){
		int maxDistance = 0;
		
		HashMap<Character,Integer> firstOccurence = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(firstOccurence.containsKey(ch))
			{
				int distance = i - firstOccurence.get(ch);
				if(distance> maxDistance) maxDistance = distance;
			}
			else
			{
				firstOccurence.put(ch,i);
			}
		}
		return maxDistance-1;
	}
}