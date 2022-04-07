package lv.tsi.practicalAssignments.Practical_TWO.exercise4;

import java.security.SecureRandom;

public class Producer extends Thread
{
    final Goods goods;

    public Producer(Goods goods)
    {
        this.goods = goods;
    }

    @Override
    public void run()
    {
        var goods = new SecureRandom().nextInt(100000);

        System.out.println("Produced: " + goods);
    }
}