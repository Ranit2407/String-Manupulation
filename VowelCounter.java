package StringManupulation;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter To check Vowels");
        String str=sc.nextLine();
        System.out.println(str+" has "+countVowel(str)+" vowels");
    }
    public static int countVowel(String str){
        str=str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
}
