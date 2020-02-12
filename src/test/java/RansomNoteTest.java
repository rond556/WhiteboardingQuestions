import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteTest {

    RansomNote ransomNote = new RansomNote();

    @Test
    public void matching_set() {
        //Given
        String[] exampleMagazine = {"This", "will", "be", "a", "ransom", "note"};
        String[] exampleNote = {"a", "ransom", "note"};
        //then
        assertTrue(ransomNote.matchTheNotWithMagazineClip(exampleMagazine,exampleNote));
    }

    @Test
    public void not_matching_set() {
        //Given
        String[] exampleMagazine = {"This", "will", "not", "be", "a", "ransom", "note"};
        String[] exampleNote = {"This", "this", "a", "ransom", "note"};
        //then
        assertFalse(ransomNote.matchTheNotWithMagazineClip(exampleMagazine,exampleNote));
    }
}