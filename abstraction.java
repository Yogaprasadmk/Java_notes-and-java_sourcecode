// class name
// abstraction - hiding the unneccessary details 

public class abstraction {
            String name;
            private int age;
    
            public void display(){
                System.out.println(
                    "name" + name
                );
                System.out.println(
                    "age" + age
                );
            }
    
            public void setvalues(String str,int num){
                 name = str;
                 age  = num;
            }
            // if you want to generate any datatype in private mention which datatype you are going to return in methods 
            public int getvalue(){
                return age;
            }
    }
    // main method
    class abst{
        public static void main(String[] args) {
            abstraction priv1 = new abstraction();
            priv1.setvalues("Nivash",22);
            priv1.display();
     
            int n = priv1.getvalue();
            System.out.println(n);     
        }
    }
