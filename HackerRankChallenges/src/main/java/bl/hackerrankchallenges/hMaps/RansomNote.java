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
public class RansomNote {
    
    public String runRansomNote(String[] mag, String[] note) {
        
        Map<String, Integer> noteMap = new HashMap<>();
        
        for (String word : mag) {
            if (noteMap.keySet().contains(word)) {
                noteMap.put(word, noteMap.get(word) + 1);
            } else {
                noteMap.put(word, 1);
            }
        }
        
        for (String word : note) {
            if (noteMap.keySet().contains(word)) {
                if (noteMap.get(word) > 0) {
                    noteMap.put(word, noteMap.get(word) - 1);
                } else {
                    return "No";
                }
            } else {
                return "No";
            }
        }
        
        return "Yes";
        
    }
    
}
