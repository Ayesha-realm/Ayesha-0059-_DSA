/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.dlab1;

/**
 *
 * @author AYESHA
 */
public class T2_e2 {
    
    //Element in middle
    public static void main(String args[]){
        
        int[] series=new int [6];
        series[0]=100;
        series[1]=200;
        series[2]=300;
        series[3]=400;
        series[4]=500;
        
        int n_element=250;
        int position=2;
        for(int i=series.length-1;i>position;i--){
            series[i]=series[i-1];
        }
        series[position]=n_element;
        System.out.println("Array After Insertion: ");
        
        
        for (int i=0;i<series.length;i++){
            System.out.println("Index "+ i+": "+series[i]);
        }
        
    }
    
}
