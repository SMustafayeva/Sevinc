package Lesson8.Mentor;

public class CanPack_output {
    public static void main(String[] args) {
        CanPack_input p = new CanPack_input();
        System.out.println(CanPack_input.canPack(1,0,4));
        System.out.println(CanPack_input.canPack(1,0,5));
        System.out.println(CanPack_input.canPack(0,5,4));
        System.out.println(CanPack_input.canPack(2,2,11));
        System.out.println(CanPack_input.canPack(-3,2,12));
    }
}
