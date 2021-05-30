import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  long num = inp.nextLong();
					  long power = inp.nextLong();
					  System.out.println(multiply(num,power));
	}
	public static long multiply(long num, long power){
		if (power<=1){
			return num;
		}
		long res = nummultiply(num,num);
		if (power%2!=0){
			return nummultiply(multiply(res,power/2),num);
		}else{
			return multiply(res,power/2);
		}
	}
	public static long nummultiply(long num1, long num2){
		return (num1*num2)%1000000007;
	}
}
