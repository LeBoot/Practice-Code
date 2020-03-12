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
public class GreedyFlorist {
    
    public int runGreedyFlorist(int k, int[] costs) {
        int totalCost = 0;
        int round = 1;
        for (int i = 0; i < costs.length; i++) {
            totalCost += (round -1) + costs[i];
            if (i + 1 == round * k ) {
                round++;
            }
        }
        
        return totalCost;
    }
    
}
