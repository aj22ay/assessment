package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13,s=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				s++;
			}}
		if(s==1)
			System.out.println(n+" is a prime number");
		else
		System.out.println(n +" not a prime number");
	}
}