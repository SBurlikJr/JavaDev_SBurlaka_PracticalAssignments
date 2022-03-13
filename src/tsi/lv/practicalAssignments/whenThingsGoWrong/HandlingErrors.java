package tsi.lv.practicalAssignments.whenThingsGoWrong;

public class HandlingErrors {

    //Exceptions

    //Checked/Unchecked

    //RuntimeExceptions etc.


    int divide(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("bruh");
        }

        return a / b;
    }

    int getItemFromArray(int[] array, int index) {
        if(index >= array.length) {
            throw new CustomUnCheckedException("Error");
    }

        System.out.println("Item array is: ");
        return array[index];
}







//    void divide(int a, int b) {
//        try {
//            System.out.println(a/b);
//        } catch (RuntimeException exception) {
//            System.out.println("error occured while dividing");
//        }
//    }
//
//
//    void addnumber(int a, int b)
//    {
//        if(a < 0 || b < 0){
//            //error();
//        }
//
//
//    }
//
//
//
//    void error() throws Exception {
//        throw new Exception("Error Occured");
//    }

}
