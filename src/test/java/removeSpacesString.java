public class removeSpacesString {
    public static void main(String[] args) {

        String newString = " This is my java code ";
        System.out.println(removeSpaces(newString));
    }

    public static String removeSpaces(String str) {
        String noSpacesString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                noSpacesString = noSpacesString + str.charAt(i);
            }
        }
        return noSpacesString;
    }
}
