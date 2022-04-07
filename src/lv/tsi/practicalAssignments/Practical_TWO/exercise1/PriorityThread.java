package lv.tsi.practicalAssignments.Practical_TWO.exercise1;

public class PriorityThread extends Thread
{

    public PriorityThread(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        for(int k = 0; k < 100; k++)
        {
            System.out.println(getName() + 1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
    }

}
