package package1;

public class OddEvenNumber {

	void printEvenOrOdd(int number) {
		if(number % 2 == 0)
			System.out.println(number +" Number is Even");
		else
			System.out.println(number +" Number is Odd");
	}
	
	public static void main(String args[]) {
		new OddEvenNumber().printEvenOrOdd(20);
	}
}
