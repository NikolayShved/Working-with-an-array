package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ввод размерности массива
        int n;
        System.out.println("Enter number N (the number of numbers in the array):");
        Scanner num = new Scanner (System.in);
        n = num.nextInt();
        int N = n + 1;

        // Заполнение массива с помощью класса Scanner
        Scanner num2 = new Scanner (System.in);
        double [] myArray = new double [N];
        for (int i = 0; i < N ; i++) {
            System.out.print((i + 1) + ") ");
            myArray[i] = num2.nextDouble();
        } // 7

        // Максимальный элемент массива
        double max = myArray[0];
        // Сумма чётных элементов массива
        int sum = 0; // 8
        for (int i = 0; i < N; i++) {

            // Разложение элементов массива на целую и дробную части
            String[] doubleArray = String.valueOf(myArray[i]).split("[.]");
            int _int = Integer.parseInt(doubleArray[0]);
            int _frac = Integer.parseInt(doubleArray[1]);

            // Проверка дробной части вещественного элемента на чётность
            if (_frac % 2 == 1) {
                // Условие поиска максимального элемента
                if (myArray[i] > max) {
                    max = myArray[i];
                }
            }
            else if (_frac % 2 == 0)
            {
                // Счётчик количества чётных элементов
                sum++;
            }
        }

        // Вывод найденных переменных
        System.out.println("Maximum array element = " + max);
        System.out.println("Number of even numbers = " + sum);
    }
}

