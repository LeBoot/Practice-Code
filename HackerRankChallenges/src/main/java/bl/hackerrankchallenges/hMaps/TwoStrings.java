/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hMaps;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Boone
 */
public class TwoStrings {
    
    public static String runTwoStrings(String s1, String s2) {
        Set<String> substringS1 = new HashSet();
        
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                String subset = s1.substring(i, j).toLowerCase();
                substringS1.add(subset);
            }
        }
        
        for (int i = 0; i < s2.length(); i++) {
            for (int j = i + 1; j < s2.length(); j++) {
                String subset = s2.substring(i, j).toLowerCase();
                if (substringS1.contains(subset)) {
                    return "YES";
                }
            }
        }
        
        return "NO";
    }
    
}
