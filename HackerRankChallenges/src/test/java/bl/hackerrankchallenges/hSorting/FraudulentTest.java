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
public class FraudulentTest {

    Fraudulent fraud = new Fraudulent();
    
    @Test
    public void testRunFradulent1() {
        int d = 3;
        int[] exp = {10, 20, 30, 40, 50};
        assertEquals(1, fraud.runFraudulent(exp, d));
    }
    
    @Test
    public void testRunFradulent2() {
        int d = 5;
        int[] exp = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        assertEquals(2, fraud.runFraudulent(exp, d));
    }

    @Test
    public void testRunFradulent3() {
        int d = 4;
        int[] exp = {1, 2, 3, 4, 4};
        assertEquals(0, fraud.runFraudulent(exp, d));
    }
    
}
