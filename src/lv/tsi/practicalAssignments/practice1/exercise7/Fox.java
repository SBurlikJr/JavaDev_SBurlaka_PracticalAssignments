package lv.tsi.practicalAssignments.practice1.exercise7;

public class Fox implements Wild{
    int age = 0;

    public Fox(int number){
        age = number;
    }

    @Override
    public void printAge() {
        System.out.println("This fox is " + age + " year(s) old");
    }
}
