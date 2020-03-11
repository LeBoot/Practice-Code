/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hStringManipulation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Boone
 */
public class Anagrams {
    
    public static int runAnagrams(String s1, String s2) {        
        List<String> list1 = createList(s1);
        List<String> list2 = createList(s2);
        
        boolean reset = true;
        
        while (reset) {
            reset = false;
            for (int i = 0; i < list1.size(); i++) {
                String x = list1.get(i);
                if (list2.contains(x)) {
                    list1.remove(x);
                    list2.remove(x);
                    reset = true;
                }
            }
        }    
        
        return list1.size() + list2.size();
    }
    
    private static List<String> createList(String s) {
        List<String> list = new ArrayList<>();
        
        for (int i = 1; i <= s.length(); i++) {
            String x = s.substring(i - 1, i);
            list.add(x);
        }
        
        return list;
    }
    
}
