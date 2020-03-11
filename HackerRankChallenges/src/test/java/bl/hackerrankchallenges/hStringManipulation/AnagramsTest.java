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
public class AnagramsTest {

    Anagrams ana = new Anagrams();
    
    @Test
    public void testRunAnagrams1() {
        String s1 = "cde";
        String s2 = "abc";
        assertEquals(4, ana.runAnagrams(s1, s2));
    }
    
    @Test
    public void testRunAnagrams2() {
        String s1 = "abc";
        String s2 = "abc";
        assertEquals(0, ana.runAnagrams(s1, s2));
    }
    
    @Test
    public void testRunAnagrams3() {
        String s1 = "abcd";
        String s2 = "abc";
        assertEquals(1, ana.runAnagrams(s1, s2));
    }
    
    @Test
    public void testRunAnagrams4() {
        String s1 = "cde";
        String s2 = "dcf";
        assertEquals(2, ana.runAnagrams(s1, s2));
    }
    
}
