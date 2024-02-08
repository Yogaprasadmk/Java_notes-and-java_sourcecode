import java.util.Scanner;
 class Main{
     public static void main(String args[]){
         Scanner ar = new Scanner(System.in);
         int n = 3;
         int k = 3;
         int b[][] = new int[n][k];
       
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                System.out.println("enter for row "+i + "for column"+j);
               b[i][j] = ar.nextInt();
            }
            
        }
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
               System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        
     }
 }
