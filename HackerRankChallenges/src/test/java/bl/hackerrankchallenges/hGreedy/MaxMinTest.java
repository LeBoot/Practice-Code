/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hGreedy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class MaxMinTest {

    MaxMin mm = new MaxMin();
    
    @Test
    public void testRunMaxMin1() {
        int k = 2;
        int[] ar = {1, 4, 7, 2};
        assertEquals(1, mm.runMaxMin(k, ar));
    }
    
    @Test
    public void testRunMaxMin2() {
        int k = 3;
        int[] ar = {10, 100, 300, 200, 1000, 20, 30};
        assertEquals(20, mm.runMaxMin(k, ar));
    }
    
    @Test
    public void testRunMaxMin3() {
        int k = 4;
        int[] ar = {1, 2, 3, 4, 10, 20, 30, 40, 100, 200};
        assertEquals(3, mm.runMaxMin(k, ar));
    }
    
    @Test
    public void testRunMaxMin4() {
        int k = 2;
        int[] ar = {1, 2, 1, 2, 1};
        assertEquals(0, mm.runMaxMin(k, ar));
    }
    
}
