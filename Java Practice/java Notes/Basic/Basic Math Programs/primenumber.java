public class Solution {
	public static String isPrime(int num) {
		//Your code goes here
		int count  = 0;
		for(int i=1;i*i<=num;i++){
			if(num%i==0){
				count++;
				if((num/i)!=i){
					count++;
				}
			}
		}
		if(count == 2){
			return "YES";
		}
		else{
			return "NO";
		}
	}
}
