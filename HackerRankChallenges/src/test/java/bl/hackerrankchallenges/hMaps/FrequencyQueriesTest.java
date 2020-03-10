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
public class FrequencyQueriesTest {

    FrequencyQueries fq = new FrequencyQueries();
    
    @Test
    public void testRunFrequencyQueries1() {
        int[][] ar = new int[][] {
            {1, 5},
            {1, 6},
            {3, 2},
            {1, 10},
            {1, 10},
            {1, 6},
            {2, 5},
            {3, 2}
        };
        assertEquals("01", fq.runFrequencyQueries(ar));
    }
    
    @Test
    public void testRunFrequencyQueries2() {
        int[][] ar = new int[][] {
            {3, 4},
            {2, 1003},
            {1, 16},
            {3, 1}
        };
        assertEquals("01", fq.runFrequencyQueries(ar));
    }
    
    @Test
    public void testRunFrequencyQueries3() {
        int[][] ar = new int[][] {
            {1, 3},
            {2, 3},
            {3, 2},
            {1, 4},
            {1, 5},
            {1, 5},
            {1, 4},
            {3, 2},
            {2, 4},
            {3, 2}
        };
        assertEquals("011", fq.runFrequencyQueries(ar));
    }
    
}
