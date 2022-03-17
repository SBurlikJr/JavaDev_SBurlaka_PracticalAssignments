package lv.tsi.practicalAssignments.Practical_ONE.EX3;

import java.security.SecureRandom;

//EXERCISE 3

public class OneDimensionalArray {

    static double[][] twoDmArray;
    static double[] row;
    public static void printRow(double[] row){
        for(double i : row){
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    public double[][] createRandomArray(int size){
        double[][] twoDmArray = new double[size][size];

        for(int i = 0; i < twoDmArray.length; i++) {
            for(int j = 0; j < twoDmArray.length; j++) {
                twoDmArray[i][j] = new SecureRandom().nextInt(101);
            }
        }
        //Print Out Array
        for(double[] row : twoDmArray){
            printRow(row);
        }

        return twoDmArray;
    }

    public void maxElem(double[][] arr){
        //Max Element
        double max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println("Biggest Element: " + max);
    }

    public void minElem(double[][] arr){
        //Min Element
        double min = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        System.out.println("Smallest element: " + min);
    }
    public void averageElem(double[][] arr){
        double array = arr[0][0];
        double sum = 0;
        int count = 0;

        for (double[] doubles : arr) {
            for (int j = 0; j < arr.length; j++) {
                sum += doubles[j];
                count++;
            }
        }
        double average = sum / count;
        System.out.println("Average of array of elements: " + average);
    }


    public static void main(String[] args){
        OneDimensionalArray arrays = new OneDimensionalArray();
        double[][] arr = arrays.createRandomArray(5);
        arrays.averageElem(arr);
        arrays.maxElem(arr);
        arrays.minElem(arr);
    }

}
