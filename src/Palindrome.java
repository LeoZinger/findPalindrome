/**
 * Created by leo.zinger on 4/5/17.
 */
public class Palindrome {

    boolean find(int givenNum) {
        boolean isPalindrome = false;
        int n= givenNum;
        int rev=0;

        while(n>0)
        {
            //To extract the last digit
            int lastdigit=n%10;

            //To store it in reverse
            rev=(rev*10)+lastdigit;

            //To truncate the last digit
            n=n/10;
        }

        //To check if a number is palindrome or not
        if(rev==givenNum)
        {
            isPalindrome = true;
            System.out.println(givenNum+" is a palindrome ");
        }
        else
        {
            isPalindrome = false;
            System.out.println(givenNum+" is not a palindrome");
        }
        return isPalindrome;
    }

}
