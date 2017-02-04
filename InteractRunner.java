import java.util.Scanner;

// Класс для запуска калькулятора

public class InteractRunner {
	
	public static void main(String[] args) {
		
		// Создаем поток на считывание введенных данных
		Scanner reader = new Scanner(System.in);

		try {
			// Создаем объект класса Calculator
			Calculator calc = new Calculator();

			String exit = "n";

			while (!exit.equals("y")) {
				System.out.print("Enter first arg: ");
				String firstNum = reader.next();
				System.out.print("Enter second arg: ");
				String secondNum = reader.next();

				// Вызываем метод сложения нашего объекта calc
				calc.add(Integer.valueOf(firstNum), Integer.valueOf(secondNum));

				// Выводим результат на экран
				System.out.println("Result: " + calc.getResult());

				// Очищаем @result
				calc.clearResult();

				System.out.print("Do you want to exit? (y/n): ");
				exit = reader.next();
			}

		} finally {
			reader.close();
		}
	}
}