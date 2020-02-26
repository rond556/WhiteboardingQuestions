import org.junit.Test;

import static org.junit.Assert.*;

public class GrowthOfAPopulationTest {
    GrowthOfAPopulation growthOfAPopulation = new GrowthOfAPopulation();

    @Test
    public void example_answer() {
        //Given
        Integer population = 1500;
        Double percent = 5D;
        Integer additionalPeople = 100;
        Integer finalPopulation = 5000;
        //When
        Integer expected = 15;
        Integer actual = growthOfAPopulation.findThePopulation(population, percent, additionalPeople,finalPopulation);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void example_answer_2() {
        //Given
        Integer population = 1500000;
        Double percent = 2.5D;
        Integer additionalPeople = 10000;
        Integer finalPopulation = 2000000;
        //When
        Integer expected = 10;
        Integer actual = growthOfAPopulation.findThePopulation(population, percent, additionalPeople,finalPopulation);
        //Then
        assertEquals(expected,actual);
    }
}