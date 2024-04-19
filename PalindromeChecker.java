package StringManupulation;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Enter String to check palindrome");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(isPalindrome(str)){
            System.out.println(str+" is Palindrome");
        }
        else{
            System.out.println(str+" is not Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        char charArray[]=str.toCharArray();
        int left=0;
        int right=charArray.length-1;
        while(left<right){
            if(charArray[left] != charArray[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
