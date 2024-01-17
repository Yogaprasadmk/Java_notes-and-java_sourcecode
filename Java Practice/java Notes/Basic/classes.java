// class name "classes"
public class classes {
    String name;
    int age;
    
    // methods
    public void display(){                            // method name = "display"
        System.out.println("Hello "+ name);           //String name "Yogaprasad"
        System.out.println("Age: "+ age);             //age 20
    }

    // main function
    public static void main(String[] args) {
                                                       // object name => app
        classes app = new classes();                  //classes --> access modifier  
        app.name = "Yogaprasad";
        app.age = 20;
        app.display();
    }
}
/*
 * there are two method in class
 * 1.variables 
 * 2 functions
 */
