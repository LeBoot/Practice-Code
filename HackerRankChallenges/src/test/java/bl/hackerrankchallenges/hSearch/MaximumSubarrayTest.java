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
public class MaximumSubarrayTest {

    MaximumSubarray ms = new MaximumSubarray();
    
    @Test
    public void testRunMaximumSubarray1() {
        int m = 2;
        int[] ar = {1, 2, 3};
        assertEquals(1, ms.runMaximumSubarray(m, ar));
    }
    
    @Test
    public void testRunMaximumSubarray2() {
        int m = 7;
        int[] ar = {3, 3, 9, 9, 5};
        assertEquals(6, ms.runMaximumSubarray(m, ar));
    }
    
}
