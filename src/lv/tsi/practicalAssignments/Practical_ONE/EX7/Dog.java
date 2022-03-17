package lv.tsi.practicalAssignments.Practical_ONE.EX7;

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

