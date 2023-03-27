import java.util.HashSet;
import java.util.Set;

public class longestSubstring {
    //Write a Java program to find the longest substring from a given
// string which doesn’t contain any duplicate characters
    public static void main(String[] args) {
        String newString = "MMAndrii";
        System.out.println(findLongestString(newString));
    }
    public static String findLongestString(String str) {
       String longestSubstring = ""; //we first initialize the longest substring to an empty string
        Set<Character>mySet = new HashSet<>(); //and create a hash set to keep track of the characters in the current substring
       int i=0; int j=0; //We also initialize two pointers i and j to the beginning of the string.

        while (j<str.length()) {  //We then iterate through the string with j, checking each character as we go
            if (!mySet.contains(str.charAt(j))) {
                mySet.add(str.charAt(j)); //If the character is not in the hash set, we add it and update the longest substring
                j++;
                if(j - i > longestSubstring.length()) {
                    longestSubstring = str.substring(i,j);
                }
            } else {                           //If the character is already in the hash set,
                mySet.remove(str.charAt(i));  //we remove the character at i and increment i to move the start of the substring forward.
                i++;
            }
        }
            return longestSubstring;
    }
}





