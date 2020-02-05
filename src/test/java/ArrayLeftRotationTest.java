import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ArrayLeftRotationTest {

    ArrayLeftRotation arrayLeftRotation = new ArrayLeftRotation();

    @Test
    public void provided_example() throws IOException {
        //Given
        Integer[] exampleArray = {1,2,3,4,5};
        Integer exampleNumberOfSpaces = 4;
        //When
        Integer[] expected = {5,1,2,3,4};
        Integer[] actual = arrayLeftRotation.rotateLeft(exampleArray, exampleNumberOfSpaces);
        //Then
        assertArrayEquals(expected,actual);
    }

    @Test
    public void normal_example() throws IOException {
        //Given
        Integer[] exampleArray = {1,2,3,4,5};
        Integer exampleNumberOfSpaces = 3;
        //When
        Integer[] expected = {4,5,1,2,3};
        Integer[] actual = arrayLeftRotation.rotateLeft(exampleArray, exampleNumberOfSpaces);
        //Then
        assertArrayEquals(expected,actual);
    }

    @Test
    public void full_cycle() throws IOException {
        //Given
        Integer[] exampleArray = {1,2,3,4,5};
        Integer exampleNumberOfSpaces = exampleArray.length;
        //When
        Integer[] expected = exampleArray;
        Integer[] actual = arrayLeftRotation.rotateLeft(exampleArray, exampleNumberOfSpaces);
        //Then
        assertArrayEquals(expected,actual);
    }

    @Test (expected = IOException.class)
    public void negative_spaces() throws IOException {
        //Given
        Integer[] exampleArray = {1, 2, 3, 4, 5};
        Integer exampleNumberOfSpaces = -3;
        //When
        Integer[] expected = {4, 5, 1, 2, 3};
        Integer[] actual = arrayLeftRotation.rotateLeft(exampleArray, exampleNumberOfSpaces);
        //Then
    }

    @Test (expected = IOException.class)
    public void zero_spaces() throws IOException {
        //Given
        Integer[] exampleArray = {1, 2, 3, 4, 5};
        Integer exampleNumberOfSpaces = 0;
        //When
        Integer[] expected = {4, 5, 1, 2, 3};
        Integer[] actual = arrayLeftRotation.rotateLeft(exampleArray, exampleNumberOfSpaces);
        //Then
    }

    @Test
    public void full_cycle_and_then_some() throws IOException {
        //Given
        Integer[] exampleArray = {1, 2, 3, 4, 5};
        Integer exampleNumberOfSpaces = 9;
        //When
        Integer[] expected = {5, 1, 2, 3, 4};
        Integer[] actual = arrayLeftRotation.rotateLeft(exampleArray, exampleNumberOfSpaces);
        //Then
        assertArrayEquals(expected, actual);
    }
}