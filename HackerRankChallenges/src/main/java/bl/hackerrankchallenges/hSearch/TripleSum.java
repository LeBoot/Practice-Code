/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hSearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Boone
 */
public class TripleSum {
    
    public int runTripleSum(int[] ar1, int[] ar2, int[] ar3) {
        int numTriples = 0;
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < ar1.length; i++) {
        for (int j = 0; j < ar2.length; j++) {
        for (int k = 0; k < ar3.length; k++) {
            
            String triple = ar1[i] + ", " + ar2[j] + ", " + ar3[k]; 
            if (
                    (ar1[i] <= ar2[j]) &&
                    (ar3[k] <= ar2[j]) &&
                    (!list.contains(triple))

                ){
                numTriples++;
            }
            list.add(triple);

        }}}
        
        return numTriples;
    }
    
}
