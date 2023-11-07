import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		String[] arr = word.split("");
		
		String[] a = new String[arr.length/2];
		String[] b = new String[arr.length/2];
		
		
			for (int i = 0; i < arr.length / 2; i++) {
				a[i] = arr[i];
				b[i] = arr[arr.length-1-i];
			}
			
			boolean isPalindrome = true;

	        for (int i = 0; i < a.length; i++) {
	            if (!a[i].equals(b[i])) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        if (isPalindrome) {
	            System.out.println("1");
	        } else {
	            System.out.println("0");
	        }
			
			
	}
}