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
        System.out.printf("---MyArray---%nЗадание:%nСоздайте массив из 20 случайных целых чисел%nВычислите среднее арифметическое элементов массива%nбез учёта минимального и максимального элементов массива.%nРешение:%nМассив целых чётных чисел:%n");
        double sum = 0;
        int[]nums = new int[20];
        for (int i = 0;i< nums.length;i++){
            do{
            nums[i] = rand.nextInt();
            }while (nums[i] % 2 !=0);
        }
        for (int i = 0; i< nums.length ; i++){
            System.out.printf("%12d",nums[i]);
        }
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        nums[0] = 0;
        nums[19] = 0;
        for (int i = 0; i< nums.length ; i++){
            sum +=nums[i];
        }
        System.out.printf("%nСреднее арифметическое без учёта максимального (%d) и минимального(%d): %.2f%n",max,min,sum/18);
    }
    
}
