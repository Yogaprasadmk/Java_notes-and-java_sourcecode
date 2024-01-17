// class name = "objects"
public class objects{
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
        objects appl = new objects();          //object nane appl
        appl.name = "Yogaprasad";              //string name
        appl.age  = 20;                        //int age
        appl.obj();                            //fuction

        // here we also can declare another object with same syntax 

        // once condition we need to change object name

        objects appy = new objects();
        appy.name = "prasad";              //string name
        appy.age  = 20;                        //int age
        appy.obj();                            //fuction

        // function with parametersa passed class
        objects parra = new objects();
        //parameters to be in class syntax: classname functionname(parameter 1,parameter 2)
        parra.para("yoga", 20);
        parra.obj();  

    }
} 
// output
/* 
 *  name:Yogaprasad
    age:20     
    name:prasad
    age:20     
    name:yoga  
    age:20 
 */