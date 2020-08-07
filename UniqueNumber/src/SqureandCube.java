
public class SqureandCube {
 static int squaresum(int n) {  
     return (n * (n + 1) * (2 * n + 1)) / 6;
	}
 static int sumOfcube(int n) {
	 int sum = 0; 
     for (int x=1; x<=n; x++) 
         sum += x*x*x; 
     return sum;
	}
	public static void main(String[] args) {
		
		int n = 5; 
        System.out.println(squaresum(n)); 
        System.out.println(sumOfcube(n));
	}

}
