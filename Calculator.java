// Класс реализует калькулятор
public class Calculator {

	// Результат вычисления
	private int result = 0;

	// Метод сложения двух чисел
	public void add(int ... params) {
		for (int param : params) {
			this.result += param;
		}
	}

	// Метод получения результата
	public int getResult() {
		return this.result;
	}

	// Очистить результат
	public void clearResult() {
		this.result = 0;
	}
}
