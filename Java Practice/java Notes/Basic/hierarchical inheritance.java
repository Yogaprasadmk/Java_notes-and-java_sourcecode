// parent class
class parent{
    void displayP(){
        System.out.println("Parent");
    }
}
//chidren1 Class
class C1 extends parent{
    void displayc1(){
        System.out.println("Children1");
    }
}
// children2 class
class C2 extends parent{
    void displayc2(){
        System.out.println("Children2");
    }
}
class Main{
    public static void main(String args[]){ 
    C2 C = new C2();
    C.displayc2();
    
    }
    
}

/* output
  Children2
*/
