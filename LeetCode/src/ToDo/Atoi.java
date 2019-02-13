class Atoi {

	public int myAtoi(String str) {
		int result = 0, sign = 1;
//		str.replace("([a-z])", " ");
//		str.replace("([A-Z])", " ");
		str.trim();

		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(str.charAt(i) == '+' || str.charAt(i) == '-')
				sign = str.charAt(i) == '+' ? 1 : -1;
			if(c < '0' || c > '9') continue;
			result = result*10 + c - '0';
		}
		return result * sign;
	}

public static void main(String [] args) {
	Atoi atoi = new Atoi();
	System.out.println(atoi.myAtoi("with 42"));
}
}


