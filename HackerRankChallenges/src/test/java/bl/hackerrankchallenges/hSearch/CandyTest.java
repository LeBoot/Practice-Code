/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hSearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class CandyTest {
    
    Candy candy = new Candy();
    
    @Test
    public void testRunCandy1() {
        long m = 1;
        long w = 2;
        long p = 1;
        long n = 60;
        assertEquals(4, candy.runCandy(m, w, p, n));
    }
    
    @Test
    public void testRunCandy2() {
        long m = 3;
        long w = 1;
        long p = 2;
        long n = 12;
        assertEquals(3, candy.runCandy(m, w, p, n));
    }
    
}
