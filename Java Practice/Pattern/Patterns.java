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

        
        public static void main(String[] args) 
        {
                    int n = 5;
                    Pattern13(n);
        }
        
        
}
