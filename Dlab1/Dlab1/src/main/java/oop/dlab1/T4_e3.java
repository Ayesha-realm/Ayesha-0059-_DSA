/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.dlab1;

/**
 *
 * @author AYESHA
 */
import java.util.Arrays;
import java.util.Scanner;
public class T4_e3 {
    public static void main(String args[]){
        //Implementing binary search
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value: ");
        int num=input.nextInt();
          
        int[] s_arr={11,22,33,44,55};
        Arrays.sort(s_arr);
        int left=0;
        int right =s_arr.length-1;
        int middle;
        
        
        boolean found=false;
        while(left <= right){
            middle=left + (right-left)/2;
            
            if(s_arr[middle]== num){
                System.out.println(num+ " found at index "+ middle);
                found=true;
                break;
            }
        if(s_arr[middle]< num){
            left=middle+1;
        }
        else{
            right=middle-1;
        }
            
        
    }
        if(found==false){
            System.out.println("Element not found in the array ");
        }
        
        
    }
}
