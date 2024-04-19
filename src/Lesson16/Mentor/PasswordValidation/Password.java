package Lesson16.Mentor.PasswordValidation;

import Lesson12.Mentor.Song;

public class Password extends PasswordValidation {

    public static void main(String[] args) {
        PasswordValidation p = new PasswordValidation();
        try {
            p.validatePassword("Laboratory123$");
        } catch (InvalidPasswordException e ){
            System.out.println(e.getMessage());
        }
    }
}
