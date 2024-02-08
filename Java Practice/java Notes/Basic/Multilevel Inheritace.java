/* Multilevel Inheritance */

// grandparent class / superclass
class grandparent{
    int a;
    void displayGP(){
    System.out.println("Grand Parent");
    }
}
// parent class / sub class
class parent extends grandparent{ //use extends keyword to inherit character(variables) from parent class  
    int b;
    void displayP(){
    System.out.println("Parent");
    }
}
// children class / sub class
class children extends parent{
    int c; 
    void displayC(){
        System.out.println("Children");
    }
}
class Main{
    public static void main(String args[]){
        //parent object
        // parent P = new parent();
        //children object
        children C = new children();
        C.a = 6;
        C.b = 4;
        C.c = 5;
        System.out.println(C.c);
        C.displayC();
        
    }
}
