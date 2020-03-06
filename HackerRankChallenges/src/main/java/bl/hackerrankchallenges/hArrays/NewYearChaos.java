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
public class NewYearChaos {
    
    public int runNewYearChaos(int[] ar) {
        int bribes = 0;
        boolean chaos = false;
        
        for (int i = 0; i < ar.length - 1; i++) {
            if (i < ar.length - 1) {
                if (ar[i] > ar[i + 1]) {
                    bribes += 1;
                }
                if (i < ar.length - 2) {
                    if (ar[i] > ar[i + 2]) {
                        bribes += 1;
                    }
                    if (i < ar.length - 3) {
                        if (ar[i] > ar[i + 3]) {
                            chaos = true;
                        }
                    }
                }
                
            }    
        }
        
        if (!chaos) {
            return bribes;
        } else {
            return -1;
        }
    }
}
