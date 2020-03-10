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
public class BubbleSort {
    
    public int[] runBubbleSort(int[] ar) {
        int moves = 0;
        int[] x = new int[3];
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    moves++;
                }
            }
        }        
        
        x[0] = ar[0];
        x[1] = ar[ar.length - 1];
        x[2] = moves;
        return x;
    }

}
