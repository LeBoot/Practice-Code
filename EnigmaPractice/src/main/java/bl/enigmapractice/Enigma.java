/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.enigmapractice;

/**
 *
 * @author Boone
 */
public class Enigma {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Output, from lowercase: " + scramble(input));
        System.out.println("Output, from uppercase: " + scramble(input.toUpperCase()));
        
    }
    
    public static int scramble(String input) {
        
        String myList1 = "1234567890xl";
        String myList2 = "abcdefghijkm";
        String myList3 = "nopqrstuvwyz";
        String myList4 = "ABCDEFGHIJKL";
        String myList5 = "MNOPQRSTUVWX";
        String myList6 = "YZ#$";        
        
        String myList0 = myList1 + myList2 + myList3 + myList4 + myList5 + myList6;
        
        int newKey = -1;
        
        for (int i = 0; i < myList0.length(); i++) {
            if (myList0.charAt(i) == input.toCharArray()[0]) {
                newKey = i;
            }
        }
        
        return newKey; 
        
    }
    
}
