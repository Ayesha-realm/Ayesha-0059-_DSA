/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.dlab1;

/**
 *
 * @author AYESHA
 */
public class T2_e1 {
    
    public static void main(String args[]){
        
        int[] array=new int[6];
    //array={12,24,36,48,60};
    
    array[0]=12;
    array[1]=24;
    array[2]=36;
    array[3]=48;
    array[4]=60;
    System.out.println("Array before INSERTION: ");
            for(int i=0;i<array.length;i++){
                System.out.print("Index"+i+ ":" +array[i]+" ");
            }
    int newnum=6;
    
    
    for(int i=array.length-1;i>0;i--){
        array[i]=array[i-1];
    }
    array[0]=newnum;
    System.out.println();
        System.out.println("After Insertion: ");
          for(int i=0;i<array.length;i++){
                System.out.print("Index"+i+ ":" +array[i]+" ");
            }
}
    
}
