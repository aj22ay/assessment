package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int s1=0,s2=1,s3,n=10;
		System.out.println(s1 +" \n"+ s2);
		for(int i=1;i<=n;i++) {
		s3=s1+s2;
		s1=s2;
		s2=s3;
		System.out.println(s3);}
	}

}
