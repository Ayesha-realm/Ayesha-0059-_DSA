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
public class T4_e1 {
    public static void main(String args[]){
        //Searching element by index
        Scanner input=new Scanner(System.in);
        
       
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
        
        
        
    }
}
