package tsi.lv;

/**
 *
 * x (t) = (t ^ 2) * a * 0.5 + v0 * t + x0
 */

public class Calculator {


    public static final double GRAVITY_CONSTANT = -9.81;
    public static final double HALF_CONSTANT = 0.5;


    // fallingTime, initialPosition, initialVelocity

    int fallingTime = 0;
    double initialPosition = 0;
    double initialVelocity = 0;


    public Calculator() {}

    public Calculator(int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

    public void calculate() {
        double finalPosition = (Math.pow(fallingTime, 2)
                * GRAVITY_CONSTANT
                * HALF_CONSTANT + initialVelocity
                * fallingTime + initialPosition);
        System.out.println ("Position in " + fallingTime + " seconds: " + finalPosition);
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator(4,2,3);

        calculator.calculate();
    }
}
