import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      Scanner inp = new Scanner(System.in);
                      long n = inp.nextLong();
                      long x = (long)Math.sqrt(n);
                      int sum = 0;
                      for (int i=2;i<=x;i++){
                          if (n%i==0){
                              sum++;
                              break;
                          }
                      }
                      if (sum==0){
                          System.out.println("YES");
                      }else{
                          System.out.println("NO");
                      }
	}
}
