import java.util.Arrays;

class DuplicateInArray {
	public int result(int[] input) {
		Arrays.sort(input);
		for(int i = 1; i < input.length; i++) {
			if(input[i] == input[i-1]) {
				return input[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] inp = {1, 3, 4,  5, 2};
		DuplicateInArray obj = new DuplicateInArray();
		System.out.println(obj.result(inp));
	}
}