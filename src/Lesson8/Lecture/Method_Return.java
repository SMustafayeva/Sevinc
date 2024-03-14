package Lesson8.Lecture;

public class Method_Return {
   int x;
   int y;
   String z;
   double a;
   double[] array;


   public int task1sum (int x, int y){
       return x+y;
    }

    public String task2(){
        for (int i = 1; i <x ; i++) {
            System.out.println(z);
        }
       return z;
    }

    public double averageArray(double[] numbers){
        double arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum+=numbers[i];
        };
       return (arraySum/numbers.length);
    }

public String evenNumber(){
       String evenNumber = (x%2==0) ? "Even number":"Odd number";
       System.out.println(evenNumber);
       return evenNumber;
}

}
