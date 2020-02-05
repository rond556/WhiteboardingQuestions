import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TwoDArrayDSTest {
    TwoDArrayDS twoDArrayDS = new TwoDArrayDS();

    @Test
    public void provided_example() throws IOException {
        //Given
        Integer[][] example = {{1,1,1,0,0,0},
                               {0,1,0,0,0,0},
                               {1,1,1,0,0,0},
                               {0,0,2,4,4,0},
                               {0,0,0,2,0,0},
                               {0,0,1,2,4,0}};
        //When
        Integer expected = 19;
        Integer actual = twoDArrayDS.findTheHourGlassSums(example);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void larger_array() throws IOException {
        //Given
        Integer[][] example = {{-9,-9,-9,9,9,9},
                {-9,-3,6,7,-4,0},
                {2,3,5,7,0,1},
                {5,9,6,4,4,1},
                {-2,-4,-9,2,5,3},
                {-1,-4,4,2,4,-8}};
        //When
        Integer expected = 34;
        Integer actual = twoDArrayDS.findTheHourGlassSums(example);
        //Then
        assertEquals(expected,actual);
    }

    @Test (expected = IOException.class)
    public void number_out_of_range() throws IOException {
        //Given
        Integer[][] example = {{-9,-9,-9,9,9,9},
                {-9,-3,6,7,-4,0},
                {2,3,5,7,0,1},
                {5,9,6,-10,4,1},
                {-2,-4,-9,2,5,3},
                {-1,-4,4,2,4,-8}};
        //When
        Integer expected = 34;
        Integer actual = twoDArrayDS.findTheHourGlassSums(example);
        //Then
    }

    @Test (expected = IOException.class)
    public void array_wrong_height() throws IOException {
        //Given
        Integer[][] example = {{-9,-9,-9,9,9,9},
                {-9,-3,6,7,-4,0},
                {2,3,5,7,0,1},
                {5,9,6,-10,4,1},
                {-2,-4,-9,2,5,3}};
        //When
        Integer expected = 34;
        Integer actual = twoDArrayDS.findTheHourGlassSums(example);
        //Then
    }

    @Test (expected = IOException.class)
    public void array_wrong_width() throws IOException {
        //Given
        Integer[][] example = {{-9,-9,-9,9,9},
                {-9,-3,6,7,-4},
                {2,3,5,7,0},
                {5,9,6,-10,4},
                {-2,-4,-9,2,5},
                {-1,-4,4,2,4}};
        //When
        Integer expected = 34;
        Integer actual = twoDArrayDS.findTheHourGlassSums(example);
        //Then
    }
}