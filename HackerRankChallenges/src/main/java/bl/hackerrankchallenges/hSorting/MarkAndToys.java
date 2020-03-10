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
public class MarkAndToys {
    
    public int runMarkAndtoys(int[] ar, int k) {
        int[] sorted = sort(ar);
        int totalToys = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (ar[i] < k) {
                totalToys++;
                k -= ar[i];
            }
        }
        return totalToys;
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
