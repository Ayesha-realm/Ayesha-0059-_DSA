/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab1_dsa;

/**
 *
 * @author AYESHA
 */
public class Task_3 {
     public static void main(String args[]){
        
        int[] array={8,16,24,32,40};
        System.out.println("Array before deletion: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
               
        int del_index=2;
        
               
        for(int i=del_index;i<array.length-1;i++){
        
        array[i]=array[i+1];
        }
        array[array.length-1]=0;
     
        System.out.println("\n Array after Deletion: ");
         for(int i=0;i<array.length;i++){
            System.out.println("Index" +i+ ": "+ array[i]);
        }
       
    }
     
   
    
}
