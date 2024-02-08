import java.util.Scanner;
 class Main{
     public static void main(String args[]){
         Scanner ar = new Scanner(System.in);
         int n = 2;
         int k = 2;
         int b[][] = new int[n][k];
       
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                System.out.println("enter for row "+i + "for column"+j);
               b[i][j] = ar.nextInt();
            }
            
        }
        // enchanced for loop for array
        for(int er[]:b)
        {
            for(int val:er){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        
     }
 }
