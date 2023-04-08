import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicatesFromArray {
    public static void main(String[] args) {
        Integer[] myArray = {1, 2, 3, 2, 4, 1, 5, 1, 3, 6};
        //Call the removeDuplicates method
        ArrayList<Integer> uniqueLIst = removeDuplicates(myArray);

        System.out.println(uniqueLIst);
    }
    public static ArrayList<Integer> removeDuplicates(Integer[] arr) {
        //we use a HashSet to filter out the duplicates.
        //We iterate through the array and add each element to the set.
        //Since a HashSet only contains unique elements, duplicates are automatically filtered out.
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        //Next, we convert the HashSet back to an ArrayList using the ArrayList constructor
        // that takes a Collection as input.
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        return uniqueList;

    }
    }

