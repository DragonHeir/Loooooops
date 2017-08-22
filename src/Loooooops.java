import java.util.ArrayList;
import java.util.Stack;

public class Loooooops {
	public static void main(String[] args) {
		//Complete the exercises.
		
		//1. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 1 (inclusive).
//		for (int x = 5; x > 0; x--)
//        {
//            System.out.println(x);
//        }
        
//        2. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 1 to 10 (inclusive).
//		int x = 1;
//        while (x <= 10){
//        	System.out.println(x);
//        	x += 1;
//        }
        
//        3. Rewrite the following code so that it uses a for loop instead of a while loop to print out all the integers from 5 to 15 (inclusive).
//        for (int x = 5; x <= 15; x++){
//        	System.out.println(x);
//        }
        
//        4. Rewrite the following code to use a while loop instead of a for loop to print out the numbers from 10 to 100 by 10’s (inclusive).
//        int x = 10;
//        while (x <= 100){
//        	System.out.println(x);
//        	x = x+10;
//        }
        
//        5. The following code should print the values from 1 to 10 (inclusive) but has errors. 
//           Fix the errors so that the code works as intended. 
//        int x = 1;
//        while (x <= 10)
//        {
//            System.out.println(x);
//            x += 1;
//        }
        
//        6. The following code should print the values from 10 to 5, but it has errors. Fix the errors so that the code works as intended.
//        for (int x = 10; x >= 5; x--)
//        {
//           System.out.println(x);
//        }
        
//        7. The following code should print the values from 10 to 1, but it has errors. Fix the errors so that the code works as intended.
//        int x = 10;
//        while (x > 0)
//        {
//           System.out.println(x);
//           x--;
//        }
        
        //8. Write code to print a countdown from 100 to 0 by 10’s.
//		for (int x = 100; x >= 0; x -= 10){
//			System.out.println(x);
//		}
        
        //9. Finish the wordIterate method so that it prints the String parameter minus 
//		wordIterate("supercalifradulisticexpialidocious");
        //   the last character each time through the loop until there are no more characters in the string.
        //   bacon
        //   baco
        //   bac
        //   ba
        //   b
		
        
        //10. Finish the xevenxodd method so that it prints all numbers from x to 0 and also prints 'even' or 'odd' next to the appropriate numner
        //    5 odd
        //    4 even
        //    3 odd
        //    2 even
        //    1 odd
        //    0
        //    assume x > 0 and 0 is neither even or odd
//		xevenxodd(17);
        
        //11. Finish the xTimes10 method so that it prints x * 10 from 0 to x.
        //    example: 
        //    0
        //    10
        //    20
        //    30
        //    40
        //    assume x > 0
//		xTimes10(11);
        
        //12. Finish the removeXs method so that it removes all x's from strings.
        //    System.out.println(s);
        //    stuff
//		String s = removeXs("XsxxxtXxXuXxxXXXXfXXXXxxXfXXxxX");
//		System.out.println(s);
        
        //13. Finish the superDecrement method so that it prints x to zero x number of times.
        //    666666 55555 4444 333 22 1
//		superDecrement(6);
        
        //14. Finish the starBox method so it prints a box of *'s the size of the specified dimensions
        //    ***
        //    ***
        //    ***
        //    ***
        //    ***
//		starBox(6, 3);
		
        //15. Finish the count vowels method so it returns the number of vowels in a String
            int v = countVowels("I am pretending to know what I am doing");
            System.out.println(v);
        //    7
	}
	
	


//	public static void wordIterate(String word){
//		System.out.println(word);
//		for (int i = word.length()-1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(word.charAt(j));
//			}
//			System.out.println("");
//		}
//	}
	
//	public static void xevenxodd(int x){
//		for (int i = x; i > 0; i--) {
//			if (i % 2 == 1){
//				System.out.println(i + " odd");
//			}
//			else {
//				System.out.println(i + " even");
//			}
//		}
//	}
	
//	public static void xTimes10(int x){
//		for (int i = 0; i <= x; i++) {
//			System.out.println(i*10);
//		}
//	}
	
//	public static String removeXs(String wrd){
//		String Word = "";
//		for (int i = 0; i < wrd.length(); i++) {
//			if (wrd.charAt(i)!='X'){
//				if (wrd.charAt(i)!='x'){
//					Word += wrd.charAt(i);
//				}
//			}
//		}
//		return Word;
//		
//	}
	
//	public static void superDecrement(int x){
//		for (int i = x; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(i);
//			}
//			System.out.print(" ");
//		}
//	}
	
//	public static void starBox(int w, int h){
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j < w; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
	
	private static int countVowels(String string) {
		int vowels = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i)=='a'||string.charAt(i)=='A'||string.charAt(i)=='e'||string.charAt(i)=='E'||string.charAt(i)=='i'||string.charAt(i)=='I'||string.charAt(i)=='o'||string.charAt(i)=='O'||string.charAt(i)=='u'||string.charAt(i)=='U'){
				vowels += 1;
			}
		}
		return vowels;
	}
}
