package solved;

class FirstNonRepeatChar {
	public int firstUniqChar(String s) {
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j < s.length(); j++) {
				System.out.println(s.charAt(i) + " and "+ s.charAt(j));
				if(s.charAt(i) == s.charAt(j)) {
					res = i;
					
				}
			}
		}
		return res;
	}

	public static void main(String [] args) {
		FirstNonRepeatChar firstNonRepeatChar = 
				new FirstNonRepeatChar();
		System.out.println(firstNonRepeatChar.
				firstUniqChar("loveleetcode"));
	}
}