/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges;

import bl.hackerrankchallenges.Warmup.JumpingOnTheClouds;


/**
 *
 * @author Boone
 */
public class App {
    
    static JumpingOnTheClouds jump = new JumpingOnTheClouds();
    
    public static void main(String[] args) {
         int[] ar = {0, 1, 0, 0, 0, 1, 0};
         int a = jump.runJumpingOnTheClouds(ar);
        
    }
}