package lv.tsi.practicalAssignments.Practical_THREE;

public class Lambda {


    void isAlive(Animals animals, boolean air){
        if(animals.breath(air)){
            System.out.println("Alive");

        } else {
            System.out.println("Dead");
        }
    }



    public static void main(String[] args) {

        var lambda = new Lambda();

        //Regular Way
        lambda.isAlive(new Animals() {
            @Override
            public boolean breath(boolean air) {
                return true;
            }
        }, true);

        //Lambda way
        lambda.isAlive((air) -> !air, true);
    }
}
