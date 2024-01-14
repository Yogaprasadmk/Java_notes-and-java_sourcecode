public class recursion {
    // main class
    public static void main(String[] args) {
        sonn(10);
    }
    
    // methods

    // sum of natural numbers-sonn
    public static void sonn(int n){
        // base case
        if(n == 1){
            System.out.println(n);
        }
        // recursive case
        else{
            System.out.println(n);
            // the function is calling itself
            sonn(n - 1);
        }
    }
}

// the output of code:
/*
 * 10
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 */