/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hArrays;

/**
 *
 * @author Boone
 */
public class LeftRotation {
    
    public int[] runLeftRotation(int d, int[] ar) {        
        for (int k = 1; k <= d; k++) {
            int[] newArray = ar.clone();
            for (int i = 0; i < ar.length - 1; i++) {
                ar[i] = newArray[i + 1];
            }
            ar[ar.length - 1] = newArray[0];
        }
        return ar;
    }
    
}