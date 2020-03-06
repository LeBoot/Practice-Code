/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.Warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Boone
 */
public class SockMerchant {
    
    public int runSockMerchant(int n, int[] ar) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        Set<Integer> keySet = resultMap.keySet();
        int numPairs = 0;
        
        for (int i = 0; i < n; i++) {
            keySet = resultMap.keySet();
            var x = ar[i];
            if (!keySet.contains(x)) {
                resultMap.put(x, 1);
            } else {
                resultMap.put(x, resultMap.get(x) + 1);
            }
        }
        
        for (Integer key : keySet) {
            int x = resultMap.get(key);
            if (x > 1) {
                if (x % 2 == 0) {
                    numPairs += (x/2);
                } else {
                    numPairs += ((x-1)/2);
                }
            }            
        }       
        
        return numPairs;
    }
    
}
