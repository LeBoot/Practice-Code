/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hMaps;

/**
 *
 * @author Boone
 */
public class CountTriples {
    
    public static int runCountTriples(int r, int[] ar) {
        int triples = 0;
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] == r * ar[i]) {
                    for (int k = j + 1; k < ar.length; k++) {
                        if (ar[k] == r * ar[j]) {
                            triples++;
                        }
                    }
                }
            }
        }
        
        return triples;
    }
    
}
