/**
 * Created by leo.zinger on 4/5/17.
 */
public class FindPalindrome {

    //private int ndigits;

    protected int largestPalindromeNumber = 0;

    public int find (int ndigits, Palindrome palindrome) {
        int m = (int) Math.pow(10, ndigits);
        System.out.println("FindPalindrome.find(): number of digits = " + m);
        int product = 0;

        try {
            outerloop:
            for (int i = m; i > 0; i--) {
                for (int j = m; j > 0; j--) {
                    product = i * j;
                    if (palindrome.find(product) & product > largestPalindromeNumber) {
                        largestPalindromeNumber = product;
                        break outerloop; //we found the largest Palindrome, now get out of loop, return.
                    }
                }
            }
        } catch (Exception e){
            System.err.println("Exception: " + e.getMessage());
        }
        return product;
    }


    public static void main (String[] args){
        int num_digits = 8;

        //calculate the total number from number of "digits" passed in.

        FindPalindrome findPalindrome = new FindPalindrome();
        Palindrome palindrome = new Palindrome();
        findPalindrome.find(num_digits, palindrome);

        //Palindrome palindrome = new Palindrome();
        //palindrome.test(2);


        if (palindrome.find(findPalindrome.largestPalindromeNumber)) {
            System.out.println("Found largest Palindrome :" + findPalindrome.largestPalindromeNumber);
        }
        else
        {
            System.out.println("largest Palindrome NOT FOUND!");
        }

    }
}