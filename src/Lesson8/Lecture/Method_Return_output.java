package Lesson8.Lecture;

public class Method_Return_output {
    public static void main(String[] args) {
     Method_Return methodReturn = new Method_Return();
     methodReturn.x=6;
     methodReturn.y=7;
     System.out.println(methodReturn.task1sum(6,7));

     methodReturn.z = "Building";
     System.out.println(methodReturn.task2());

     double[] d1 = {5.8,7.50};

        System.out.println(methodReturn.averageArray(d1));


        methodReturn.evenNumber();
    }
}
