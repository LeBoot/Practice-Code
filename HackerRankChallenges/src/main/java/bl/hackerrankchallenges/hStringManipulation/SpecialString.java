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
public class SpecialString {

    public static int runSpecialString(String s1, String s2) {
        List<String> list1 = dissect(s1);
        List<String> list2 = dissect(s2);
        int max = 0;
        for (String x : list1) {
            if (list2.contains(x) && (x.length() > max)) {
                max = x.length();
            }
        }       
        
        return max;
    }
    
    private static List<String> dissect(String s) {
        List<String> n1 = new ArrayList<>();
        for (int j = 0; j < s.length(); j++) {
            for (int i = j; i < s.length(); i++) {
                n1.add(s.substring(j, i + 1).toLowerCase());
            }
        }
        
        List<String> n2 = new ArrayList<>();
        
        for (String sub1 : n1) {
            for (int j = 0; j < s.length(); j++) {
                for (int i = j; i < s.length(); i++) {
                    String sub2 = s.substring(j, i + 1).toLowerCase();
                    if (sub2.contains(sub1)) {
                        String x = sub2.replace(sub1, "");
                        if (!n2.contains(x) && (x.length() > 0) && (!n1.contains(x))) {
                            n2.add(x);
                        }
                    }
                }
            }
        }
        
        List<String> n3 = new ArrayList<>();
        for (String x : n1) {
            n3.add(x);
        }
        for (String x : n2) {
            n3.add(x);
        }
       
        return n3;
        
    }
    
}

