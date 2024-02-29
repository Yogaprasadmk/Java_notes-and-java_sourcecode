/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main{
    static void armstrong(int n){
        for(int i = 1;i<n;i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main (String[] args) 
    {
    Scanner s= new Scanner(System.in);
    System.out.print("Enter:");
    int n = s.nextInt();
    armstrong(n);
    }
}


