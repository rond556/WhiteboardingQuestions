import org.junit.Test;

import static org.junit.Assert.*;

public class CountTheValleysTest {

    CountTheValleys countTheValleys = new CountTheValleys();

    @Test
    public void find_the_valley_in_example() {
        //Given
        String hike = "UDDDUDUU";
        //When
        int expected = 1;
        int actual = countTheValleys.negativeOneToZero(hike);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void only_downs() {
        //Given
        String hike = "DDDDDDDD";
        //When
        int expected = 0;
        int actual = countTheValleys.negativeOneToZero(hike);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void only_ups() {
        //Given
        String hike = "UUUUUUUU";
        //When
        int expected = 0;
        int actual = countTheValleys.negativeOneToZero(hike);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void strange_string() {
        //Given
        String hike = "THISISATEST";
        //When
        int expected = 0;
        int actual = countTheValleys.negativeOneToZero(hike);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void strange_string_with_U_and_D() {
        //Given
        String hike = "THISUISDADTESTDANDSHOULDDUUURETURNDDUANUMBER";
        //When
        int expected = 2;
        int actual = countTheValleys.negativeOneToZero(hike);
        //Then
        assertEquals(expected,actual);
    }

    @Test (expected = NullPointerException.class)
    public void empty_string() {
        //Given
        String hike = "";
        //When
        int expected = 2;
        int actual = countTheValleys.negativeOneToZero(hike);
        //Then
    }

    @Test
    public void concatenated_with_numbers() {
        //Given
        String hike = "DUDUDU" + 3 + "DU";
        //When
        int expected = 4;
        int actual = countTheValleys.negativeOneToZero(hike);
        //Then
        assertEquals(expected,actual);
    }
}