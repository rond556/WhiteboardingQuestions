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

    @Test
    public void random_example(){
        //Given
        String example = "FIREYIREFIRERURYIIREUIREIIREFIRERIREYIREYIREFIREYIREEURYUIRE";
        //When
        String expected = "You and you and you and you are fired!";
        String actual = fireAndFury.fireAndFury(example);
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void fake_tweet_example(){
        //Given
        String example = "UURYIIREIURYIURYUIREIIREYIREUIRE";
        //When
        String expected = "Fake tweet.";
        String actual = fireAndFury.fireAndFury(example);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void random_example_2(){
        //Given
        String example = "EURYEURYEURYYURYRIREEURYIIRERIRERIREEURYFURYYURYIURYEIREIURY";
        //When
        String expected = "I am furious.";
        String actual = fireAndFury.fireAndFury(example);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void repeat_fire(){
        //Given
        String example = "FIREFIREFIRE";
        //When
        String expected = "You and you and you are fired!";
        String actual = fireAndFury.fireAndFury(example);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void random_example_3(){
        //Given
        String example = "FIREUURYUIREFURYEURYRIREFIRERURYIURY";
        //When
        String expected = "You are fired! I am furious. You are fired!";
        String actual = fireAndFury.fireAndFury(example);
        //Then
        Assert.assertEquals(expected,actual);
    }
}