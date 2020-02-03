import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JumpingOnTheCloudsTest {

    JumpingOnTheClouds jumpingOnTheClouds = new JumpingOnTheClouds();

    @Test
    public void given_example() throws IOException {
        //Given
        int[] clouds = {0,0,1,0,0,1,0};
        //When
        int expected = 4;
        int actual = jumpingOnTheClouds.numberOfJumps(clouds);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void second_given_example() throws IOException {
        //Given
        int[] clouds = {0,0,0,1,0,0};
        //When
        int expected = 3;
        int actual = jumpingOnTheClouds.numberOfJumps(clouds);
        //Then
        assertEquals(expected,actual);
    }

    @Test (expected = IOException.class)
    public void array_ends_with_1() throws IOException {
        //Given
        int[] clouds = {0,0,0,1,0,1};
        //When
        int actual = jumpingOnTheClouds.numberOfJumps(clouds);
        //Then
    }

    @Test (expected = IOException.class)
    public void double_1s() throws IOException {
        //Given
        int[] clouds = {0,0,0,1,1,0};
        //When
        int actual = jumpingOnTheClouds.numberOfJumps(clouds);
    }

    @Test (expected = NullPointerException.class)
    public void emptyArray() throws IOException {
        //Given
        int[] clouds = {};
        //When
        int actual = jumpingOnTheClouds.numberOfJumps(clouds);
        //Then
    }

    @Test
    public void just_one_cloud() throws IOException {
        //Given
        int[] clouds = {0};
        //When
        int expected = 0;
        int actual = jumpingOnTheClouds.numberOfJumps(clouds);
        //Then
        assertEquals(expected,actual);
    }

    @Test (expected = IOException.class)
    public void just_one_thundercloud() throws IOException {
        //Given
        int[] clouds = {1};
        //When
        int actual = jumpingOnTheClouds.numberOfJumps(clouds);
        //Then
    }
}