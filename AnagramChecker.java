package StringManupulation;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = checkAnagram(str1, str2);

        if (areAnagrams) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }
    public static boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        str1=str1.replaceAll("\\s","");
        str2=str2.replaceAll("\\s","");

        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);

    }
}
