//Prints the First Repeating Character in a given String

import java.util.LinkedHashMap;
import java.util.Set;

class FirstRepeatingCharacter {

	public static void firstRepeatingChar(String inputString) {
		LinkedHashMap<String, Integer> stringValues = new LinkedHashMap<String, Integer>();
		String[] stringArray = inputString.replaceAll(" ", "").toLowerCase().split("");

		// Iterating through the Input String and storing the character with values in
		// HashMap
		for (int i = 0; i < stringArray.length; i++) {
			if (stringValues.containsKey(stringArray[i])) {
				stringValues.put(stringArray[i], stringValues.get(stringArray[i]) + 1);
			}

			else {
				stringValues.put(stringArray[i], 1);
			}
		}

		// Iterating through HashMap and fetching the First repeating character in
		// string
		int counter =0;
		Set<String> keyvalues = stringValues.keySet();
		for (String s : keyvalues) {
			if (stringValues.get(s) > 1) {
				System.out.println("First Repeating character in given String is:" + s);
				counter++;
				break;
			}
		}
		
		if(counter==0)
		{
			System.out.println("No repeating character in given String");
		}

	}

	public static void main(String[] args) {
		firstRepeatingChar("Testing");
	}

}
