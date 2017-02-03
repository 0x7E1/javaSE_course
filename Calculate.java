public class Calculate {
	public static void main(String[] args) {
		System.out.println("Calculate...");
		int firstNum = Integer.valueOf(args[0]);
		int secondNum = Integer.valueOf(args[1]);
		int addition = firstNum + secondNum;
		int substraction = firstNum - secondNum;
		int multiplication = firstNum * secondNum;
		double division = (float)firstNum / (float)secondNum;
		double involution = Math.pow((float)firstNum, (float)secondNum);
		System.out.println("Addition = " + addition);
		System.out.println("Substraction = " + substraction);
		System.out.println("Multiplication = " + multiplication);
		System.out.println("Division = " + division);
		System.out.println("Involution = " + involution);
	}
}