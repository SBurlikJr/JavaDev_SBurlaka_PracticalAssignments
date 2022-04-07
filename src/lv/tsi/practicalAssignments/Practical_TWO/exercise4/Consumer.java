package lv.tsi.practicalAssignments.Practical_TWO.exercise4;

import java.security.SecureRandom;

public class Consumer extends Thread
{
    final Goods goods;

    public Consumer(Goods goods)
    {
        this.goods = goods;
    }

    @Override
    public void run()
    {
        var goods = new SecureRandom().nextInt(100000);

        System.out.println("Consumed: " + goods);
    }
}