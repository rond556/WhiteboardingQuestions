import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class KanagrooJumpsTest {

    KanagrooJumps kanagrooJumps = new KanagrooJumps();

    @Test
    public void simple_speed_will_meet() throws IOException {
        //Given
        int xSpeed = 2;
        int xPosition = 6;
        int ySpeed = 1;
        int yPosition = 7;
        //Given
        assertTrue(kanagrooJumps.willTheyMeet(xPosition, xSpeed, yPosition, ySpeed));
    }

    @Test
    public void simple_speed_will_not_meet() throws IOException {
        //Given
        int xSpeed = 2;
        int xPosition = 9;
        int ySpeed = 1;
        int yPosition = 8;
        //Given
        assertFalse(kanagrooJumps.willTheyMeet(xPosition, xSpeed, yPosition, ySpeed));
    }

    @Test
    public void crazy_speed_will_not_meet() throws IOException {
        //Given
        int xSpeed = 1003;
        int xPosition = 500;
        int ySpeed = 10;
        int yPosition = 1;
        //Given
        assertFalse(kanagrooJumps.willTheyMeet(xPosition, xSpeed, yPosition, ySpeed));
    }

    @Test
    public void simple_speed_negative_starting_point() throws IOException {
        //Given
        int xSpeed = 2;
        int xPosition = -5;
        int ySpeed = 1;
        int yPosition = -3;
        //Given
        assertTrue(kanagrooJumps.willTheyMeet(xPosition, xSpeed, yPosition, ySpeed));
    }

    @Test
    public void simple_speed_negative_starting_point_wont_meet() throws IOException {
        //Given
        int xSpeed = 2;
        int xPosition = -6;
        int ySpeed = 1;
        int yPosition = -3;
        //Given
        assertTrue(kanagrooJumps.willTheyMeet(xPosition, xSpeed, yPosition, ySpeed));
    }

    @Test (expected = IOException.class)
    public void simple_speed_negative_starting_pointt() throws IOException {
        //Given
        int xSpeed = -22;
        int xPosition = -5;
        int ySpeed = -11;
        int yPosition = -3;
        //Given
        assertTrue(kanagrooJumps.willTheyMeet(xPosition, xSpeed, yPosition, ySpeed));
    }
}