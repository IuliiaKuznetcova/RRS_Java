package HW6;


public class Tasks {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("_________________1_________________");
        /*Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.*/
        System.out.println();

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println("The sum of all array values is " + sum);


        System.out.println();
        System.out.println("_________________2_________________");
        /* Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.*/
        System.out.println();

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (max < array2[i]) {
                max = array2[i];
            }
        }
        System.out.println("The maximum value in the array is " + max);


        System.out.println();
        System.out.println("_________________3_________________");
        /* Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.*/
        System.out.println();

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = array3[0];
        for (int i = 1; i < array2.length; i++) {
            if (min > array3[i]) {
                min = array3[i];
            }
        }
        System.out.println("The minimum value in the array is " + min);


        System.out.println();
        System.out.println("_________________4_________________");
        /* Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива*/
        System.out.println();

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum4 = 0;
        int avg;
        for (int quantity : array4)
            sum4 += quantity;
        avg = sum4 / array4.length;
        //System.out.println(sum4);
        //System.out.println(array4.length);
        System.out.println("The arithmetic mean of all array values is " + avg);


        System.out.println();
        System.out.println("_________________5_________________");
        /* Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.*/
        System.out.println();

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum5 = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sum5 += array5[i][j];
            }
        }
        System.out.println("The sum of all elements of a two-dimensional array " + sum5);

        System.out.println();
        System.out.println("_________________6_________________");
        /* Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива */
        System.out.println();

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

     /*   int max6;
        for (int i = 1; i < array6[0].length; i++) {
           max6 = array6[0][i];
            for (int j = 0; j <array6.length ; j++) {
                if (max6<array6[j][i]) max6 = array6[j][i];
            }
            System.out.println("The maximum value in the array is " + max6); // 7?
            }*/

        int max6 = Integer.MIN_VALUE;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (max6 < array6[i][j])
                    max6 = array6[i][j];
            }
        }
        System.out.println("The maximum value in the array is " + max6);


        System.out.println();
        System.out.println("_________________7_________________");
        /* Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести количество элементов в массиве */
        System.out.println();

        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                count++;
            }
        }
        System.out.println("Number of elements in the array " + count);

    }
}




