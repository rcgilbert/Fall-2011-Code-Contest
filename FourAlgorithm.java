/**
 * @author Ryan Gilbert
 * @email rcgilber@calpoly.edu 
 **/
public class FourAlgorithm {
	private static String[] numberStrings = new String[99];
	public static void main(String[] args) {
		generateNumberStrings();
		int currentNum = Integer.parseInt(args[0]);
		int currentIndex = currentNum - 1;
		System.out.print(currentNum);
		while(currentIndex != 3){
			System.out.print(" -> ");
			currentNum = numberStrings[currentIndex].length();
			currentIndex = currentNum -1;
			System.out.print(currentNum);
		}
		System.out.println(" -> " + currentNum);
	}
	private static void generateNumberStrings() {
		numberStrings[0] = "one";
		numberStrings[1] = "two";
		numberStrings[2] = "three";
		numberStrings[3] = "four";
		numberStrings[4] = "five";
		numberStrings[5] = "six";
		numberStrings[6] = "seven";
		numberStrings[7] = "eight";
		numberStrings[8] = "nine";
		numberStrings[9] = "ten";
		numberStrings[10] = "eleven";
		numberStrings[11] = "twelve";
		numberStrings[12] = "thirteen";
		numberStrings[13] = "fourteen";
		numberStrings[14] = "fifteen";
		numberStrings[15] = "sixteen";
		numberStrings[16] = "seventeen";
		numberStrings[17] = "eightteen";
		numberStrings[18] = "nineteen";
		numberStrings[19] = "twenty";
		numberStrings[29] = "thirty";
		numberStrings[39] = "fourty";
		numberStrings[49] = "fifty";
		numberStrings[59] = "sixty";
		numberStrings[69] = "seventy";
		numberStrings[79] = "eighty";
		numberStrings[89] = "ninety";
		int ones = 0;
		int tens = 19;
		for(int ndx = 20; ndx < 99; ndx++) {
				numberStrings[ndx] = numberStrings[tens] + numberStrings[ones];
				ones++;
				if(ones >= 9) {
					ones = 0;
					tens += 10;
					ndx++;
				}
		}
	}
}
