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
public class TripleSumTest {

    TripleSum trip = new TripleSum();
    
    @Test
    public void testRunTripleSum1() {
        int[] ar1 = {3, 5, 7};
        int[] ar2 = {3, 6};
        int[] ar3 = {4, 6, 9};
        assertEquals(4, trip.runTripleSum(ar1, ar2, ar3));
    }
    
    @Test
    public void testRunTripleSum2() {
        int[] ar1 = {1, 3, 5};
        int[] ar2 = {2, 3};
        int[] ar3 = {1, 2, 3};
        assertEquals(8, trip.runTripleSum(ar1, ar2, ar3));
    }
    
    @Test
    public void testRunTripleSum3() {
        int[] ar1 = {1, 4, 5};
        int[] ar2 = {2, 3, 3};
        int[] ar3 = {1, 2, 3};
        assertEquals(5, trip.runTripleSum(ar1, ar2, ar3));
    }
    
    @Test
    public void testRunTripleSum4() {
        int[] ar1 = {1, 3, 5, 7};
        int[] ar2 = {5, 7, 9};
        int[] ar3 = {7, 9, 11, 13};
        assertEquals(12, trip.runTripleSum(ar1, ar2, ar3));
    }
}
