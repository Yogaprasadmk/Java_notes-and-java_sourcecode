// increment and decrement operator questions practice 
/* website: https://javaconceptoftheday.com/quiz-on-increment-and-decrement-operators */
1) What will be the output of the following program?

1)output of the program
public class IncrementDecrementQuiz 
{
    public static void main(String[] args) 
    {
        int i = 11;
         
        i = i++ + ++i; // 11 + 13
         
        System.out.println(i);
    }
}
// output: 24;

2)output of the program
public class IncrementDecrementQuiz 
{
    public static void main(String[] args) 
    {
        int a=11, b=22, c;
         
        c = a + b + a++ + b++ + ++a + ++b;
         
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
//output:
//a= 11
//b= 22
//c= 103

3) What will be the output of the below program?
public class IncrementDecrementQuiz 
{
    public static void main(String[] args) 
    {
        int i=0;
         
        i = i++ - --i + ++i - i--;
         
        System.out.println(i);
         
    }
}
output: 0

4)
public class IncrementDecrementQuiz 
{
    public static void main(String[] args) 
    {
        boolean b = true;
         
        b++;
         
        System.out.println(b);
    }
}
output; boolean value can't be applied increment and decrement operator.
reason:
--> The increment (++) and decrement (--) operators are used to increment or decrement the value of a variable by 1. 
--> Boolean variables can only store two values: true or false. 
--> Incrementing or decrementing a boolean variable does not make sense because it would not change the value of the variable.

