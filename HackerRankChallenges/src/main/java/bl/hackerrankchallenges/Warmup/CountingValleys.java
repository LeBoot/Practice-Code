/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.Warmup;

/**
 *
 * @author Boone
 */
public class CountingValleys {
    
    public int runCountingValleys(String s) {
        char[] c = s.toCharArray();
        boolean isInValley = false;
        int elevationChange = 0;
        int numValleys = 0;
        
        for (int i = 0; i < c.length; i++) {
            //If crossing elevation line, change value of isInValley.
            if ((elevationChange == 0) && (c[i] == 'D')) {
                isInValley = true;
            } else if ((elevationChange == 0) && (c[i] == 'U')) {
                isInValley = false;
            }
            
            //Elevation change based on up or down
            if (c[i] == 'D') {
                elevationChange -= 1;
            } else {
                elevationChange += 1;
            }
            
            //Just coming out of a valley
            if ((isInValley == true) && (elevationChange == 0)) {
                numValleys += 1;
            }
        }
        
        return numValleys;
    }
    
}
