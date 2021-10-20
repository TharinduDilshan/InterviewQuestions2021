import java.util.HashMap;
import java.util.Map;

//Given a string, count the frequency/occurence of each Character
public class FindTheOccurenceOfCharacter {
    static HashMap<Character, Integer> getOccurence(String inputString) {
        HashMap<Character, Integer> characterFrequencyMap
        = new HashMap<Character, Integer>();


    char[] inputArray = inputString.toLowerCase().toCharArray();

    for (char character : inputArray) {
        if (characterFrequencyMap.containsKey(character)) {
            characterFrequencyMap.put(character, characterFrequencyMap.get(character) + 1);
        }
        else {
            characterFrequencyMap.put(character, 1);
        }
    }

    return characterFrequencyMap;
    }

    static void  printOccurence(HashMap<Character, Integer> map){
        for (Map.Entry<Character, Integer> value: map.entrySet()) {
            System.out.println(value.getKey() + "->" + value.getValue());
        }
    }

    public static void main(String[] args) {
        String inputString = "Test";

        HashMap<Character, Integer> map = getOccurence(inputString);

        printOccurence(map);
        
    }
}