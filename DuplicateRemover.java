package StringManupulation;

public class DuplicateRemover {
    public static void main(String[] args) {
        String str = "hello world";
        String result = removeDuplicates(str);
        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + result);

    }
    public static String removeDuplicates(String str){
        StringBuilder uniqueChar=new StringBuilder();
        boolean[] visited=new boolean[256];

        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            if(!visited[currentChar]){
                uniqueChar.append(currentChar);
                visited[currentChar]=true;
            }
        }
        return uniqueChar.toString();

    }
}
