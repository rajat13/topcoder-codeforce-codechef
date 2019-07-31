import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s = new Scanner(System.in);
	 int t = s.nextInt();
	 for(int i=0;i<t;i++){
	     int n = s.nextInt();
	     int[] array = new int[n];
	     for(int j = 0;j<n;j++)array[j]=s.nextInt();
	     int d = s.nextInt();
	     process(array,n,d);
	     System.out.println("");
	 }
	 }
	 
	 private static void process(int[] array, int n, int d){
	     int start = n-1;
	     int toInsert = array[start];
	     for(int i=0;i<n;i++){
	         int location = (start-d+n)%n;
	         int temp = array[location];
	         array[location]=toInsert;
	         toInsert=temp;
	         start=location;
	     }
	     for(int el: array){System.out.print(el+" ");}
	 }
}
