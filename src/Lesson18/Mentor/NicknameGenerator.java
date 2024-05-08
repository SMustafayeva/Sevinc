package Lesson18.Mentor;

public class NicknameGenerator {
    public static void main(String[] args) {
        String name = "Sevinj ";
        String surname = "Mustafayeva ";
        int birthYear = 1991;
      //  String nickname = name + surname + birthYear;
        String nickname = name.concat(surname).concat(String.valueOf(birthYear));
        //System.out.println(nickname);

        StringBuilder builder = new StringBuilder();
        builder.append(name.substring(0,3));
        builder.append(surname.substring(0,4));
        builder.append(birthYear%100);
        String nickName = builder.toString();
        System.out.println(nickName);
    }
}
