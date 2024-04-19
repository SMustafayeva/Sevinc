package Lesson16.Mentor.PasswordValidation;

public class PasswordValidation extends Exception{
    //    private static final Pattern[] inputRegexes = new Pattern[4];
//
//    static {
//        inputRegexes[0] = Pattern.compile(".*[A-Z].*");
//        inputRegexes[1] = Pattern.compile(".*[a-z].*");
//        inputRegexes[2] = Pattern.compile(".*\\d.*");
//        inputRegexes[3] = Pattern.compile(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*");
//    }

    public void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("The password must be at least 8 characters long.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("The password must contain at least one uppercase letter.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("The password must contain at least one lowercase letter.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("The password must contain at least one digit.");
        }
        if (!password.matches(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*")) {
            throw new InvalidPasswordException("The password must contain at least one symbol.");
        }
    }
}
