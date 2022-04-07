package lv.tsi.practicalAssignments.Practical_TWO.exercise3;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread
{
    BlockingQueue queue;

    public AddingThread(BlockingQueue queue)
    {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int k = 1; k <= 3; k++){
            queue.add("Element" + k);
            System.out.println("The element Element" + k + " has been added to the queue");
        }
    }
}