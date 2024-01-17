
// class polymorphism
// polymorphism ==> poly means "many"   morphism means "forms"
// polymorphism means one method has many forms
public class polymorphism {
    public static void main(String[] args) {
        method obj = new method();
        obj.display();
        obj.display(5);
    }
}
class method{
    void display(){
        System.out.println("Hello");
    }
    void display(int a){
        System.out.println(a);
    }
}

// output
/*
  hello
  5
 */
