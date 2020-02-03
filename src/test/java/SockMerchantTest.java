import org.junit.Test;

import static org.junit.Assert.*;

public class SockMerchantTest {

    SockMerchant sockMerchant = new SockMerchant();

    @Test
    public void find_a_the_number_of_pairs() {
        //Given
        int[] sockCollection = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        //When
        int expected = 3;
        int actual = sockMerchant.countingPairs(sockCollection);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void find_a_the_negative_number_of_pairs() {
        //Given
        int[] sockCollection = {-10, -20, -20, 10, 10, -30, -50, -10, -20};
        //When
        int expected = 3;
        int actual = sockMerchant.countingPairs(sockCollection);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void find_a_the_zero_number_of_pairs() {
        //Given
        int[] sockCollection = {0, 0, 0, 0, 0};
        //When
        int expected = 2;
        int actual = sockMerchant.countingPairs(sockCollection);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void just_one_sock() {
        //Given
        int[] sockCollection = {-10};
        //When
        int expected = 0;
        int actual = sockMerchant.countingPairs(sockCollection);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void no_socks() {
        //Given
        int[] sockCollection = {};
        //When
        int expected = 0;
        int actual = sockMerchant.countingPairs(sockCollection);
        //Then
        assertEquals(expected,actual);
    }
}