package lv.tsi.practicalAssignments.practice1.exercise4;

//EXERCISE 4

public class Marathon {
    static String [] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    static int [] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265};

    public static void printResults(){
        System.out.println("Name\tResult");
        for(int i = 0; i < names.length; i++) {
             System.out.print(names[i]+"\t"+times[i]);
             System.out.println();

        }
    }



    public static void main(String[] args){
        Marathon mar = new Marathon();
        mar.printResults();
    }
}
