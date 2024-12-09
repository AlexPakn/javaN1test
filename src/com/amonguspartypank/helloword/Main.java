package com.amonguspartypank.helloword;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void task1()
    {
        System.out.println("task 1");
        System.out.println("Your time is limited,");
        System.out.println("\t\tso don’t waste it");
        System.out.println("\t\t\tliving someone else’s life");
        System.out.println("\t\tSteve Jobs");
    }
    public static void task2()
    {
        //https://www.w3schools.com/java/java_user_input.asp
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("task 2");
        System.out.println("Enter number and %");

        float first = myObj.nextFloat();  // Read user input
        float second = myObj.nextFloat();
        System.out.println((first/100*second));
    }
    public static void task3()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("task 3");
        System.out.println("Enter 3 numbers");
        float first = myObj.nextFloat();  // Read user input
        float second = myObj.nextFloat();
        float third = myObj.nextFloat();
        System.out.println((first*100+second*10+third));
    }
    public static void task4()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("task 4");
        System.out.println("Enter 6 digits number");
        int first = myObj.nextInt();  // Read user input
        int[] myArray = new int[6];
        for (int i=0;i<6;++i)
        {
            myArray[i]=first%10;
            first/=10;
        }
        first=myArray[0]*100000;
        first+=myArray[1]*10000;
        first+=myArray[3]*1000;
        first+=myArray[2]*100;
        first+=myArray[4]*10;
        first+=myArray[5];
        System.out.println(first);
    }
    public static void task5()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("task 5");
        System.out.println("Enter 1 number");
        int month = myObj.nextInt(); // Читаємо введене значення
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        }
    }
    public static void task6()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("task 6");
        System.out.print("Enter the number of meters: ");
        double meters = myObj.nextDouble();
        System.out.println("Choose a conversion option:");
        System.out.println("1 - miles");
        System.out.println("2 - inches");
        System.out.println("3 - yards");
        int choice = myObj.nextInt();
        if (choice == 1) {
            double miles = meters / 1609.344; // 1 mile = 1609.344 meters
            System.out.println(miles);
        } else if (choice == 2) {
            double inches = meters * 39.3701; // 1 meter = 39.3701 inches
            System.out.println(inches);
        } else if (choice == 3) {
            double yards = meters * 1.09361; // 1 meter = 1.09361 yards
            System.out.println(yards);
        }
    }
    public static void task7()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("task 7");
        System.out.print("Enter left and right boards: ");
        int first = myObj.nextInt();  // Read user input
        int second = myObj.nextInt();  // Read user input
        if(first>second) {
            int tmp=first;
            first=second;
            second=tmp;
        }
        for(int i=first;i<=second;++i) {
            if(i%2==0)  {
                System.out.print(i+", ");
            }
        }
    }
    public static void task8()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("task 8");
        System.out.print("Enter left and right boards: ");
        int first = myObj.nextInt();
        int second = myObj.nextInt();
        for (int i = first; i <= second; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }
    }
    public static void task9()
    {
        System.out.println("task 9");
        int[] myArray = new int[10];
        Random rn = new Random();
        for (int i=0;i<10;++i) {
            myArray[i] = rn.nextInt(-50,50);
        }
        int min = myArray[0];
        int max = myArray[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            int num = myArray[i];
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Generated array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Number of negative values: " + negativeCount);
        System.out.println("Number of positive values: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);
    }

    public static void task10 () {
        System.out.println("Task 10");
        int[] originalArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(-50,50);
        }
        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        int evenCount = 0, oddCount = 0, negativeCount = 0, positiveCount = 0;
        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int[] negativeArray = new int[negativeCount];
        int[] positiveArray = new int[positiveCount];
        int evenIndex = 0, oddIndex = 0, negativeIndex = 0, positiveIndex = 0;
        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }

            if (num < 0) {
                negativeArray[negativeIndex++] = num;
            } else if (num > 0) {
                positiveArray[positiveIndex++] = num;
            }
        }
        System.out.println("Even numbers:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Negative numbers:");
        for (int num : negativeArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Positive numbers:");
        for (int num : positiveArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void task11(int length, String direction, char symbol) {
        if (direction.equals("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol + "\t");
            }
            System.out.println();
        } else if (direction.equals("vertical")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        }
    }
    public static void task12(int[] array, String order) {
        if (order.equals("ascending")) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        } else if (order.equals("descending")) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        System.out.print("Sorted array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            //task1();
            //task2();
            //task3();
            //task4();
            //task5();
            //task6();
            //task7();
            //task8();
            //task9();
            //task10();
//            System.out.println("Horizontal line:");
//            task11(5, "horizontal", '*');
//            System.out.println("Vertical line:");
//            task11(5, "vertical", '#');

            int[] testArray = {5, 2, 8, 3, 1, 4};
            System.out.println("Sorting in ascending order:");
            task12(testArray, "ascending");
            System.out.println("Sorting in descending order:");
            task12(testArray, "descending");
            /*for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }*/
    }
}