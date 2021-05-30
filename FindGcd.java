import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  long m = inp.nextLong();
					  long n = inp.nextLong();
					  while (m!=0 && n!=0){
						  if (m>n){
							  m = m%n;
						  }else{
							  n = n%m;
						  }
					  }
					  System.out.println(Math.max(m,n));
	}
}
