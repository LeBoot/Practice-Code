/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hStringManipulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class AlternatingCharactersTest {

    AlternatingCharacters alt = new AlternatingCharacters();
    
    @Test
    public void testRunAlternatingCharacters1() {
        String s = "AABAAB";
        assertEquals(2, alt.runAlternatingCharacters(s));
    }
    
    @Test
    public void testRunAlternatingCharacters2() {
        String s = "AAAA";
        assertEquals(3, alt.runAlternatingCharacters(s));
    }
    
    @Test
    public void testRunAlternatingCharacters3() {
        String s = "ABABABAB";
        assertEquals(0, alt.runAlternatingCharacters(s));
    }
    
    @Test
    public void testRunAlternatingCharacters4() {
        String s = "BB";
        assertEquals(1, alt.runAlternatingCharacters(s));
    }
    
    @Test
    public void testRunAlternatingCharacters5() {
        String s = "AAABBB";
        assertEquals(4, alt.runAlternatingCharacters(s));
    }
    
}
