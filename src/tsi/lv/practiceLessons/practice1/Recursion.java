package tsi.lv.practiceLessons.practice1;

public class Recursion {

    public int factorial(int num) {

        if(num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }
    public long factorialLoop(int num) {
        long fact = num;

        for(int i = num; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args){
        Recursion recursion = new Recursion();
        long factorialResult = recursion.factorial(5);
        System.out.println(factorialResult);
    }
}
