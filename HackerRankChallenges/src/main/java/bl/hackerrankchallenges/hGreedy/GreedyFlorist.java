/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hGreedy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Boone
 */
public class GreedyFlorist {
    
    public int runGreedyFlorist(int k, int[] costs) {
        BigDecimal bdk = new BigDecimal(k);
        BigDecimal bdl = new BigDecimal(costs.length);
        BigDecimal bdMinForEach = bdl.divide(bdk, RoundingMode.FLOOR);
        BigDecimal bdRemainder = bdl.subtract(bdMinForEach);
        
        int minForEach = bdMinForEach.intValue();
        int remainder = bdRemainder.intValue();
        int totalCost = 0;
        
        for (int i = 0; i < costs.length; i++) {
            for (int j = 0; j < minForEach + 1; j++) {
                totalCost += (j + costs[i]);
            }
        }
        
        return totalCost;
    }
    
}
