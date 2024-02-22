public class reversenumber{
    public static void main(String args[]){
        int n = 7789;
        int rev = 0; //reverse number
        int lastdigit;
        while(n>0){
            lastdigit = n % 10;
            n = n/10;
            rev = (rev * 10) + lastdigit;
        }
        System.out.println(rev);
    }
}
