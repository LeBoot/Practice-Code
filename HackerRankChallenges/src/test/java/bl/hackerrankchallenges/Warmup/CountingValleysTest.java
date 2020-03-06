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
public class CountingValleysTest {

    CountingValleys cv = new CountingValleys();
    
    @Test
    public void testRunCountingValleys1() {
        String s = "UDDDUDUU";
        assertEquals(1, cv.runCountingValleys(s));   
    }
    
    @Test
    public void testRunCountingValleys2() {
        String s = "DDUUUUUUDUDDDD";
        assertEquals(1, cv.runCountingValleys(s));   
    }
    
    @Test
    public void testRunCountingValleys3() {
        String s = "UDUDUDUUDD";
        assertEquals(0, cv.runCountingValleys(s));   
    }
    
    @Test
    public void testRunCountingValleys4() {
        String s = "UUDD";
        assertEquals(0, cv.runCountingValleys(s));   
    }
    
    @Test
    public void testRunCountingValleys5() {
        String s = "DDUUUUUUDUDDDDDU";
        assertEquals(2, cv.runCountingValleys(s));   
    }
    
}
