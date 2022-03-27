package lv.tsi.practicalAssignments.Practical_THREE.exercise3;

import java.util.Arrays;
import java.util.List;


public class ListProcessingWithStreams {

    public static class StreamExample {
        public static void print(String s) {
            System.out.println(s);
        }
    }
        public static void main(String[] args) {

            List<String> list = Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

            List<String> newList = list.stream()
                    .filter(student -> student.substring(0, 1).matches("b")).toList();
            newList.stream()
                    .forEach(StreamExample::print);
        }

    }
