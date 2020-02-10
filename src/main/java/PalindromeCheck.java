import java.util.Stack;

public class PalindromeCheck {

    /*Write code to check a String is palindrome or not?
    NO REVERSE()
     */

    public Boolean checkToSeeIfPalindrome(String word){
            for(int i = 0; i < word.length() / 2; i++){
                if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                    return false;
                }
            }
        return true;
    }
}
