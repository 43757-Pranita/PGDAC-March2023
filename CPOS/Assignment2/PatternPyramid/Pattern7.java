import java.util.Scanner;

class Pattern7{
 public static void main(String args[]){
 
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter The Number Of Terms Here = ");
 int n = sc.nextInt();
 
   for(int i = n ; i >= 1 ; i--)
   {
	   for(int j = n-i ; j>= 0 ; j--)
	   {
		   System.out.print(" ");
	   }
	   for(int k = 1 ; k<= i ; k++)
	   {
		   System.out.print(i +" ");
	   }
	   System.out.println();
   }
 }
}