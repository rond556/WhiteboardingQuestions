import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FireAndFuryTest {
    FireAndFury fireAndFury = new FireAndFury();

    @Test
    public void example1() {
        //Given
        String example = "FURYYYFIREYYFIRE";
        //When
        String expected = "I am furious. You and you are fired!";
        String actual = fireAndFury.fireAndFury(example);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void example2() {
        //Given
        String example = "FIREYYFURYYFURYYFURRYFIRE";
        //When
        String expected = "You are fired! I am really furious. You are fired!";
        String actual = fireAndFury.fireAndFury(example);
        //then
        Assert.assertEquals(expected,actual);
    }
}