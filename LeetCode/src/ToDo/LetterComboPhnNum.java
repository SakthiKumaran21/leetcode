import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterComboPhnNum {
  List<String> output = new ArrayList<String>();

  public void backtrack(String combination, String next_digits, Map<String, String> phone) {
    // if there is no more digits to check
    if (next_digits.length() == 0) {
      // the combination is done
      output.add(combination);
    }
    // if there are still digits to check
    else {
      // iterate over all letters which map 
      // the next available digit
      String digit = next_digits.substring(0, 1);
      String letters = phone.get(digit);
      for (int i = 0; i < letters.length(); i++) {
        String letter = phone.get(digit).substring(i, i + 1);
        // append the current letter to the combination
        // and proceed to the next digits
        backtrack(combination + letter, next_digits.substring(1), phone);
      }
    }
  }

  public List<String> letterCombinations(String digits, Map<String, String> phone) {
    if (digits.length() != 0)
      backtrack("", digits, phone);
    return output;
  }


	public static void main(String [] args) {
		Map<String, String> phone = new HashMap<>();
		  phone.put("2", "abc");
		  phone.put("3", "def");
		  phone.put("4", "ghi");
		  phone.put("5", "jkl");
		  phone.put("6", "mno");
		  phone.put("7", "pqrs");
		  phone.put("8", "tuv");
		  phone.put("9", "wxyz");
		LetterComboPhnNum let = new LetterComboPhnNum();
		System.out.println(let.letterCombinations("23", phone));
	}
}
