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
                    
                }
            }
        }
         public static void main(String[] args) 
         {          
             int n = 5;
             pattern2(n);

        }
}