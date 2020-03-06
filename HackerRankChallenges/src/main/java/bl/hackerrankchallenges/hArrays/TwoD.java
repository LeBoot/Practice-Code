/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hArrays;

/**
 *
 * @author Boone
 */
public class TwoD {
    
    public int runTwoD(int[][] ar) {
        int maxSum = 0;
        int width = ar.length - 1;
        int height = ar[0].length - 1;
        
        for (int i = 0; i < width - 1; i++) {
            for (int j = 0; j < height - 1; j++) {
                int value = (ar[i][j] + ar[i + 1][j] + ar[i + 2][j] + 
                        ar[i][j + 1] + ar[i + 1][j + 1] + ar[i + 2][j + 1] +
                        ar[i][j + 2] + ar[i + 1][j + 2] + ar[i + 2][j + 2]);
                if (value > maxSum) {
                    maxSum = value;
                }
            }
        }
        
        return maxSum;
    }
    
}
