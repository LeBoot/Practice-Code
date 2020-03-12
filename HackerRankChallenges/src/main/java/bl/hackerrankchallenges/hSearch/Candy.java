/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hSearch;

/**
 *
 * @author Boone
 */
public class Candy {
    
    public long runCandy(long m, long w, long p, long n) {
        int pass = 0;
        int produced = 0;
        
        while (produced < n) {
            pass++;
            produced += m * w;
            boolean makePurchase = true;
            
            while (makePurchase) {
                makePurchase = false;
                if ((produced >= p) &&
                        ((m + 1) * w) < (n / 2) || (m * (w + 1)) < (n / 2)) {
                    if (m < w) {m++;}
                    else {w++;}
                    produced -= p;
                    makePurchase = true;
                }
            }

        }
        
        return pass;
    }
    
}