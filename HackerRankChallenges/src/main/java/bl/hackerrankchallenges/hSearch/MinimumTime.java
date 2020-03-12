/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hSearch;

/**
 *
 * @author Boone
 */
public class MinimumTime {
    
    public int runMinimumTime(int k, int[] ar) {
        int day = 0;
        int numProduced = 0;
        boolean isStillGoing = true;
        
        while (isStillGoing) {
            day++;
            for (int i = 0; i < ar.length; i++) {
                if (day%ar[i] == 0) {
                    numProduced++;
                }
            }
            if (numProduced >= k) {
                isStillGoing = false;
            }
        }
        
        return day;
    }
    
}
