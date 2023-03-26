package HW4;

/*Задача №1
Необходимо вывести числа от 0 до 15.
Задача №2
Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
Задача №3
Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
без использования конструкции if (шаг цикла на ваше усмотрение).*/



public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("______________Task1______________________");
        System.out.println();
        for (int i = 0; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("______________Task2______________________");
        System.out.println();
        for (int i = 5; i < 10000; i = i * 5) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("______________Task3.1______________________");
        System.out.println();

        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
                          }
        }


        System.out.println();
        System.out.println("______________Task3.2______________________");
        System.out.println();

        for (int i = 40; (i <= 60) && (i % 4 == 0); i++) {
            System.out.print(i + " ");
            }

        System.out.println();

        for (int i = 40; i <= 60; i=i+4) {
            System.out.print(i + " ");
        }
        }
    }

