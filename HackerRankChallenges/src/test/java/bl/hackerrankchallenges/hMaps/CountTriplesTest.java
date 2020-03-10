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
public class CountTriplesTest {
    
    CountTriples ct = new CountTriples();
    
    @Test
    public void testRunCountTriples1() {
        int r = 2;
        int[] ar = {1, 2, 2, 4};
        assertEquals(2, ct.runCountTriples(r, ar));
    }
    
    @Test
    public void testRunCountTriples2() {
        int r = 3;
        int[] ar = {1, 3, 9, 9, 27, 81};
        assertEquals(6, ct.runCountTriples(r, ar));
    }
    
    @Test
    public void testRunCountTriples3() {
        int r = 5;
        int[] ar = {1, 5, 5, 25, 125};
        assertEquals(4, ct.runCountTriples(r, ar));
    }
}
