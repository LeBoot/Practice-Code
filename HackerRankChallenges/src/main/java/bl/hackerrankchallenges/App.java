/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges;

import bl.hackerrankchallenges.hGreedy.GreedyFlorist;
import bl.hackerrankchallenges.hSearch.Candy;
import bl.hackerrankchallenges.hSearch.IceCream;
import bl.hackerrankchallenges.hSearch.MinimumTime;
import bl.hackerrankchallenges.hStringManipulation.SpecialString;


/**
 *
 * @author Boone
 */
public class App {
    
    static Candy candy = new Candy();
    
    public static void main(String[] args) {
        long m = 1;
        long w = 2;
        long p = 1;
        long n = 60;
        candy.runCandy(m, w, p, n);
        
    }  
    
}