import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortListOfStringsCollections {
    //Write code to sort the list of strings using Java collection
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("orange");
        myList.add("banana");
        myList.add("pear");

        Collections.sort(myList);
        printList(myList);
    }
        public static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
