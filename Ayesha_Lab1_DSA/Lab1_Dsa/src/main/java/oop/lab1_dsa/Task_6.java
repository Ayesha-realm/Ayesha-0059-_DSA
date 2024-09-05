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
public class Task_6 {
    
     public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Word to check if it's palindrome or not");
        String word=input.nextLine();
        
char[] array = word.toCharArray();
        int length = array.length;
        char[] reversedArray = new char[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        String reversedString = new String(reversedArray);

        if (word.equals(reversedString)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }
    
}
