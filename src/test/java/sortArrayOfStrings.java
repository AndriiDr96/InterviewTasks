import java.util.Arrays;
import java.util.List;

public class sortArrayOfStrings {
    //Write code to sort the list of strings
    public static void main(String[] args) {
        String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "aug", "Sep", "Oct", "nov", "Dec" };
        //print original array
        printList(inputList);
        //sort in ascending order using
        Arrays.sort(inputList);
        printList(inputList);
    }
    public static void printList(String[] array){
        for(String str: array){
           System.out.print(str + " ");
        }
     System.out.println();
    }
}
