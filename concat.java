import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class concat {
	public static void main(String[] args){
		String s = "13 40 5 0";
		getNumbers(s);
	}
	
	public static void getNumbers(String s){
		String[] numbers = s.split(" ");
		ArrayList<String> numberList = new ArrayList<String>(Arrays.asList(numbers));
		Collections.sort(numberList, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length())
					return s2.compareTo(s1);
				int maxLength = Math.max(s1.length(), s2.length());
	            while(s1.length() < maxLength) s1 += s1;
	            while(s2.length() < maxLength) s2 += s2;
				return s2.compareTo(s1);
			}
		});
		System.out.print("Max value: ");
		printNumbers(numberList);
		
		Collections.reverse(numberList);
		System.out.print("\nMin value: ");
		printNumbers(numberList);
	}
	public static void printNumbers(ArrayList<String> num){
		for(String s : num){
			System.out.print(s);
		}
	}
}
