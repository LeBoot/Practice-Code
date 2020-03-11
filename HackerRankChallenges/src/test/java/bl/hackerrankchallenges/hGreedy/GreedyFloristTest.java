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
public class GreedyFloristTest {

    GreedyFlorist gf = new GreedyFlorist();
    
    @Test
    public void testRunGreedyFlorist1() {
        int k = 3;
        int[] costs = {2, 5, 6};
        assertEquals(13, gf.runGreedyFlorist(k, costs));   
    }
    
    @Test
    public void testRunGreedyFlorist2() {
        int k = 2;
        int[] costs = {2, 5, 6};
        assertEquals(15, gf.runGreedyFlorist(k, costs));   
    }
    
    @Test
    public void testRunGreedyFlorist3() {
        int k = 3;
        int[] costs = {1, 3, 5, 7, 9};
        assertEquals(29, gf.runGreedyFlorist(k, costs));   
    }
    
    @Test
    public void testRunGreedyFlorist4() {
        int k = 3;
        int[] costs = {1, 2, 3, 4};
        assertEquals(11, gf.runGreedyFlorist(k, costs));   
    }
    
    @Test
    public void testRunGreedyFlorist5() {
        int k = 4;
        int[] costs = {1, 2, 3, 4};
        assertEquals(10, gf.runGreedyFlorist(k, costs));   
    }
    
}
