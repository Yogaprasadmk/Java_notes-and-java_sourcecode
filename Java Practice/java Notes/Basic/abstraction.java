//notes 1
// abstract class
abstract class Employee{
        private String name;
        int salary;
    
    // non abstract method
    //set
    void setname(){
        this.name = "abc";
    }
    //get
    String getName(){
        return name;
    }
    // abstract method
    abstract void cs();
    int gs(){
        return salary;
    }
}
class Fulltime extends Employee{
    void cs(){
        //here we need to set value
        salary = 3 * 1000;
    }
}
class Parttime extends Employee{
    void cs(){
        salary = 3 * 500;
    }
}
public class Main{
    // abstract method
    
    public static void main (String[] args) {
        /* code */
        Employee obj = new Fulltime();
        obj.setname();
        String ename = obj.getName();
        obj.cs();
        int esalary = obj.gs();
        System.out.println(ename);
        System.out.println(esalary);
    }
}

// notes 2
// abstract class
abstract class employee{
    abstract void display();
    // we can also declare mathid in abstract class
    void displa(){
        System.out.println("hello ");
    }
}
// derived class
class emp extends employee{
    void display(){
        System.out.println("Hello Wolrds");
    }
}
class Main{
    public static void main(String args[]){
        emp io = new emp();
        io.display();
        io.displa();
    }
}
