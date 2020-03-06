/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hArrays;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class LeftRotationTest {
    
    LeftRotation lr = new LeftRotation();
    
    @Test
    public void testRunLeftRotation1() {
        int[] ar = {1, 2, 3, 4, 5, 6};
        int[] answer = {1, 2, 3, 4, 5, 6};
        int d = 0;
        int[] output = lr.runLeftRotation(d, ar);
        assertTrue(Arrays.equals(answer, output));
    }
    
    @Test
    public void testRunLeftRotation2() {
        int[] testArray = {1, 2, 3, 4, 5, 6};
        int[] expectedAnswer = {2, 3, 4, 5, 6, 1};
        int d = 1;
        int[] actualOutput = lr.runLeftRotation(d, testArray);
        
        for (int i = 0; i < testArray.length; i++) {
            assertEquals(actualOutput[i], expectedAnswer[i]);
        }
    }
    
    @Test
    public void testRunLeftRotation3() {
        int[] ar = {1, 2, 3, 4, 5, 6};
        int[] answer = {3, 4, 5, 6, 1, 2};
        int d = 2;
        int[] output = lr.runLeftRotation(d, ar);
        assertTrue(Arrays.equals(answer, output));
    }
    
    @Test
    public void testRunLeftRotation4() {
        int[] ar = {1, 2, 3, 4, 5, 6};
        int[] answer = {1, 2, 3, 4, 5, 6};
        int d = 6;
        int[] output = lr.runLeftRotation(d, ar);
        assertTrue(Arrays.equals(answer, output));
    }
    
    @Test
    public void testRunLeftRotation5() {
        int[] ar = {1, 2};
        int[] answer = {2, 1};
        int d = 1;
        int[] output = lr.runLeftRotation(d, ar);
        assertTrue(Arrays.equals(answer, output));
    }
    
    @Test
    public void testRunLeftRotation6() {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] answer = {2, 3, 4, 5, 6, 7, 8, 1};
        int d = 1;
        int[] output = lr.runLeftRotation(d, ar);
        assertTrue(Arrays.equals(answer, output));
    }
    
}
