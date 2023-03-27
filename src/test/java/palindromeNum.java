public class palindromeNum {
    public static void main(String[] args) {

        int num = 121;
        int rev = 0;
        int temp = num;
                                  //loop
        while (num>0){            //step 1           step 2           step 3
            rev = rev*10;         //rev = 0          rev = 1*10=10    rev = 12*10=120
            rev = rev + num%10;   //rev = 0+1=1      rev = 10+2=12    rev = 120+1=121
            num = num/10;         //num = 121/10=12  num = 12/10=1    num = 1/10=0
        }
        if(rev==temp){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
