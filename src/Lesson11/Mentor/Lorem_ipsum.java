package Lesson11.Mentor;

public class Lorem_ipsum {
    public static void main(String[] args) {
//        Lorem_ipsum text = new Lorem_ipsum();
        //  когда пишем статик нет необходимости в создании нового объекта
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String text2 = """
                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
                when an unknown printer took a galley of type and scrambled it to make a type
                specimen book. It has survived not only five centuries, but also the leap into
                electronic typesetting, remaining essentially unchanged.""";
        System.out.println(lorem(text2));
        System.out.println(charOccurrences(text2,'a'));
    }
    public static int lorem (String text){
        String [] words = text.split("\\s+");
        return words.length;
    }
    public static int charOccurrences (String text, char target) {
        int letter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)== target){
                letter++;
            }
        }return letter++;
    }
}


