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
public class IceCreamTest {

    IceCream ice = new IceCream();
    
    @Test
    public void testRunIceCream1() {
        int k = 5;
        int[] ar = {2, 1, 3, 5, 6};
        int[] expectedAnswer = {1, 3};
        int[] returnedAnswer = ice.runIceCream(k, ar);
        for (int i = 0; i < expectedAnswer.length; i++) {
            assertEquals(expectedAnswer[i], returnedAnswer[i]);
        }                
    }
    
    @Test
    public void testRunIceCream2() {
        int k = 4;
        int[] ar = {1, 4, 5, 3, 2};
        int[] expectedAnswer = {1, 4};
        int[] returnedAnswer = ice.runIceCream(k, ar);
        for (int i = 0; i < expectedAnswer.length; i++) {
            assertEquals(expectedAnswer[i], returnedAnswer[i]);
        }                
    }
    
}
