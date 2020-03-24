/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.periodicmethod.controller;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Boone
 */
public class PeriodController {
    
    private final ScheduledExecutorService SCHEDULER = Executors.newScheduledThreadPool(1);
    
    private final Runnable MY_RUNNABLE = new Runnable() {
        @Override
        public void run() {
            myMethod();
        }
    };
    
    public void practicePeriod() {
        try {
            SCHEDULER.scheduleAtFixedRate(MY_RUNNABLE, 0, 5, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Error: " + e + " :: " + e.getLocalizedMessage());
        }
    }
    
    private void myMethod() {
        System.out.println("The Time is " + LocalDateTime.now());
    }
    
}