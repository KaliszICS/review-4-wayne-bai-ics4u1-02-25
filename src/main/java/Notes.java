
class Notes {
	public static void main(String[] args) {
		
		//Converting data types
		//typecasting - converting between primitive types

		int num;
		num = 4;
		//int -> double
		System.out.println((double)num);
		System.out.println(num); //num is not altered
		System.out.println(num + 0.0); //convert without typecasting

		//int -> char
		num = 85;
		System.out.println((char)num); //converts based on the characters ASCII value

		//int -> boolean
		// System.out.println((boolean)num); //not allowed
		
		double num2;
		num2 = 65.9;
		//double -> int
		System.out.println((int)num2); //converts to int and loses all data after the decimal point

		//double -> char
		System.out.println((char)num2); //uses ASCII as well, but uses the int version of the number

		//double -> boolean - can't convert to booleans


		char c;
		c = 'a';
		//char -> int
		System.out.println((int)c); //Also uses ASCII to get the integer value of 'a'

		//char -> double
		System.out.println((double)c); //same as above but with .0 at the end

		//char -> boolean - can't be done




		//parsing - converting from Strings to primitive types

		String word = "34534";
		//int
		System.out.println(word + 5); //concatenated
		System.out.println(Integer.parseInt(word) + 5); //added after conversion
		num = Integer.parseInt(word);

		word = "234.234";
		//double
		System.out.println(word + 5); //concatenated
		System.out.println(Double.parseDouble(word) + 5); //added after conversion
		num2 = Double.parseDouble(word);

		word = "true";
		//boolean
		System.out.println(Boolean.parseBoolean(word) && false);
	}
}
