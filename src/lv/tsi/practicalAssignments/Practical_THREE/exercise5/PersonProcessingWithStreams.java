package lv.tsi.practicalAssignments.Practical_THREE.exercise5;

import java.util.ArrayList;

import java.util.List;

public class PersonProcessingWithStreams {

    public static void main(String[] args) {

        List<Person> listOfPeople = new ArrayList<>();

        listOfPeople.add(new Person("Max", 28));
        listOfPeople.add(new Person("Peter", 22));
        listOfPeople.add(new Person("Anna", 28));
        listOfPeople.add(new Person("Lilianna", 16));
        listOfPeople.add(new Person("Pamela", 13));
        listOfPeople.add(new Person("David", 22));

        listOfPeople.forEach(System.out::println);

        PersonEvaluator personEvaluator = new PersonEvaluator(listOfPeople);

        personEvaluator.findAndPrint();
        personEvaluator.groupAndPrint();
        personEvaluator.getAverageAge();

    }
}
