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
public class MaximumSubarray {
    
    public int runMaximumSubarray(int m, int[] ar) {
        int max = 0;
        
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                int subSum = 0;
                for (int k = i; k <= j; k++) {
                    subSum += ar[k];
                }
                int modulo = subSum % m;
                if (modulo > max) {max = modulo;}
            }
        }
        
        return max;
    }
    
}
