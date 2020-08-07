import java.util.HashMap;

public class CountString {
	 public static void main(String[] args) 
	    { 
		 
		 countNumber("Helloserhvice");
	    }
	 
	static void countNumber(String str)
	 {
		 char[] car=str.replace(" ", "").toLowerCase().toCharArray();
		 HashMap <Character, Integer> mapcount = new HashMap<>();
		 for(char cars:car)
		 {
			 if(mapcount.containsKey(cars)) {
				 //if paramater increse
				 mapcount.put(cars, mapcount.get(cars)+1);
				 
			 }else
			 {
				 mapcount.put(cars, 1);
			 }
			 
		 }
		// System.out.println(mapcount);
		 //print duplicate caracter
		 mapcount.forEach((k,v)->{
		 if(v>1) {
		 System.out.println("charater :"+k
				 +" no.of occurance:"+ v);}}
		 );
	 }	 

}