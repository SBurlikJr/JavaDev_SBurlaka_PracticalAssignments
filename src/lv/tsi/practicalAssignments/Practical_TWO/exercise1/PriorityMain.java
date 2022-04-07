package lv.tsi.practicalAssignments.Practical_TWO.exercise1;

public class PriorityMain {

    public static void main(String[] args)
    {
        PriorityThread thr1 = new PriorityThread("min");
        PriorityThread thr2 = new PriorityThread("max");
        PriorityThread thr3 = new PriorityThread("norm");

        thr1.start();
        thr2.start();
        thr3.start();

    }
}
