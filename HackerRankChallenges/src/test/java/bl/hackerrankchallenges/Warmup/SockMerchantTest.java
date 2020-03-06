/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.hackerrankchallenges.Warmup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Boone
 */
public class SockMerchantTest {
    
    SockMerchant sock = new SockMerchant();
    
    @Test
    public void testRunSockMerchant1() {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        
        assertEquals(3, sock.runSockMerchant(n, ar));
    }
    
    @Test
    public void testRunSockMerchant2() {
        int n = 10;
        int[] ar = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        
        assertEquals(5, sock.runSockMerchant(n, ar));
    }
    
    @Test
    public void testRunSockMerchant3() {
        int n = 9;
        int[] ar = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        
        assertEquals(0, sock.runSockMerchant(n, ar));
    }
    
    @Test
    public void testRunSockMerchant4() {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 90, 20};
        
        assertEquals(2, sock.runSockMerchant(n, ar));
    }
    
}
