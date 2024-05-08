package Lesson18.Mentor;

import static Lesson18.Mentor.Cipher.decrypt;
import static Lesson18.Mentor.Cipher.encrypt;

public class Caesar {
    public static void main(String[] args) {
        Cipher encrypt = new Cipher();
        String text = "ALL ROADS LEAD TO ROME";
        int key = 3;
        String encrypted = encrypt(text, key);
        System.out.println("Encrypted text: " + encrypted);
        String decrypted = decrypt(encrypted,key);
        System.out.println("Decrypted text: " + decrypted);
    }
}
