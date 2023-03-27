public class reverseNumber {
//Write a function to reverse a number in Java?
    public static void main(String[] args) {
        int myNum = 2345;
        System.out.println(reverseNum(myNum));

    }
      public static int reverseNum(int num){
        int reversed = 0;
        int lastDigit;

        while (num>0){
            lastDigit = num%10;  //getting last digit
            reversed = reversed*10 + lastDigit;  //combine last digit with previous digit
            num = num/10;         //remove last digit from number
        }
        return reversed;

    }
}
