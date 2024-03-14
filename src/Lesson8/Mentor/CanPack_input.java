package Lesson8.Mentor;

public class CanPack_input {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount == 1 || goal == 4) {
            return false;
        } else if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            if (bigCount == 1 || goal % 5 == 0) {
                return true;
            } else if (bigCount == 0 || goal < 5) {
                return true;
            } else if (bigCount * 5 <= goal || goal % 5 != 0) {
                return true;
            }
        }
        return false;
    }
//    public static boolean canPack (int bigCount, int smallCount, int goal){
//        if (bigCount == 1 || goal % 5 == 0) {
//        } else if (bigCount == 0 || goal < 5) {
//            //         System.out.println("True");
//        } else if (bigCount * 5 <= goal || goal % 5 != 0) {
//            //         System.out.println("True");
//        };
 //   } return true;
}


//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount == 1 || goal == 4) {
//            System.out.println("False");
//        } else if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            System.out.println("False");
//        }  else {
//            if (bigCount == 1 || goal % 5 == 0) {
//            } else if (bigCount == 0 || goal < 5) {
//                System.out.println("True");
//            } else if (bigCount * 5 <= goal || goal % 5 != 0) {
//                System.out.println("True");
//            };
//
//        }return false;




