package LeetCode;

public class ReverseInteger {

    public static int reverseInt(int n){

        int rev = 0; // reversed number
        int rem;   // remainder

        while(n>0){

            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }

        return rev;
    }

    // stores reversed number
//    static int rev = 0;
//    public static void reverseIntRec(int n){
//
//        if(n<=0)
//            return ;
//
//        int rem = n%10;  // remainder
//
//        rev = (rev*10) + rem;
//
//        reverseIntRec(n/10);
//    }
//    public static void main (String[] args) {
//
//        int n = 4526;
//
//        reverseIntRec(n);
//
//        System.out.print("Reversed Number is "+ rev);
//    }

    public static void main (String[] args) {
        int n = 3481;

        System.out.println("Reversed Number is "+ reverseInt(n));
    }
}
