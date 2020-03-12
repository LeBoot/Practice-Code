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
public class IceCream {
    
    public int[] runIceCream(int k, int[] ar) {
        int[] answer = new int[2];
        
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                int test1 = ar[i];
                int test2 = ar[j];
                if ((ar[i] + ar[j]) == k) {
                    if (ar[i] > ar[j]) {
                        answer[0] = j + 1;
                        answer[1] = i + 1;
                    } else {
                        answer[0] = i + 1;
                        answer[1] = j + 1;
                    }
                    return answer;
                }
            }
        }
        
        return answer;
    }
    
}
