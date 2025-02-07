import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input an integer: ");
		System.out.println(Integer.parseInt("5" + recv.nextLine()) + 5);
	}

	public static void q2() {
		//Write question 2 code here
		
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a number: ");

		System.out.println(Double.parseDouble("4" + recv.nextLine() + "3") + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		System.out.println(!Boolean.parseBoolean(recv.nextLine()));
	}	

	public static void q4() {
		//Write question 4 code here
	
		Scanner recv = new Scanner(System.in);
		System.out.print("Input an integer: ");	
		System.out.println((char)((int)Integer.parseInt(recv.nextLine() + "3") + 2));
	}

	public static void q5() {
		//Write question 5 code here
		
		Scanner recv = new Scanner(System.in);
		System.out.print("Input an integer: ");
		System.out.println((double)(Integer.parseInt(recv.nextLine() + "1")/2));
	}

	public static void q6() {
		//Write question 6 code here
		
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a number: ");
		System.out.println((int)Double.parseDouble("1" + recv.nextLine()));
	}

}

/*# Instructions  

  ## Questions
  1. Ask the user to "Input an integer: ".  Store it as a string.  Put the number 5 in front of it.  Convert it to an integer.  Add 5 to it.  Output it.</br>
  2. Ask the user to "Input a number: ".  Store it as a string.  Put the number 4 in front of it and 3 after it.  Convert it to a double.  Add 3.4 to it.  Output it.  </br>
  3. Ask the user to "Input a boolean: ".  Store it as a string.  Convert it to a boolean.  Swap its value. Output it.</br>
  4. Ask the user to "Input an integer: ".  Store it as a string.  Put the number 3 after it.  Convert it to an integer.  Add 2 to it.  Convert it to a char.  Output it.</br>
  5. Ask the user to "Input an integer: ".  Store it as a string.  Put the number 1 after it.  Convert it to an integer.  Divide it by 2.  Convert it to a double.  Output it.</br>
  6. Ask the user to "Input a number: ". Store it as a string. Put the number 1 in front of it.  Convert it to a double.  Convert it to an integer. Output it.</br>
*/