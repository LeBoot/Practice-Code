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
public class Pairs {
    
    public int runPairs(int k, int[] ar) {
        int numPairs = 0;
        
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] - ar[j] == k) || (ar[i] - ar[j] == k * -1)) {
                    numPairs++;
                }
            }
        }
        
        return numPairs;
    }
    
}