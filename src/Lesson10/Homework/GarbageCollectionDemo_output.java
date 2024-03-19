package Lesson10.Homework;

public class GarbageCollectionDemo_output {
    public static void main(String[] args) {
        GarbageCollectionDemo phone1 = new GarbageCollectionDemo("Samsung");
        System.out.println("Phone: " + phone1.getPhone());

        GarbageCollectionDemo phone2 = new GarbageCollectionDemo("iPhone");
        System.out.println("Phone: " + phone2.getPhone());
        phone1 = null;
        System.out.println("Phone 1 set to null.");
        System.gc();
        System.out.println("Requested garbage collection.");


//        if (phone1==null){
//            System.out.println("Phone 1 is null");
//        } else {
//            System.out.println("Phone 1 is null");
//        }
    }
}
