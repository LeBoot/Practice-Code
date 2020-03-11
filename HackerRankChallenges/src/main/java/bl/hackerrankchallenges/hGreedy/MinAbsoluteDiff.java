/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hGreedy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Boone
 */
public class MinAbsoluteDiff {
    
    public int runMinAbsoluteDiff(int[] ar) {
        List<Integer> differences = new ArrayList<>();
        int max = 0;
        int min;
        
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                int x = calcAbsoluteDiff(ar[i], ar[j]);
                differences.add(x);
                if (x > max) {
                    max = x;
                }
            }
        }
        
        min = max;
        for (int diff : differences) {
            if (diff < min) {
                min = diff;
            }
        }
        
        return min;        
        
    }
    
    private int calcAbsoluteDiff(int num1, int num2) {
        num1 = makePositive(num1);
        num2 = makePositive(num2);
        
        if (num1 > num2) {
            return (num1 - num2);
        } else {
            return (num2 - num1);
        }
        
    }
    
    private int makePositive(int num) {
        if (num < 0) {
            return (num * -1);
        } else {
            return num;
        }
    }
    
}
