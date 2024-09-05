/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.dlab1;

/**
 *
 * @author AYESHA
 */
import java.util.Scanner;
public class T4_e2 {
    public static void main(String args[]){
        //Implementing Linear search
       Scanner input =new Scanner(System.in); 
        System.out.println("Enter element  to find its index: ");
        int number=input.nextInt();
               
        int[] array={4,6,2,8,10};

for(int i=0;i<array.length;i++){
    if (number==array[i]){
        System.out.println("Index of Element is: "+ i);
    }
}

    }
}
