package lv.tsi.practicalAssignments.Practical_THREE.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonEvaluator {
    List<Person> people = new ArrayList<>();

    public PersonEvaluator(List<Person> persons) { this.people = persons; }

    public void findAndPrint(){
        System.out.println("\nNames starting with P");
        people.stream()
                .filter(person -> person.name.substring(0, 1).matches("P")).toList()
                .forEach(System.out::println);

        System.out.println("\nPeople that age is above 18");
        people.stream()
                .filter(person -> person.age > 18)
                .forEach(System.out::println);
    }

    public void groupAndPrint(){
        System.out.println("\nPeople grouped by age");
        var result = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(result);
    }

    public void getAverageAge(){
        people.stream()
                .mapToDouble(person -> person.age)
                .average()
                .ifPresent(avg -> System.out.println("\nThe average age of all people is - " + avg));
    }


}
