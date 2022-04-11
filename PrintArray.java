package Generic;

public class PrintArray {

	public static <E> void toPrint(E[ ] inputArray) {
		for(E element : inputArray) {
		System.out.printf("%s", element);
		}
		System.out.println();
		}
		public static void main(String[] args) {
		Integer[] intArray = { 10 , 20 , 30 , 40 , 50 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'A', 'S', 'H', 'U' };
		PrintArray.toPrint(intArray);
		PrintArray.toPrint (doubleArray);
		PrintArray.toPrint(charArray);
		}
		}

