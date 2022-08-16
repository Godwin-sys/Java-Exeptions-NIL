// Java program to demonstrate working of try,
// catch and finally

class Division {
	public static void main(String[] args)
	{
		int a = 10, b = 5, c = 5, result;
        //try block contains a set of statements where an exception can occur
		try {
			result = a / (b - c);
			System.out.println("result" + result);
		}
        //catch is used to handle the uncertain condition of a try block

		catch (ArithmeticException e) {
			System.out.println("Exception caught:Division by zero");
		}

		finally {
			System.out.println("I am in final block");
            //finally: It is executed after the catch block.
		}
	}
}
