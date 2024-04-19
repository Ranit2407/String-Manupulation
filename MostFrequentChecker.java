package StringManupulation;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentChecker {
    public static void main(String[] args) {
        String str = "hello world";
        char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most frequent character in \"" + str + "\": " + mostFrequentChar);
    }
    public static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the maximum count
        char mostFrequentChar = '\0'; // Default value if the string is empty
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequentChar;
    }
}
