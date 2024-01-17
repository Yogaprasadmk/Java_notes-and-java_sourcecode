// iheritance  is the clas  name
// inheritance - parent traits can be transferred to childrens.

public class inheritance{
    int legs = 4;
    public static void walk(){
        System.out.println("it will walk");
    }
    public static void eat(){
        System.out.println("it will eat");
    }
}
class cat extends inheritance{
    boolean mew = true;
}

class inhe{
    public static void main(String[] args) {
        cat obj1 = new cat();
        System.out.println(obj1.mew);
        obj1.walk();
        obj1.eat();
    }
}