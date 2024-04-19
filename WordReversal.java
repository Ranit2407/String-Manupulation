package StringManupulation;

public class WordReversal {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
    public static String reverseWords(String sentence){
        String words[] = sentence.split("\\s");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }
}
