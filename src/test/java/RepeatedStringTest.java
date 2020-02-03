import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    RepeatedString repeatedString = new RepeatedString();

    @Test
    public void a_counter() {
        //Given
        int exampleLength = 10;
        String exampleString = "aba";
        //When
        int expected = 7;
        int actual = repeatedString.aCounter(exampleLength,exampleString);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void just_as() {
        //Given
        int exampleLength = Integer.MAX_VALUE;
        String exampleString = "a";
        //When
        int expected = Integer.MAX_VALUE;
        int actual = repeatedString.aCounter(exampleLength,exampleString);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void longer_example() {
        //Given
        int exampleLength = 15;
        String exampleString = "alundra";
        //When
        int expected = 5;
        int actual = repeatedString.aCounter(exampleLength,exampleString);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void much_longer_example() {
        //Given
        int exampleLength =Integer.MAX_VALUE;
        String exampleString = "han and chewbacca";
        //When
        int expected = 505290270;
        int actual = repeatedString.aCounter(exampleLength,exampleString);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void substring_a_counter() {
        //Given
        String exampleString = "bababacaba";
        Integer exampleLength = exampleString.length();
        //When
        Integer expected = 5;
        Integer actual = repeatedString.findTheNumbersOfAs(exampleString,exampleLength);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void partial_substring_a_counter() {
        //Given
        String exampleString = "bababacaba";
        Integer exampleLength = 5;
        //When
        Integer expected = 2;
        Integer actual = repeatedString.findTheNumbersOfAs(exampleString,exampleLength);
        //Then
        assertEquals(expected,actual);
    }

    @Test (expected = StringIndexOutOfBoundsException.class)
    public void length_too_long() {
        //Given
        String exampleString = "bababacaba";
        Integer exampleLength = 19;
        //When
        Integer actual = repeatedString.findTheNumbersOfAs(exampleString,exampleLength);
    }

    @Test (expected = NullPointerException.class)
    public void empty_string() {
        //Given
        String exampleString = "";
        Integer exampleLength = exampleString.length();
        //When
        Integer actual = repeatedString.findTheNumbersOfAs(exampleString,exampleLength);
    }
}