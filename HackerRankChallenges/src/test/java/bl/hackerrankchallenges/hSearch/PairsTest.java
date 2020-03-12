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
public class PairsTest {

    Pairs p = new Pairs();
    
    @Test
    public void testRunPairs1() {
        int k = 1;
        int[] ar = {1, 2, 3, 4};
        assertEquals(3, p.runPairs(k, ar));              
    }
    
    @Test
    public void testRunPairs2() {
        int k = 2;
        int[] ar = {1, 5, 3, 4, 2};
        assertEquals(3, p.runPairs(k, ar));              
    }
    
}
