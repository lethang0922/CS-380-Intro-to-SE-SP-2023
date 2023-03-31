package pachagetest;

public class CS380_lab0 {
		public static void main ( String[] args) {
			System.out.println("First Lab CS 380");
			int a=reverse(123);
			System.out.println(a);
		}
		public static int reverse(int n) {
			int reverse = 0;
		 
		      while( n != 0 )
		      {
		          reverse = reverse * 10;
		          reverse = reverse + n%10;
		          n = n/10;
		      }
		      return reverse;
		}
}
