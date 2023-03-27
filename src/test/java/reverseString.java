public class reverseString {

    public static void main(String[] args) {

        String string = "Hello";

        reverseString invertStr = new reverseString();

        System.out.println("Reverse String with StringBuffer class: "
                + invertStr.reverseWithStringBuffer(string));

        System.out.println("");

        System.out.println("Reverse String without StringBuffer class: "
                + invertStr.reverseWithoutStringBuffer(string));
    }

       public String reverseWithStringBuffer(String str) {

            StringBuffer buffer = new StringBuffer(str);
            buffer.reverse();
            return buffer.toString();
        }

        public String reverseWithoutStringBuffer(String str) {
            //int length = str.length();
            String original = str;
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                    reverse = reverse + original.charAt(i);
                }
            return reverse;
    }


    }
