package lv.tsi.practicalAssignments.Practical_TWO.exercise4;

public class Goods
{
    int amount;
    boolean transfer = true;

    synchronized void produce(int amount)
    {
        while(!transfer){
            try {
                wait();
            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        transfer = false;

        this.amount = amount;
        notify();
    }

    synchronized int consume()
    {
        while(transfer){
            try{
                wait();
            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        transfer = true;

        return amount;
    }
}