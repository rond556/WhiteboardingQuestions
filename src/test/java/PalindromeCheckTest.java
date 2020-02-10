import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    PalindromeCheck palindromeCheck = new PalindromeCheck();

    @Test
    public void is_Palindrome_odd_number_of_letters() {
        //Given
        String example = "radar";
        //True
        assertTrue(palindromeCheck.checkToSeeIfPalindrome(example));
    }

    @Test
    public void is_Palindrome_even_number_of_letters() {
        //Given
        String example = "tabbat";
        //True
        assertTrue(palindromeCheck.checkToSeeIfPalindrome(example));
    }

    @Test
    public void is_not_Palindrome_even_number_of_letters() {
        //Given
        String example = "palindrome";
        //True
        assertFalse(palindromeCheck.checkToSeeIfPalindrome(example));
    }

    @Test
    public void is_not_Palindrome_odd_number_of_letters() {
        //Given
        String example = "palin";
        //True
        assertFalse(palindromeCheck.checkToSeeIfPalindrome(example));
    }
}