/**
 * 
 * 
 * 
 */





import java.util.Scanner;
public class main {

	private static Scanner input;
	/**
	 * @author RokibAhmed
	 * @since 29:10:2018
	 * @version 1.0
	 * @param args unused
	 */
	public static void main(String[] args) {

		System.out.println("What operation do you want to execute : ");
		System.out.println("(1) add \n(2) subtract \n(3) multiply \n(4) division\n");
		System.out.println("Choose an Index number : ");
		input = new Scanner(System.in);
		
		int name = input.nextInt();
		if(name == 1) {
			add();			
		}else if(name == 2) {
			subtract();
		}else if(name == 3) {
			multiply();
		}else if(name == 4) {
			division();
		}
		
	}
	/**
	 * @author RokibAhmed
	 * @since 29:10:2018
	 * @version 1.0
	 * <p> add function </p>
	 */
	public static void add() {
		System.out.println("Please Enter any two number : ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(num1+num2);
	}
	/**
	 * @author RokibAhmed
	 * @since 29:10:2018
	 * @version 1.0
	 * <p> subtract function </p>
	 */
	public static void subtract() {
		System.out.println("Please Enter any two number : ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(num1-num2);
	}
	/**
	 * @author RokibAhmed
	 * @since 29:10:2018
	 * @version 1.0
	 * <p> multiply function </p>
	 */
	public static void multiply() {
		System.out.println("Please Enter any two number : ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(num1*num2);
	}
	/**
	 * @author RokibAhmed
	 * @since 29:10:2018
	 * @version 1.0
	 * <p> division function </p>
	 */
	public static void division(){
		System.out.println("Please Enter any two number : ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(num1/num2);
	}

}
