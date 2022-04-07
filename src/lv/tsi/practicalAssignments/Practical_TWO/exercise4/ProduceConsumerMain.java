package lv.tsi.practicalAssignments.Practical_TWO.exercise4;

public class ProduceConsumerMain
{
    public static void main(String[] args)
    {
        Goods goods = new Goods();
        Consumer consumer = new Consumer(goods);
        Producer producer = new Producer(goods);

        producer.start();
        consumer.start();
    }
}