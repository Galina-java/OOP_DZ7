public class Main {
    public static void main(String[] args) {
        // Создаем числа
        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, 7);

        // Создаем калькулятор
        ComplexCalculator calculator = new ComplexCalculator();

        // Установка операций с логированием
        calculator.setOperation(new LoggingDecorator(new Addition()));
        System.out.println("Сложение: " + calculator.calculate(num1, num2));

        calculator.setOperation(new LoggingDecorator(new Multiplication()));
        System.out.println("Умножение: " + calculator.calculate(num1, num2));

        calculator.setOperation(new LoggingDecorator(new Division()));
        System.out.println("Деление: " + calculator.calculate(num1, num2));
    }
}