package Lesson19.Mentor;

public class CharacterDeterminator {
    public static CharacterType getType(boolean outgoing, boolean alone, boolean both) {
        CharacterType type;
        if(outgoing && !alone){
            type = CharacterType.EXTROVERT;
        } else if (!outgoing && alone) {
            type = CharacterType.INTROVERT;
        } else if (both) {
            type = CharacterType.AMBIVERT;
        } else {
            type = CharacterType.OMNIVERT;
        }
        return type;
    }
}
