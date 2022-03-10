package tsi.lv.whenThingsGoWrong;

public class Test {

    public static void main(String[] args)
    {

        var b = new HandlingErrors();

        try {
            b.divide(10 , 5);
        } catch (CustomException e) {
            e.printStackTrace();
        }

        int[] array = new int[]{1,2,3,4,5,6};

        b.getItemFromArray(array, 0);

    }


}
