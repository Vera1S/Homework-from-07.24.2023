package Homework;

public class Calculator {
//    Задание.

    // 1. Создать класс Calculator.
//2. В классе "Calculator" создать методы add, subtract, multiply, divide
// с двумя аргументами типа int в каждом. Методы должны складывать,
// вычитать, умножать, делить переданные в них числа.

//3. Каждый метод должен возвращать тип int.
//4. В классе main создать один объект типа Calculator.
//5. Сгенерировать набор случайных чисел через класс  Random , метод nextInt();
//6. "скормить" случайные числа в виде аргументов для методов add, substract,
// multiply, divide объекта Calculator.
//7. Результаты всех вычислений вывести на экран.
    public int a = 27;
    public int b = 2;

        // Метод.
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

}


