/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myarray;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
class App {
    private final Random rand = new Random();
    public void run(){
        double sum = 0;
        int[]nums = new int[20];
        for (int i = 0;i< nums.length;i++){
            do{
            nums[i] = rand.nextInt();
            }while (nums[i] % 2 !=0);
        }
        for (int i = 0; i< nums.length ; i++){
            System.out.println(nums[i]);
        }
        Arrays.sort(nums);
        nums[0] = 0;
        nums[19] = 0;
        for (int i = 0; i< nums.length ; i++){
            sum +=nums[i];
        }
        System.out.printf("%f", sum/18);
    }
    
}
