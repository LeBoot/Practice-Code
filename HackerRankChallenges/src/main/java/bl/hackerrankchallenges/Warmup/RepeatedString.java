/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.Warmup;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Boone
 */
public class RepeatedString {
    
    public int runRepeatedString(int n, String s) {
        char[] c = s.toCharArray();
        int l = s.length();
        int numA = 0;
        int m, i, charLeft;
        
        BigDecimal N = new BigDecimal(String.valueOf(n));
        BigDecimal L = new BigDecimal(String.valueOf(l));
        BigDecimal M = N.divide(L, RoundingMode.DOWN);
        m = M.intValue();
        
        for (char ch : c) {
            if (ch == 'a') {
                numA += 1;
            }
        }
        numA *= m;
        
        charLeft = n - (l * m);
        
        for (i = 0; i < charLeft; i++) {
            if (c[i] == 'a') {
                numA += 1;
            }
        }

        return numA;
    }
    
}
