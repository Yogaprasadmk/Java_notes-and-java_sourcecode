/*
 * Access modifiers is defined as in a class we variables,functions, which it can be get accessed or which it can't be get accessed is 
    called 'Access Modifiers';
    
    There are four things in accessmodifiers
    1.public
    2.private
    3.protected
    4.Default
*/

// public : It can be accessed from any package,any method from the main function
// public example
// class name = "objects"
public class accessmodifiers
{
    String name;   
    int age;

    // methods
    public void obj(){
        System.out.println("name:"+ name);
        System.out.println("age:" + age);
    }

    // methods with arguments passed
    public void para(String str,int num){
        name = str;
        age = num;
    }
}
// another object => main
class Main{
    public static void main(String[] args) {  //main function
        accessmodifiers appl = new accessmodifiers();          //object nane appl
        appl.name = "Yogaprasad";              //string name
        appl.age  = 20;                        //int age
        appl.obj();                            //fuction

        // here we also can declare another object with same syntax 

        // once condition we need to change object name

        accessmodifiers appy = new accessmodifiers();
        appy.name = "prasad";              //string name
        appy.age  = 20;                        //int age
        appy.obj();                            //fuction

        // function with parametersa passed class
        accessmodifiers parra = new accessmodifiers();
        //parameters to be in class syntax: classname functionname(parameter 1,parameter 2)
        parra.para("yoga", 20);
        parra.obj();  

    }
} 
// output for public
/* 
name:Yogaprasad
age:20
name:prasad
age:20     
name:yoga  
age:20
*/


// private : Private can be accessed with in the package only.
// The variables are in private it can accessed with the non-void function while return the private variables.
// example for private

public class accessmodifiers{
        private String name;
        int age;

        public void display(){
            System.out.println(
                "name" + name
            );
            System.out.println(
                "age" + age
            );
        }

        public void setvalues(String str,int num){
             name = str;
             age  = num;
        }
        // if you want to generate any datatype in private mention which datatype you are going to return in methods 
        public String getvalue(){
            return  name;
        }
}
// main method
class Main{
    public static void main(String[] args) {
        accessmodifiers priv1 = new accessmodifiers();
        priv1.setvalues("Nivash",22);
        priv1.display();

        accessmodifiers etc = new accessmodifiers();
        etc.setvalues("nitish", 21);
        etc.display(); 
        String s = etc.getvalue();
        System.out.println(s);         
    }
}
// output
/*
nameNivash
age22
namenitish
age21
nitish
*/

// protected
/* the protected can be worked in a single file only 
 *  The other class file,other packages public can be get accessed but protected cannot.
*/

// default:
/* the default modifier can be accessed in any class files but packages will be private*/