// parent class / superclass
class parent{
    int a;
    void displayP(){
    System.out.println("Hello World");
    }
}
// children class / sub class
class children extends parent{ //use extends keyword to inherit character(variables) from parent class  
    int b;
    void displayC(){
    System.out.println("Hello Computer");
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
        System.out.println(C.a);
        C.displayP();
        
    }
}
