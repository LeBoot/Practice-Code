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
public class MinimumTimeTest {

    MinimumTime mt = new MinimumTime();
    
    @Test
    public void testRunMinimumTime1() {
        int k = 10;
        int[] ar = {2, 3, 2};
        assertEquals(8, mt.runMinimumTime(k, ar));
    }
    
    @Test
    public void testRunMinimumTime2() {
        int k = 5;
        int[] ar = {2, 3};
        assertEquals(6, mt.runMinimumTime(k, ar));
    }
    
    @Test
    public void testRunMinimumTime3() {
        int k = 10;
        int[] ar = {1, 3, 4};
        assertEquals(7, mt.runMinimumTime(k, ar));
    }
    
    @Test
    public void testRunMinimumTime4() {
        int k = 12;
        int[] ar = {4, 5, 6};
        assertEquals(20, mt.runMinimumTime(k, ar));
    }
    
}
