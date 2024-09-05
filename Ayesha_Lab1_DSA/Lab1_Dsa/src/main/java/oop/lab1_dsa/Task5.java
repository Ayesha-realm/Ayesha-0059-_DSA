/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab1_dsa;

import java.util.Scanner;

/**
 *
 * @author AYESHA
 */
public class Task5 {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int size=input.nextInt();
        int[] array=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++){
            
           array[i]=input.nextInt();
        }
        System.out.print("\nArray without Reversal: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+ " ");
            
        }
        
        
        
       System.out.print("\nArray After Reversal: ");
        
       for(int i=0;i<size/2;i++){
           int element=array[i];
           array[i]=array[size-1-i];
           array[size-1-i]=element;
       }
       
            //for(int i=size-1;i>=0;i--){
          
                for(int i=0;i<size;i++){
                 System.out.print(array[i]+" ");
                
                
            }
        }
    
}
