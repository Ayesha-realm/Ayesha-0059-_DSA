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
public class d2_T1 {
    
  //  public int[] getConcatenation(int[] nums) {
   

   // }
public static void main(String args[]){
Scanner input =new Scanner(System.in);
int n=input.nextInt();
int[] nums= new int[n];
int[] ans= new int[2*nums.length];

//for (int i=0;i<nums.length-1;i++){
for (int  i=0;i<ans.length;i++){
    
    ans[i]= nums[i];
    ans[i+nums.length] = nums[i];
 }
return ans;

}
 for (int  i=0;i<ans.length;i++){
   System.out.print(ans[i]);


 }

}
}
    
