package lv.tsi.practicalAssignments.practice1.exercise7;

public class Dog implements Domestic {
    private String name = "";

    public Dog(String n){
        name = n;
    }

    @Override
    public void printName() {
        System.out.println("Dog's name is " + name);
    }
}

