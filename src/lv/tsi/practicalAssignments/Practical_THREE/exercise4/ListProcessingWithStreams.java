package lv.tsi.practicalAssignments.Practical_THREE.exercise4;

import java.util.*;

public class ListProcessingWithStreams {

    public static class StreamExample {
        public static void print(String s) {
            System.out.println(s);
        }
    }
        public static void main(String[] args) {

            List<String> list = Arrays.asList("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");

            List<String> newList = list.stream()
                    .map((randomChar) -> randomChar.toUpperCase(Locale.ROOT))
                    .filter(randomChar -> randomChar.substring(0, 1).matches("C")).toList();

            newList.stream()
                    .sorted()
                    .forEach(StreamExample::print);
        }

    }
