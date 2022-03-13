package lv.tsi.practicalAssignments.practice1;

import java.security.SecureRandom;

//EXERCISE 3

public class OneDimensionalArray {
//    public void playWithArrays() {
//        int[] intArray = new int[20];
//
//        for(int i = 0; i < intArray.length; i++){
//            intArray[i] = new SecureRandom().nextInt();
//        }
//
//        for(int i = 0; i < intArray.length; i++){
//            System.out.printf("\nItem at index: %d is %d", i, intArray[i]);
//        }
//
//        java.util.Arrays.stream(intArray)
//                .map(val -> Math.max(val, 0))
//                .mapToObj(val -> String.valueOf(val))
//                .forEach(System.out::println);
//    }
    static double[][] twoDmArray;
    static double[] row;
    public static void printRow(double[] row){
        for(double i : row){
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    public void createRandomArray(int size){
        double[][] twoDmArray = new double[size][size];
        double sum = 0;



        for(int i = 0; i < twoDmArray.length; i++) {
            for(int j = 0; j < twoDmArray.length; j++) {
                twoDmArray[i][j] = new SecureRandom().nextInt(101);
            }
        }
        //Print Out Array
        for(double[] row : twoDmArray){
            printRow(row);
        }

        //Sum of the elements
        for(int i = 0; i < twoDmArray.length; i++){
            for (int j = 0; j < twoDmArray.length; j++){
                sum += twoDmArray[i][j];
            }
        }
        double average = sum / (twoDmArray.length * twoDmArray.length);
        System.out.println("Average of array of elements: " + average);

        //Max Element
        double max = twoDmArray[0][0];
        for(int i = 0; i < twoDmArray.length; i++){
            for (int j = 0; j < twoDmArray.length; j++){
                if(twoDmArray[i][j] > max)
                    max = twoDmArray[i][j];
            }
        }
        System.out.println("Biggest Element: " + max);


        //Min Element
        double min = twoDmArray[0][0];
        for(int i = 0; i < twoDmArray.length; i++){
            for (int j = 0; j < twoDmArray.length; j++){
                if(twoDmArray[i][j] < min)
                    min = twoDmArray[i][j];
            }
        }
        System.out.println("Smallest element: " + min);
    }




    public static void main(String[] args){
        OneDimensionalArray arrays = new OneDimensionalArray();
        arrays.createRandomArray(5);

    }

}
