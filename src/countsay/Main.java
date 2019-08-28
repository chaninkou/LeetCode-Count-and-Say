package countsay;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("Input: " + n);
		
		CountAndSayFunction solution = new CountAndSayFunction();
		
		System.out.println("Solution: " + solution.countAndSay(n));
	}
}
