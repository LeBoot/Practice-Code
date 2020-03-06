/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hArrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class NewYearChaosTest {

    NewYearChaos n = new NewYearChaos();
    
    @Test
    public void testRunNewYearChaos1() {
        int[] ar = {2, 1, 5, 3, 4};
        assertEquals(3, n.runNewYearChaos(ar));
    }
    
    @Test
    public void testRunNewYearChaos2() {
        int[] ar = {2, 5, 1, 3, 4};
        assertEquals(-1, n.runNewYearChaos(ar));
    }
    
    @Test
    public void testRunNewYearChaos3() {
        int[] ar = {1, 2, 3, 5, 4, 6, 7, 8};
        assertEquals(1, n.runNewYearChaos(ar));
    }
    
    @Test
    public void testRunNewYearChaos4() {
        int[] ar = {3, 1, 2, 5, 4, 6, 7, 8};
        assertEquals(3, n.runNewYearChaos(ar));
    }
    
    @Test
    public void testRunNewYearChaos5() {
        int[] ar = {3, 2, 1, 5, 4, 6, 7, 8};
        assertEquals(4, n.runNewYearChaos(ar));
    }
    
}
