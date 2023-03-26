package HW5;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("______________Task1______________________");
        System.out.println();

        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("______________Task2______________________");
        System.out.println();

        /*for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("______________Task3______________________");
        System.out.println();

        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
