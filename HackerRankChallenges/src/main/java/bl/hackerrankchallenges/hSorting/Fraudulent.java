/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hSorting;

/**
 *
 * @author Boone
 */
public class Fraudulent {
    
    public int runFraudulent(int[] ex, int d) {
        int totalMessages = 0;
        
        for (int i = d; i < ex.length; i++) {
            int[] prev = new int[d];
            for (int j = 0; j < d; j++) {
                prev[j] = ex[i - (j + 1)];
            }
            totalMessages += determineMessage(sort(prev), ex[i]);
        }
        
        return totalMessages;   
    }
    
    private int determineMessage(int[] prev, int t) {
        double median;
        double today = new Double(t);
        int d = prev.length;
        if (d%2 == 0) {          
            median = ((prev[(d/2)] + prev[(d/2) - 1]) / 2.0);
        } else {
            median = prev[(d/2) - (1/2)];
        }
        
        if (today >= median * 2.0) {
            return 1;
        } else {
            return 0;
        }
    }
    
    private int[] sort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        return ar;
    }
    

    
}
