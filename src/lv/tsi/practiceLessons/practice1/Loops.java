package lv.tsi.practiceLessons.practice1;

public class Loops {
    public void demoForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is for loop: i = " + i);
        }
    }

    public void demoWhileLoop() {
            int flag = 0;
            while (flag < 10){
                System.out.println("This is while loop: flag = " + flag);
                flag++;
            }
        }

    public void demoDoWhileLoop() {
        int flag = 0;
        do {
        flag++;
        System.out.println("This is do while loop: flag = " + flag);
        }while(flag < 10);
    }




    public static void main(String[] args){
        Loops loops = new Loops();
        loops.demoForLoop();
        loops.demoWhileLoop();
    }


}

