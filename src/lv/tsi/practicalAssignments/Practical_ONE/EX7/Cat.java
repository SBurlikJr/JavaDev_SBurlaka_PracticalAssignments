package lv.tsi.practicalAssignments.Practical_ONE.EX7;

public class Cat implements Domestic {
    private String name = "";

    public Cat(String n){
        name = n;
    }

    @Override
    public void printName() {
        System.out.println("Cat's name is " + name);
    }
}
