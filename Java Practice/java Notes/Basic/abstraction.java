// abstract
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
