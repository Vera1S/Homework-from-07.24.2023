package Homework;

import java.util.Random;

public class MainMath {
    public static void main(String[] args) {

         Calculator calculator = new Calculator();
         Random num1 = new Random();
         Random num2 = new Random();

        int numPosbl1 = num1.nextInt(1, 50);
        int numPosbl2 = num2.nextInt(1, 50);

        // Это метод пользовательский, через метод Rondom.
        System.out.println("Числа, используемые для расчетов: " + calculator.add(numPosbl1, numPosbl2));
        System.out.println("Числа, используемые для расчетов: " + calculator.subtract(numPosbl1, numPosbl2));
        System.out.println("Числа, используемые для расчетов: " + calculator.multiply(numPosbl1, numPosbl2));
        System.out.println("Числа, используемые для расчетов: " + calculator.divide(numPosbl1, numPosbl2));

//      Это метод предопределенный.

        int resaltAdd = calculator.add(calculator.a, calculator.b);
        int resultSub = calculator.subtract(calculator.a, calculator.b);
        int resultMult = calculator.multiply(calculator.a, calculator.b);
        int resultDiv = calculator.divide(calculator.a, calculator.b);

        System.out.println("Сложение: " + resaltAdd);
        System.out.println("Вычетание: " + resultSub);
        System.out.println("Умножение: " + resultMult);
        System.out.println("Деление: " + resultDiv);


    }



}
