package lv.tsi.practicalAssignments.Practical_TWO.exercise3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class BlockingMain
{

    public static void main(String[] args)
    {
        final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        AddingThread addingThr = new AddingThread(queue);
        TakingThread takingThr = new TakingThread(queue);

        addingThr.start();
        takingThr.start();
    }
}