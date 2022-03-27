package lv.tsi.practicalAssignments.Practical_THREE.exercise1;

import java.util.Arrays;
import java.util.List;


public class ListProcessingWithStreams {


    public static void main(String[] args){

        List<String> list = Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

        String first = list.get(0);

        System.out.println(first);
    }
}
