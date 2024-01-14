// methods
public class method {
    public static void main(String[] args) {
        int d = mul(5,4);           // function call
        System.out.println(d);
        System.out.println("the output c is printed");
    }

    // without using paramaters
    public static void add(){
        int a = 10;    
        int b = 4;          
        int c = a + b;    //function definition
        System.out.println(c);
    }
    // with using pararmeters (void function method)
    public static void sub(int a,int b){
        int c = a - b;
        System.out.println(c);
    }
    // with using parameters (non void function method)
    public static int mul(int a,int b){
        int c = a * b;
        return c;
    }

}
