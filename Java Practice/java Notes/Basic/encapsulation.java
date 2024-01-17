// four pillars of oops 
/*
 1.encapsulation
 2.absraction
 3.inheritance
 4.polymorphism
 */
//encapsulation - A set of data(variables,functions,classes) can be combined and comes under into single class  is called encapsulation
// class name - encapsulation

public class encapsulation {
    int age;
    int str;
    
        encapsulation(){
            System.out.println("Hello");
        }
}
class encap {
        public static void main(String[] args) {       
            encapsulation con = new encapsulation(); //here constructors() is the constructor
            System.out.println(con.age);
            System.out.println(con.str);
        }
    
}


