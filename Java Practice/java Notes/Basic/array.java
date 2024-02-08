import java.util.Scanner;
 class Main{
     public static void main(String args[]){
         Scanner ar = new Scanner(System.in);
         int n = 5;
         int a[] = new int[n];
         for(int i = 0;i<n;i++){
             a[i] = ar.nextInt();
             System.out.print(a[i]+" ");
         }
         System.out.println();
     }
 }
