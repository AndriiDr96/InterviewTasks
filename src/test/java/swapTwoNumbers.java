public class swapTwoNumbers {

    public static void main(String[] args) {

        int numX = 10;
        int numY = 20;
        System.out.println("Pre-swapping state:");
        System.out.println("numX value: " + numX);
        System.out.println("numY value: " + numY);

        System.out.println("");

        numX = numX + numY;  //30
        numY = numX - numY;  //10
        numX = numX - numY;  //20
        System.out.println("Post-swapping state:");
        System.out.println("numX value: " + numX);
        System.out.println("numY value: " + numY);

    }
}
