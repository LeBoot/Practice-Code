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
public class TwoStringsTest {
    
    TwoStrings ts = new TwoStrings();
    
    @Test
    public void testRunTwoStrings1() {
        String s1 = "hello";
        String s2 = "world";
        assertEquals("YES", ts.runTwoStrings(s1, s2));        
    }
    
    @Test
    public void testRunTwoStrings2() {
        String s1 = "hi";
        String s2 = "world";
        assertEquals("NO", ts.runTwoStrings(s1, s2));        
    }
    
    @Test
    public void testRunTwoStrings3() {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "def";
        assertEquals("YES", ts.runTwoStrings(s1, s2));        
    }
    
    @Test
    public void testRunTwoStrings4() {
        String s1 = "abcghijklmnopqrstuvwxyz";
        String s2 = "def";
        assertEquals("NO", ts.runTwoStrings(s1, s2));        
    }
    
}
