class Patterns
{
        static void pattern1(int n){
            for(int i = 0;i<n;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        // output
        /*
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
         */
        static void pattern2(int n){
            for(int i = 0;i<n;i++){
                for(int j = 0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        // output
        /*
            * 
            * *     
            * * *   
            * * * * 
            * * * * *
         */
        static void pattern3(int n){
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=i;j++){
                    System.out.print(j +" ");
                }
                System.out.println();
            }
        }
        // output
        /*
        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        static void pattern4(int n){
            // row
            for(int i = 1;i<=n;i++){
                // column
                for(int j = 0;j<i;j++){
                    System.out.print(i +" ");
                }
                System.out.println();
            }
        }
        // output
        /*
        1 
        2 2       
        3 3 3     
        4 4 4 4   
        5 5 5 5 5 
         */
        static void Pattern5(int n)
        {
        // row
        for(int i = 0;i<n;i++)
        {
            // column
                for(int j = 0;j<n - i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        // output
        /*
        * * * * * 
        * * * *   
        * * *     
        * *       
        * 
         */
        static void Pattern6(int n){
            for(int i = 0;i<=n;i++){
                for(int j = 1;j<=n - i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        // output
        /*
        1 2 3 4 5 
        1 2 3 4   
        1 2 3     
        1 2         
        1
         */
        static void Pattern7(int n)
        {
            // row
            for(int i = 0;i<n;i++){
                // space
                for(int j = 0;j<n - i;j++){
                    System.out.print("  ");
                }
                // star
                for(int j = 0;j<(2*i) + 1;j++){
                    System.out.print("* ");
                }

                // space
                for(int j = 0;j<n - i;j++){
                    System.out.print("  ");
                }
                System.out.println();
            }
            
        }
        // output
        /*
          *
        * * *
      * * * * *       
    * * * * * * *     
  * * * * * * * * *   
         */
        static void Pattern8(int n){
                // row
                for(int i = 0;i<n;i++){
                    // space
                    for(int j = 0;j<i;j++){
                        System.out.print("  ");
                    }
                    // star
                    for(int j = 0;j<((2*n)-(2*i))-1;j++){
                        System.out.print("* ");
                    }
    
                    // space
                    for(int j = 0;j<i;j++){
                        System.out.print("  ");
                    }
                    System.out.println();
                }
        }
        // output
        /*
* * * * * * * * * 
  * * * * * * *   
    * * * * *     
      * * *       
        *
         */
        static void Pattern9(int n){
            // pattern 7
            for(int i = 0;i<n;i++){
                // space
                for(int j = 0;j<n - i;j++){
                    System.out.print("  ");
                }
                // star
                for(int j = 0;j<(2*i) + 1;j++){
                    System.out.print("* ");
                }

                // space
                for(int j = 0;j<n - i;j++){
                    System.out.print("  ");
                }
                System.out.println();
            }
            // pattern 8
            for(int i = 0;i<n;i++){
                // space
                for(int j = 0;j<=i;j++){
                    System.out.print("  ");
                }
                // star
                for(int j = 0;j<((2*n)-(2*i))-1;j++){
                    System.out.print("* ");
                }

                // space
                for(int j = 0;j<=i;j++){
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
        // output
        /*
         * 
        * * *
      * * * * *       
    * * * * * * *     
  * * * * * * * * *   
  * * * * * * * * *   
    * * * * * * *     
      * * * * *       
        * * *
          *
         */

        //  pattern10
        static void Pattern10(int n){
                for(int i = 0;i<=2*n - 1;i++){ //row
                    int stars = i;
                    if(i>5){
                        stars = 2*n - i;
                    }
                    for(int j = 1;j<=stars;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
        }
        //output
        /*         
        
        * 
        * *   
        * * * 
        * * * * 
        * * * * * 
        * * * *
        * * *
        * * 
        * 
        
        */
        // pattern 12
        static void Pattern12(int n){
            // spaces
            int spaces = 2 * (n - 1);
            for(int i = 0;i<n;i++){
                // numbers
                for(int j = 1;j<=i;j++){
                    System.out.print(j+" ");
                }
                // spacing
                for(int j = 1;j<=spaces;j++){
                    System.out.print("  ");
                } 
                // numbers
                 for(int j = i;j>=1;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
                spaces = spaces - 2;
            }
        }
        // output
        /*
        1             1 
        1 2         2 1 
        1 2 3     3 2 1 
        1 2 3 4 4 3 2 1 
         */

        // pattern13
        static void Pattern13(int n){
            int  num = 1;
            for(int i = 0;i<=n;i++){
                for(int j = 1;j<=i;j++){
                    System.out.print(num+" ");
                    num += 1;
                }
                System.out.println();
                
            }
        } 
        // output
        /* 1 
           2 3
           4 5 6
           7 8 9 10
           11 12 13 14 15 */
        //pattern14
        static void Pattern14(int n){
            for(int i = 0;i<n;i++){
            for(char ch ='A';ch<='A' + i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        
       //
        /*
        A 
        A B
        A B C
        A B C D
        A B C D E
        */
        // pattern15
        static void Pattern15(int n){
            for(int i = 0;i<n;i++){
                for(char ch = 'A';ch<='E' - i;ch++){
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }
        // output
        /*
         A B C D E 
         A B C D   
         A B C     
         A B       
         A
         */
         static void Pattern16(int n){
            for(int i = 0;i<n;i++){
                char ch = ((char)((int)'A' + i)); // int  to char
                for(int j = 0;j<=i;j++){
                    System.out.print(ch +" ");
                }
             System.out.println();   
            }
        }
        //output
        /* A 
           B B       
           C C C     
           D D D D   
           E E E E E */
        // pattern17
        static void Pattern17(int n){
            //outer loop
            for(int i=0;i<n;i++){
                // inner loop
                for(int j = 0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                char ch = 'A';
                int breakpoint = (2*i + 1) / 2;
                for(int j = 1;j<=2*i + 1;j++){
                    System.out.print(ch+" ");
                    if(j<=breakpoint){
                        ch++;
                    }
                    else{
                        ch--;
                    }
                }
                
                for(int j = 0;j<n;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        /*
              A      
            A B A      
          A B C B A      
        A B C D C B A      
      A B C D E D C B A      
         */
        // pattern 18
         static void Pattern18(int n){
            for(int i = 0;i<n;i++){
                for(char ch = (char)((int)'E'- i);ch <= 'E';ch++){
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }
        /*
         E 
         D E       
         C D E     
         B C D E   
         A B C D E
         */
        //pattern 19
                static void Pattern19(int n){
                        int n = 5;
        //initial space
        int inis = 0;
           for(int i=0;i<n;i++)
           {
            //   stars
               for(int j = 1;j<=n-i;j++){
                   System.out.print("* ");
               }
            // spaces   
               for(int j = 0;j<inis;j++){
                   System.out.print("  ");
               }
            // stars  
               for(int j = 01;j<=n-i;j++){
                   System.out.print("* ");
               }
               inis += 2;
               System.out.println();
           }
        //   spaces for next star
           inis = 2*(n-2);
            for(int i=1;i<=n;i++)
           {
            //   stars
               for(int j = 1;j<=i;j++){
                   System.out.print("* ");
               }
            // spaces   
               for(int j = 0;j<inis;j++){
                   System.out.print("  ");
               }
            // stars  
               for(int j = 1;j<=i;j++){
                   System.out.print("* ");
               }
               inis -= 2;
               System.out.println();
           }
                       }
          //output
        /*
        * * * * * * * * * * 
        * * * *     * * * * 
        * * *         * * * 
        * *             * * 
        *                 * 
        *                 * 
        * *             * * 
        * * *         * * * 
        * * * *     * * * * 
        * * * * * * * * * * 
        */
        //pattern20
        static void Pattern20(int n){
            int spaces = 2*n -2 ;
            for(int i = 1;i<=2*n - 1;i++){ //row
                int stars = i;
                if(i>n){
                    stars = 2*n - i;
                }
                // stars
                for(int j = 1;j<=stars;j++){
                    System.out.print("* ");
                }
                // spaces
                for(int j = 1;j<=spaces;j++){
                    System.out.print("  ");
                }
                // stars
                for(int j = 1;j<=stars;j++){
                    System.out.print("* ");
                }
                System.out.println();
                if(i<n) {
                    spaces -=  2;
                }
                else {
                    spaces += 2;
                }
            }
        }
        /* 
         output:
         *                 * 
         * *             * * 
         * * *         * * * 
         * * * *     * * * * 
         * * * * * * * * * * 
         * * * *     * * * * 
         * * *         * * * 
         * *             * * 
         *                 * 

        */
        //pattern 21
        static void Pattern21(int n){
            // outer loop
            for(int i = 0;i<n;i++){
                // inner loop
                for(int j = 0;j<n;j++)
                {
                    if(i == 0 || i == n-1 || j == 0 || j == n-1){

                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        output:
        /*
        *****
        *   *
        *   *
        *   *
        *****
        
        public static void main(String[] args) 
        {
                    int n = 5;
                // here you can change the pattern number by calling here and print it.
                    Pattern20(n);
        }
        
        
}
