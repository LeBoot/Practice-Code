/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hMaps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class RansomNoteTest {

    RansomNote ransom = new RansomNote();
    
    @Test
    public void testRunRansomNote1() {
        String[] mag = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};
        assertEquals("Yes", ransom.runRansomNote(mag, note));
    }
    
    @Test
    public void testRunRansomNote2() {
        String[] mag = {"two", "times", "three", "is", "not", "four"};
        String[] note = {"two", "times", "two", "is", "four"};
        assertEquals("No", ransom.runRansomNote(mag, note));
    }
    
    @Test
    public void testRunRansomNote3() {
        String[] mag = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note = {"ive", "got", "some", "coconuts"};
        assertEquals("No", ransom.runRansomNote(mag, note));
    }
    
}
