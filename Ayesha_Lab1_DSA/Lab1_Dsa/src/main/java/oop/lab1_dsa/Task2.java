/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab1_dsa;

/**
 *
 * @author AYESHA
 */
public class Task2 {
    public static void main(String args[]){
        
        System.out.println(" Task 2 Exercise 1");
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
          
          System.out.println("\n Task 2 Exercise 2");
           //Element in middle
    
        
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
            System.out.println(series[i]+ " ");
        }
        
    
   System.out.println("\n\n Task 2 Exercise 3");
   
   //Insertion At end 
    int[] arr=new int[6];
        arr[0]=3;
        arr[1]=6;
        arr[2]=9;
        arr[3]=12;
        arr[4]=15;
         
        for(int i=0;i<arr.length;i++){
         
            System.out.println("Index"+i+" "+ arr[i]);
            
        }
        arr[5]=18;
        System.out.println("\nAfter inserting element at the end");
        
         for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+ " ");
            
        }
         
       
    
    
}    
        }
         
       
        
        
        
        
   
    
          
          
          
          
          
          

    

