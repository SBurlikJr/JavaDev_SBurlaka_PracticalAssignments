package lv.tsi.practicalAssignments.Practical_ONE.EX7;

public class Animals {
    public static void main(String[] args){
        Domestic c = new Cat("Kitty Cat");
        Domestic d = new Dog("Iggy");
        Wild f = new Fox(14);
        c.printName();
        d.printName();
        f.printAge();
    }
}
