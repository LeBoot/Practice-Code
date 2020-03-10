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
public class BubbleSortTest {
    
    BubbleSort bubble = new BubbleSort();
    
    @Test
    public void testRunBubbleSort1() {
        int[] ar = {6, 4, 1};
        int[] anticipated = {1, 6, 3};
        int[] arToTest = bubble.runBubbleSort(ar);
        for (int i = 0; i < anticipated.length; i++) {
            assertTrue(anticipated[i] == arToTest[i]);
        }
    }
    
    @Test
    public void testRunBubbleSort2() {
        int[] ar = {1, 2, 3};
        int[] anticipated = {1, 3, 0};
        int[] arToTest = bubble.runBubbleSort(ar);
        for (int i = 0; i < anticipated.length; i++) {
            assertTrue(anticipated[i] == arToTest[i]);
        }
    }
    
    @Test
    public void testRunBubbleSort3() {
        int[] ar = {3, 2, 1};
        int[] anticipated = {1, 3, 3};
        int[] arToTest = bubble.runBubbleSort(ar);
        for (int i = 0; i < anticipated.length; i++) {
            assertTrue(anticipated[i] == arToTest[i]);
        }
    }
    
}
