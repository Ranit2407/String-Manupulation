package StringManupulation;

public class AcronymGenerator {
    public static void main(String[] args) {
        String sentence = "artificial intelligence";
        String acronym = generateAcronym(sentence);
        System.out.println("Acronym for \"" + sentence + "\": " + acronym);
    }
    public static String generateAcronym(String sentence){
        String words[] = sentence.split("\\s");
        StringBuilder acronymSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                acronymSentence.append(firstLetter);
            }
        }

        return acronymSentence.toString();
    }
}
