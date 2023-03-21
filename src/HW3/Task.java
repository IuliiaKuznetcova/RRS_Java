package HW3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        System.out.println("______________Task1_________________");
         /*  Необходимо создать две целочисленные переменные (a, b),
  присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
    a == b - если переменные равны
    a < b - если переменная a меньше b
    a > b - если переменная b меньше a*/

        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of the number a ");
        int a = scan.nextInt();
        System.out.print("Enter the value of the number b ");
        int b = scan.nextInt();

        String print = ("a = " + a + ", b = " + b);
        System.out.println(print);
        if (a < b) {
            System.out.println("=> a < b");
        } else if (a > b) {
            System.out.println("=> a > b");
        } else {
            System.out.println("=> a = b");
        }

        System.out.println();
        System.out.println("______________Task2_________________");
      /*  Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная*/
        System.out.println();
        System.out.println(print);
        if ((a + b)%2==0) {
            System.out.println("maybe a and b are even");
        }else {
            System.out.println("some variable is odd");
        }
        System.out.println();
        System.out.println("______________Task3_________________");
      /*Необходимо создать целочисленную переменную,
      присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
больше 10 - если переменная больше 10
меньше 100 - если переменная меньше 100
результат деления на 2 больше 20 - если это соответствует истине
значение переменной между 5 и 40 включительно - если это правда
значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
*/
        System.out.println();
        System.out.print("Enter the value of the number c ");
        int c = scan.nextInt();
        if (c > 10) {
            System.out.println(c + " >10");
        }if (c<100){
            System.out.println(c + " <100");
        } if (c/2 > 20){
            System.out.println(c + "/2 > 20");
        }if (c >= 5 && c <= 40) {
            System.out.println(c + ">=5 and <=40");
        }if (c < 5 || c > 40){
            System.out.println(c + "<5 or >40");
        }
    }


}
