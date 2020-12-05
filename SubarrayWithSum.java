/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int[] a = {1, 2, 3, 7, 5};
		int n = 5, s = 12;
		
		//start=4, end=4, tempSum=31\ tempSum=7
		int end =0,start=0, tempSum=0;
		for(; end < n && tempSum != s; end++){
		    tempSum += a[end];
		    if(tempSum > s){
		       while(start < end && tempSum > s){
		           tempSum -= a[start];
		           start += 1;
		           if(tempSum == s){
		               break;
		           }
		       }
		    }
		}
		
		if(tempSum != s){
		    ++start;
		    System.out.println("start = " + start + " end = " + end);    
		    System.out.println("you will never find me here! ha ha ha");
		} else{
		  ++start;
		  System.out.println("start = " + start + " end = " + end);    
		}
		
	}
}
