package lv.tsi.practicalAssignments.Practical_TWO.exercise2;

public class SyncMain
{

    public static void main(String[] args)
    {
    final TaskManager tskMngr = new TaskManager();
    TaskThread thr1 = new TaskThread("Orca", 1, tskMngr);
    TaskThread thr2 = new TaskThread("Crab", 2, tskMngr);

    thr1.start();
    thr2.start();
    }
}
