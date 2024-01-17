// constructor
/* constructor are of two types 
 * default
 * parameterized
 */

 // default (without parameters)
public class constructors {
    int age;
    int str;

    constructors(){
        System.out.println("Hello");
    }
}
class defaultcons{
    public static void main(String[] args) {       
        constructors con = new constructors(); //here constructors() is the constructor
        System.out.println(con.age);
        System.out.println(con.str);
    }
}
/*ouput */
/*  
Hello
0
0
*/

// comment the first and run it 
// with parameters
public class constructors{

    int age;
    String str;
    constructors(int age1,String str1){
        age = age1;
        str = str1; 
    }
}
class paracons{
    public static void main(String[] args) {
        constructors par = new constructors(45,"saravanan");
        System.out.println(par.age);
        System.out.println(par.str);
    }
}
//output
/*
 * 45
 * saravanan
 
*/