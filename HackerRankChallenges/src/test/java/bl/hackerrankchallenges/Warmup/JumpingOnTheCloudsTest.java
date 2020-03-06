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
public class JumpingOnTheCloudsTest {
    JumpingOnTheClouds jump = new JumpingOnTheClouds();
    
    @Test
    public void testRunJumpingOnTheClouds1() {
        int[] ar = {0, 1, 0, 0, 0, 1, 0};
        assertEquals(3, jump.runJumpingOnTheClouds(ar));
    }
    
    @Test
    public void testRunJumpingOnTheClouds2() {
        int[] ar = {0, 1, 0, 1, 0, 1, 0};
        assertEquals(3, jump.runJumpingOnTheClouds(ar));
    }
    
    @Test
    public void testRunJumpingOnTheClouds3() {
        int[] ar = {0, 1, 0, 1, 0, 1, 0};
        assertEquals(3, jump.runJumpingOnTheClouds(ar));
    }
    
    @Test
    public void testRunJumpingOnTheClouds4() {
        int[] ar = {0, 0, 0, 0, 0, 0, 0};
        assertEquals(3, jump.runJumpingOnTheClouds(ar));
    }
    
    @Test
    public void testRunJumpingOnTheClouds5() {
        int[] ar = {0, 1, 0, 0};
        assertEquals(2, jump.runJumpingOnTheClouds(ar));
    }
    
    @Test
    public void testRunJumpingOnTheClouds6() {
        int[] ar = {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0};
        assertEquals(7, jump.runJumpingOnTheClouds(ar));
    }
    
    @Test
    public void testRunJumpingOnTheClouds7() {
        int[] ar = {0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        assertEquals(6, jump.runJumpingOnTheClouds(ar));
    }
    
}
