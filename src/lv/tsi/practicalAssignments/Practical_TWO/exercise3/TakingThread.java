package lv.tsi.practicalAssignments.Practical_TWO.exercise3;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread
{
    BlockingQueue queue;

    public TakingThread(BlockingQueue queue)
    {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(queue.take());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}