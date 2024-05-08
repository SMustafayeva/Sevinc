package Lesson19.Mentor;

public enum InputCategory {
    NUMBER("Number"),
    TEXT("Text"),
    SPECIAL_CHARACTER("Special character");
    private final String category;

    InputCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
}
