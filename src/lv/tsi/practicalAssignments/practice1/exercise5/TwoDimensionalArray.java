package lv.tsi.practicalAssignments.practice1.exercise5;

import java.security.SecureRandom;

public class TwoDimensionalArray {

    public int[][] createRandomArray(int size) {
        int[][] arr = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++){
                arr[i][j] = new SecureRandom().nextInt(101);
            }
        }
        return arr;
    }


    public void AverageValueOfColumn(int[][] array) {
        float average;
        int count;

        for (int i = 0; i < array.length; i++) {
            average = 0;
            count = 0;

            for(int[] ints : array) {
                average += ints[i];
                count++;
            }
            if(i+1 == 1){
                System.out.println("An average value of " + (i + 1) + "st column is " + average/count);
            } else if (i+1 == 2){
                System.out.println("An average value of " + (i + 1) + "nd column is " + average/count);
            } else if (i+1 == 3){
                System.out.println("An average value of " + (i + 1) + "rd column is " + average/count);
            } else {
                System.out.println("An average value of " + (i + 1) + "th column is " + average/count);
            }

        }
    }

    public void print(int[][] arr) {
        for(int[] ints : arr) {
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        TwoDimensionalArray twoDmArr = new TwoDimensionalArray();

        int[][] array = twoDmArr.createRandomArray(5);

        twoDmArr.print(array);
        twoDmArr.AverageValueOfColumn(array);
    }
}



