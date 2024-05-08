package Lesson18.Mentor;

public class Cipher {
    public static String encrypt (String text, int key) {
        StringBuilder encrypt = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter)) {
                char displaced = (char) ('A' + (letter - 'A' + key) % 26);
                encrypt.append(displaced);
            } else {
                encrypt.append(letter);
            }
        }
        return encrypt.toString();
    }
   public static String decrypt (String encryptedText, int key){
        StringBuilder decrypt = new StringBuilder();
       for (int i = 0; i < encryptedText.length(); i++) {
           char letter = encryptedText.charAt(i);
           if (Character.isLetter(letter)){
               char displaced = (char) ('A' + (letter - 'A' - key + 26) % 26);
               decrypt.append(displaced);
           } else{
               decrypt.append(letter);
           }
       } return decrypt.toString();
    }

}
