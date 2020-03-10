/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hSorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class MarkAndToysTest {

    MarkAndToys mark = new MarkAndToys();
    
    @Test
    public void testRunMarkAndtoys1() {
        int k = 7;
        int[] ar = {1, 2, 3, 4};
        assertEquals(3, mark.runMarkAndtoys(ar, k));
    }
    
    @Test
    public void testRunMarkAndtoys2() {
        int k = 50;
        int[] ar = {1, 12, 5, 111, 200, 1000, 10};
        assertEquals(4, mark.runMarkAndtoys(ar, k));
    }
    
}
