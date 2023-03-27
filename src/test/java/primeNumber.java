public class primeNumber {
    //Write a method to check num is prime or not
    public static void main(String[] args) {
        int myNum = 7;
        System.out.println(findPrimeNum(myNum));
    }
    public static String findPrimeNum(int num) {
        int count = 0;
        String result;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            result = "Prime";
            //System.out.println("Prime");
        } else {
            //System.out.println("Not prime");
            result = "Not prime";
        }
        return result;
    }
}
