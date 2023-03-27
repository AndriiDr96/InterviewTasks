import java.lang.reflect.Array;

public class findTwoMaxValueArray {
    //Write a Java program to find out the first two max values from an array
    public static void main(String[] args) {
        int[] newArray = {8, 2, 3, 4};

        findTwoMax(newArray);
    }
    public static void findTwoMax(int[] myArray) {
        int maxOne = 0;
        int maxTwo = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxOne) {
                maxTwo = maxOne;
                maxOne = myArray[i];
            } else if (myArray[i] > maxTwo) {
                maxTwo = myArray[i];
            }
        }
        System.out.println("Max1 " + maxOne );
        System.out.println("MAx2 " + maxTwo);
    }
}