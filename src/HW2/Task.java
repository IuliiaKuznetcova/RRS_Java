package HW2;

public class Task {

    public static void main(String[] args) {
        System.out.println("_________1___________");
        int a = 15;
        int b = 4;

        int sum = a + b;
        int dif1 = a - b;
        int dif2 = b - a;
        int product = a * b;
        int quotient1 = a / b;
        int quotient2 = b / a;
        String lt = " \n";

        System.out.println(sum + lt + dif1 + lt + dif2 + lt + product + lt + quotient1 + lt + quotient2);

        System.out.println();
        System.out.println("_________________1.1____________________");
        System.out.println();

        System.out.println(a / 4.0);
        System.out.println(b / 15.0);

        System.out.println();
        System.out.println("_________________2____________________");
        System.out.println();


        System.out.println();

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println(a + " and " + b + " are odd numbers");
        }
        if (a % 2 == 0 && b % 2 != 0) {
            System.out.println(a + " is even number and " + b + " is odd number");
        }
        if (a % 2 != 0 && b % 2 == 0) {
            System.out.println(a + " is odd number and " + b + " even number");
       /* }  if (a % 2 == 0 && b % 2 == 0) {
            System.out.println(a + " and " + b + " are even numbers");*/
        } else {
            System.out.println(a + " and " + b + " are even numbers");
        }

        System.out.println();
        System.out.println("_________________3____________________");
        System.out.println();

        System.out.println("\uD83D\uDC7D");
    }
}
