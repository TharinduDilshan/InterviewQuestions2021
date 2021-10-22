//Reverse the given Numeric Value

class ReverseNumber {

	public static int reverseNumber(int inputValue) {
		int revNum = 0;

		while (inputValue != 0) {
			int rev = inputValue % 10;
			revNum = (revNum * 10) + rev;
			inputValue = inputValue / 10;
		}
		return revNum;
	}

	public static void main(String[] args) {
		int reverseNumber = reverseNumber(10234);
		System.out.println("Reversed Number is:" + reverseNumber);
	}

}
