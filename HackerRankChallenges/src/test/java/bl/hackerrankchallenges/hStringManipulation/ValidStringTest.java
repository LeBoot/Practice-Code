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
public class ValidStringTest {

    ValidString val = new ValidString();
    
    @Test
    public void testRunValidString1() {
        String s = "abc";
        assertTrue(val.runValidString(s));
    }
    
    @Test
    public void testRunValidString2() {
        String s = "abcc";
        assertTrue(val.runValidString(s));
    }
    
    @Test
    public void testRunValidString3() {
        String s = "abccc";
        assertFalse(val.runValidString(s));
    }
    
    @Test
    public void testRunValidString4() {
        String s = "aabbcd";
        assertFalse(val.runValidString(s));
    }
    
    @Test
    public void testRunValidString5() {
        String s = "aabbccddeefghi";
        assertFalse(val.runValidString(s));
    }
    
    @Test
    public void testRunValidString6() {
        String s = "abcdefghhgfedecba";
        assertTrue(val.runValidString(s));
    }
}
