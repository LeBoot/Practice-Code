/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hMaps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Boone
 */
public class FrequencyQueries {
 
    public String runFrequencyQueries(int[][] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        String str = "";
        
        for (int i = 0; i < ar.length; i++) {
            int key = ar[i][1];
            switch (ar[i][0]) {
                case 1:
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key) + 1);                        
                    } else {
                        map.put(key, 1);
                    }
                    break;
                case 2:
                    if (map.containsKey(key)) {
                        if (map.get(key) > 0) {
                            map.put(key, map.get(key) - 1); 
                        }                        
                    }
                    break;
                case 3:
                    boolean isPresent = false;
                    for (int mapKey : map.keySet()) {
                        if (map.get(mapKey) == key) {
                            isPresent = true;
                        }
                    }
                    if (isPresent) {
                        str += "1";
                    } else {
                        str += "0";
                    }
                    break;
            }
        }
        
        return str;
    }
    
}
