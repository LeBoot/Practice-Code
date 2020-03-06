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
public class JumpingOnTheClouds {
    
    public static int runJumpingOnTheClouds(int[] ar) {
        int numJumps = 0;
        int position = 0;
        
        while (position < ar.length - 1) {
            if (position == ar.length - 2) {
                position += 1;
            } else {
                if (ar[position + 2] == 0) {
                    position += 2;
                } else {
                    position += 1;
                }
            }           
            numJumps += 1;
        }
        
        return numJumps;
    }
    
}
