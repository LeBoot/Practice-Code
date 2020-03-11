/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hStringManipulation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Boone
 */
public class ValidString {
    
    public boolean runValidString(String s) {
        Map<String, Integer> map = stringToMap(s);
        
        int max = 0;
        for (String key : map.keySet()) {
            int val = map.get(key);
            if (val > max) {
                max = val;
            }
        }
        
        int min = max;
        for (String key : map.keySet()) {
            int val = map.get(key);
            if (val < min) {
                min = val;
            }
        }
        
        if (max >= min + 2) {
            return false;
        } else if (max == min) {
            return true;
        } else {
            boolean oneOccurance = false;
            boolean twoOccurance = false;
            for (String key : map.keySet()) {
                int val = map.get(key);
                if (val > min) {
                    if (oneOccurance == false) {
                        oneOccurance = true;
                    } else {
                        twoOccurance = true;
                    }
                }
            }
            if (twoOccurance == true) {
                return false;
            } else {
                return true;
            }
        }       
        
    }
    
    private Map<String, Integer> stringToMap(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String x = s.substring(i, i + 1);
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        return map;
    }
    
}
