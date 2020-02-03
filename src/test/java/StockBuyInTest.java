import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockBuyInTest {

    StockBuyIn stockBuyIn = new StockBuyIn();

    @Test
    public void stock_buy_in_test() {
        //Given
        int[] testExample = {2, 7, 6, 1, 8, 6, 3};
        //When
        int expected = 7;
        int actual = stockBuyIn.findBiggestDifference(testExample);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void never_changing_value(){
        //Given
        int[] testExample = {5, 5, 5, 5};
        //When
        int expected = 0;
        int actual = stockBuyIn.findBiggestDifference(testExample);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void always_getting_worse(){
        //Given
        int[] testExample = {10, 8, 4, 2, 1};
        //When
        int expected = -1;
        int actual = stockBuyIn.findBiggestDifference(testExample);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void negative_values(){
        //Given
        int[] testExample = {-6, -4, 2, -3, -10, 1, -5};
        //When
        int expected = 11;
        int actual = stockBuyIn.findBiggestDifference(testExample);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void break_it(){
        //Given
        int[] testExample = {0, 10, 8, 6, 5};
        //When
        int expected = 10;
        int actual = stockBuyIn.findBiggestDifference(testExample);
        //Then
        assertEquals(expected,actual);
    }

    @Test (expected = NullPointerException.class)
    public void array_length_one(){
        //Given
        int[] testExample = {2};
        //When
        int actual = stockBuyIn.findBiggestDifference(testExample);
        //Then
    }



}