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
public class MinAbsoluteDiffTest {

    MinAbsoluteDiff diff = new MinAbsoluteDiff();
    
    @Test
    public void testRunMinAbsoluteDiff1() {
        int[] ar = {3, -7, 0};
        assertEquals(3, diff.runMinAbsoluteDiff(ar));
    }
    
    @Test
    public void testRunMinAbsoluteDiff2() {
        int[] ar = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        assertEquals(1, diff.runMinAbsoluteDiff(ar));
    }
    
    @Test
    public void testRunMinAbsoluteDiff3() {
        int[] ar = {1, -3, 71, 68, 17};
        assertEquals(2, diff.runMinAbsoluteDiff(ar));
    }
}
