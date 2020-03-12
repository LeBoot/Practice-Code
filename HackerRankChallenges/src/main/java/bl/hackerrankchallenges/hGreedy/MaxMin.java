/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hGreedy;

/**
 *
 * @author Boone
 */
public class MaxMin {
    
    public int runMaxMin(int k, int[] ar) {
        ar = orderArray(ar);
        return (ar[k - 1] - ar[0]);
    }
    
    private int[] orderArray(int[] ar) {
        boolean cycleAgain = true;     
        while (cycleAgain) {
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar [i + 1] = temp;
                }
            }
            cycleAgain = false;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    cycleAgain = true;
                }
            }
        }  
        return ar;
    }
    
}
