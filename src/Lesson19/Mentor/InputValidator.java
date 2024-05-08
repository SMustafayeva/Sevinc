package Lesson19.Mentor;

public class InputValidator {

    boolean validateNumberInput(String number) {
        return number.matches("-?\\d+(\\.\\d+)?");
    }
    boolean validateTextInput(String text) {
        return text.matches("[a-zA-Z]+");
    }
    boolean validateSpecialCharacterInput(String character) {
        return character.matches(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*");
    }
    InputCategory categorizeInput(String input) {
        if (validateNumberInput(input)) {
            return InputCategory.NUMBER;
        } else if (validateTextInput(input)) {
            return InputCategory.TEXT;
        } else if (validateSpecialCharacterInput(input)) {
            return InputCategory.SPECIAL_CHARACTER;
        } else {
            return null;
        }
    }
}
