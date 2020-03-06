/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.Warmup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class RepeatedStringTest {
    
    RepeatedString ss = new RepeatedString();
    
    @Test
    public void testRunRepeatedString1() {
        int n = 10;
        String s = "aba";
        assertEquals(7, ss.runRepeatedString(n, s));
    }
    
    @Test
    public void testRunRepeatedString2() {
        int n = 10000000;
        String s = "a";
        assertEquals(10000000, ss.runRepeatedString(n, s));
    }
    
    @Test
    public void testRunRepeatedString3() {
        int n = 10000000;
        String s = "b";
        assertEquals(0, ss.runRepeatedString(n, s));
    }
    
    @Test
    public void testRunRepeatedString4() {
        int n = 9;
        String s = "aba";
        assertEquals(6, ss.runRepeatedString(n, s));
    }
    
    @Test
    public void testRunRepeatedString5() {
        int n = 10;
        String s = "abb";
        assertEquals(4, ss.runRepeatedString(n, s));
    }
    
    @Test
    public void testRunRepeatedString6() {
        int n = 10;
        String s = "bba";
        assertEquals(3, ss.runRepeatedString(n, s));
    }
    
}
