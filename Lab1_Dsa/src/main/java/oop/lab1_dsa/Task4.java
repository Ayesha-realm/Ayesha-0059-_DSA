/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab1_dsa;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AYESHA
 */

public class Task4 {
     public static void main(String args[]){
     
        Scanner input=new Scanner(System.in);
        
         System.out.println("Task 4 Exercise 1");
        //int[] arr={13,26,39,52,65};
        
        int[] arr=new int[5];
         arr[0]=13;
         arr[1]=26;
         arr[2]=39;
         arr[3]=52;
         arr[4]=65;
         
        
        System.out.println("Enter index between 0 to 4 : ");
        int num=input.nextInt();
        for(int i=0;i<arr.length;i++){
            if(num==i){
                System.out.println("Element on index is: "+ arr[i]);
            }
        }
        
        
          System.out.println("\n Task 4 Ecercise 2");
      
        System.out.println("Enter element  to find its index: ");
        int number=input.nextInt();
               
        int[] array={4,6,2,8,10};

for(int i=0;i<array.length;i++){
    if (number==array[i]){
        System.out.println("Index of Element is: "+ i);
    }
        
}

         System.out.println("\n Exercise 3");

System.out.println("Enter value: ");
        int num_2=input.nextInt();
          
        int[] s_arr={11,22,33,44,55};
        Arrays.sort(s_arr);
        int left=0;
        int right =s_arr.length-1;
        int middle;
        
        
        boolean found=false;
        while(left <= right){
            middle=left + (right-left)/2;
            
            if(s_arr[middle]== num_2){
                System.out.println(num_2+ " found at index "+ middle);
                found=true;
                break;
            }
        if(s_arr[middle]< num_2){
            left=middle+1;
        }
        else{
            right=middle-1;
        }
            
        
        }
     }

     }

    

