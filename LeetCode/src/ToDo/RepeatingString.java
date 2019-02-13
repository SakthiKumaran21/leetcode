import java.util.HashSet;
import java.util.Set;
class RepeatingString {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))){
				set.add(s.charAt(j));
				j++;
				ans = Math.max(ans, j - i);           
			}
			else {
				set.remove(s.charAt(i++));
			}
		}
		System.out.println(set);
		return ans;
	}
	public static void main(String [] args) {
		RepeatingString res = new RepeatingString();
		System.out.println(res.lengthOfLongestSubstring("abcab"));
	}
}