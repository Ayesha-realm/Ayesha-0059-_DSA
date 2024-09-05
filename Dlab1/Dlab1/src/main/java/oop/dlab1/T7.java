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

public class T7 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter string1 : ");
        String text_1=input.nextLine();
          System.out.print("Enter string2 : ");
        String text_2=input.nextLine();
        char[] array = text_1.toCharArray();
        char[] array_2= text_2.toCharArray();
        Arrays.sort(array);
        Arrays.sort(array_2);
       // if(array.length==array_2.length){
            if(Arrays.equals(array,array_2)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        
           
       
    }
    
}
