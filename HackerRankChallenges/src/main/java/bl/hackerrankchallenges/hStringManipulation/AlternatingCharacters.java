/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.hStringManipulation;

/**
 *
 * @author Boone
 */
public class AlternatingCharacters {
    
    public int runAlternatingCharacters(String s) {
        char[] charArray = s.toCharArray();
        int num = 0;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i-1]) {
                num += 1;
            }
        }
        return num;
    }
    
}
