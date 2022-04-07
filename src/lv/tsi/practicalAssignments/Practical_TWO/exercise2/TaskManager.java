package lv.tsi.practicalAssignments.Practical_TWO.exercise2;

public class TaskManager
{

    void performTask(int taskId, String name)
    {

        System.out.println(name + " " + taskId);
        try {
            Thread.sleep(4);
        } catch(InterruptedException exception){
            exception.printStackTrace();
        }

        System.out.println(name + " " + taskId);
    }
}