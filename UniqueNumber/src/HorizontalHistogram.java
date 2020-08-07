import java.util.Scanner;
import java.util.StringTokenizer;

public class HorizontalHistogram {
	
	
	static void Histogram(String str2) {
		
		for (int i =0; i < str2.length(); i++) {
			char x = (char) str2.length(); 
            if (x > 0) {
                // counts[i] stores how many students scored i on the test,
                // so print a star (counts[i]) times
                System.out.print(x + ": ");
                for (int j =0; j <str2.length(); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner (System.in);){
			System.out.println("enter the String:");
			
			String str2=sc.nextLine();
			Histogram(str2);
		}
}

	
}
