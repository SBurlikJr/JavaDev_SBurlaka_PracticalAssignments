package lv.tsi.practicalAssignments.practice1;

//EXERCISE 2

public class FactorialCalculator {
    //Recursive call method
    public int factorial(int num) {

        if(num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    //Loop method
    public long factorialLoop(int num) {
        long fact = num;

        for(int i = num; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args){
        FactorialCalculator recursion = new FactorialCalculator();
        long factorialResult = recursion.factorial(5);
        System.out.println(factorialResult);
    }
}
