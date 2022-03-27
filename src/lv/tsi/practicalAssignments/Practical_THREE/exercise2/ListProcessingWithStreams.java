package lv.tsi.practicalAssignments.Practical_THREE.exercise2;

import java.util.Arrays;
import java.util.List;

public class ListProcessingWithStreams {


    public static void main(String[] args){

        List<String> list = Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
}
