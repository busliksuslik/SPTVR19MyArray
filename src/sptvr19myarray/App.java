/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myarray;

import java.util.Random;

/**
 *
 * @author user
 */
class App {
    private final Random rand = new Random();
    public void run(){
        int[]nums = new int[20];
        for (int i = 0;i< nums.length;i++){
            nums[i] = rand.nextInt();
        }
        for (int i = 0; i< nums.length ; i++){
            System.out.println(nums[i]);
        }
    }
    
}
