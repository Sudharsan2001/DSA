
import java.util.HashMap;
class longest_substring_without_repeating_chars {
	public static void main(String[] args){
		String s1 = "abcabcbb";
		String s2 = "abcbda";
		
		System.out.println("Max distance between same char in s1 is :"+lengthOfLongestSubstring(s1));
		System.out.println("Max distance between same char in s2 is :"+lengthOfLongestSubstring(s2));

	}
	
    public static int lengthOfLongestSubstring(String s) {
    int l = 0, r = 0, len = 0;
    int n = s.length();
    HashMap<Character, Integer> mp = new HashMap<>();

    while (r < n) {
        if (mp.containsKey(s.charAt(r))) {
            l = Math.max(l, mp.get(s.charAt(r)) + 1);
        }

        mp.put(s.charAt(r), r);
        len = Math.max(len, r - l + 1);
        r++;
    }

    return len;
}
}

			