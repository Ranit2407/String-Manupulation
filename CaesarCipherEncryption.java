package StringManupulation;

public class CaesarCipherEncryption {
    public static void main(String[] args) {
        String plaintext = "ATTACKATONCE";
        int key = 4;

        String encryptedText = encrypt(plaintext, key);
        System.out.println("Encrypted text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted text: " + decryptedText);
    }
    public static String encrypt(String text,int key){
        StringBuilder encryptedText=new StringBuilder();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(Character.isUpperCase(ch)){
                char encryptedChar = (char) ('A' + (ch - 'A' + key) % 26);
                encryptedText.append(encryptedChar);
            }
            else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char) ('a' + (ch - 'a' + key) % 26);
                encryptedText.append(encryptedChar);
            }
            else{
                encryptedText.append(ch);
            }
        }
        return encryptedText.toString();
    }
    public static String decrypt(String encryptedText, int key) {
        // Decryption is just the reverse of encryption with a negative key
        return encrypt(encryptedText, -key);
    }
}
