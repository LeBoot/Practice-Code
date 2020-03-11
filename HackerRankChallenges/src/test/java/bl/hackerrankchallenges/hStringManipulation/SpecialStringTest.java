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
public class SpecialStringTest {
    
    SpecialString ss = new SpecialString();
    
    @Test
    public void testRunSpecialString1() {
        String s1 = "harry";
        String s2 = "sally";
        assertEquals(2, ss.runSpecialString(s1, s2));
    }
    
    @Test
    public void testRunSpecialString2() {
        String s1 = "aa";
        String s2 = "bb";
        assertEquals(0, ss.runSpecialString(s1, s2));
    }
    
    @Test
    public void testRunSpecialString3() {
        String s1 = "SHINCHAN";
        String s2 = "NOHARAAA";
        assertEquals(3, ss.runSpecialString(s1, s2));
    }
    
    @Test
    public void testRunSpecialString4() {
        String s1 = "ABCDEF";
        String s2 = "FBDAMN";
        assertEquals(2, ss.runSpecialString(s1, s2));
    }
}
