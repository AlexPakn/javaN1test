package com.amonguspartypank.helloword;

import static java.lang.System.*;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void task1() {
    out.println("task 1");
    out.println("Your time is limited,");
    out.println("\t\tso don’t waste it");
    out.println("\t\t\tliving someone else’s life");
    out.println("\t\tSteve Jobs");
  }

  public static void task2() {
    //https://www.w3schools.com/java/java_user_input.asp
    Scanner myObj = new Scanner(in);  // Create a Scanner object
    out.println("task 2");
    out.println("Enter number and %");

    float first = myObj.nextFloat();  // Read user input
    float second = myObj.nextFloat();
    out.println((first / 100 * second));
  }

  public static void task3() {
    Scanner myObj = new Scanner(in);
    out.println("task 3");
    out.println("Enter 3 numbers");
    float first = myObj.nextFloat();  // Read user input
    float second = myObj.nextFloat();
    float third = myObj.nextFloat();
    out.println((first * 100 + second * 10 + third));
  }

  public static void task4() {
    Scanner myObj = new Scanner(in);
    out.println("task 4");
    out.println("Enter 6 digits number");
    int first = myObj.nextInt();  // Read user input
    int[] myArray = new int[6];
    for (int i = 0; i < 6; ++i) {
      myArray[i] = first % 10;
      first /= 10;
    }
    first = myArray[0] * 100000;
    first += myArray[1] * 10000;
    first += myArray[3] * 1000;
    first += myArray[2] * 100;
    first += myArray[4] * 10;
    first += myArray[5];
    out.println(first);
  }

  public static void task5() {
    Scanner myObj = new Scanner(in);
    out.println("task 5");
    out.println("Enter 1 number");
    int month = myObj.nextInt(); // Читаємо введене значення
    if (month == 12 || month == 1 || month == 2) {
      out.println("Winter");
    } else if (month >= 3 && month <= 5) {
      out.println("Spring");
    } else if (month >= 6 && month <= 8) {
      out.println("Summer");
    } else if (month >= 9 && month <= 11) {
      out.println("Autumn");
    }
  }

  public static void task6() {
    Scanner myObj = new Scanner(in);
    out.println("task 6");
    out.print("Enter the number of meters: ");
    double meters = myObj.nextDouble();
    out.println("Choose a conversion option:");
    out.println("1 - miles");
    out.println("2 - inches");
    out.println("3 - yards");
    int choice = myObj.nextInt();
    if (choice == 1) {
      double miles = meters / 1609.344; // 1 mile = 1609.344 meters
      out.println(miles);
    } else if (choice == 2) {
      double inches = meters * 39.3701; // 1 meter = 39.3701 inches
      out.println(inches);
    } else if (choice == 3) {
      double yards = meters * 1.09361; // 1 meter = 1.09361 yards
      out.println(yards);
    }
  }

  public static void task7() {
    Scanner myObj = new Scanner(in);
    out.println("task 7");
    out.print("Enter left and right boards: ");
    int first = myObj.nextInt();  // Read user input
    int second = myObj.nextInt();  // Read user input
    if (first > second) {
      int tmp = first;
      first = second;
      second = tmp;
    }
    for (int i = first; i <= second; ++i) {
      if (i % 2 == 0) {
        out.print(i + ", ");
      }
    }
  }

  public static void task8() {
    Scanner myObj = new Scanner(in);
    out.println("task 8");
    out.print("Enter left and right boards: ");
    int first = myObj.nextInt();
    int second = myObj.nextInt();
    for (int i = first; i <= second; i++) {
      out.println("Multiplication table for " + i + ":");
      for (int j = 1; j <= 10; j++) {
        out.printf("%d * %d = %d%n", i, j, i * j);
      }
      out.println();
    }
  }

  public static void task9() {
    out.println("task 9");
    int[] myArray = new int[10];
    Random rn = new Random();
    for (int i = 0; i < 10; ++i) {
      myArray[i] = rn.nextInt(-50, 50);
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
    out.println("Generated array: ");
    for (int num : myArray) {
      out.print(num + " ");
    }
    out.println();
    out.println("Minimum value: " + min);
    out.println("Maximum value: " + max);
    out.println("Number of negative values: " + negativeCount);
    out.println("Number of positive values: " + positiveCount);
    out.println("Number of zeros: " + zeroCount);
  }

  public static void task10() {
    out.println("Task 10");
    int[] originalArray = new int[20];
    Random random = new Random();
    int i = 0;
    while (i < originalArray.length) {
      originalArray[i] = random.nextInt(-50, 50);
      i++;
    }
    out.println("Original array:");
    for (int num : originalArray) {
      out.print(num + " ");
    }
    out.println();
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
    out.println("Even numbers:");
    for (int num : evenArray) {
      out.print(num + " ");
    }
    out.println();

    out.println("Odd numbers:");
    for (int num : oddArray) {
      out.print(num + " ");
    }
    out.println();

    out.println("Negative numbers:");
    for (int num : negativeArray) {
      out.print(num + " ");
    }
    out.println();

    out.println("Positive numbers:");
    for (int num : positiveArray) {
      out.print(num + " ");
    }
    out.println();
  }

  public static void task11(int length, String direction, char symbol) {
    if (direction.equals("horizontal")) {
      for (int i = 0; i < length; i++) {
        out.print(symbol + "\t");
      }
      out.println();
    } else if (direction.equals("vertical")) {
      for (int i = 0; i < length; i++) {
        out.println(symbol);
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
    out.print("Sorted array: [");
    for (int i = 0; i < array.length; i++) {
      out.print(array[i]);
      if (i < array.length - 1) {
        out.print(", ");
      }
    }
    out.println("]");
  }

  public static void main(String[] args) {
    Scanner myObj = new Scanner(in);

    out.println("Welcome to my program!");
    out.println("Please enter the number of task you want to run:");
    int taskNumber = myObj.nextInt();

    switch (taskNumber) {
      case 1:
        task1();
        break;
      case 2:
        task2();
        break;
      case 3:
        task3();
        break;
      case 4:
        task4();
        break;
      case 5:
        task5();
        break;
      case 6:
        task6();
        break;
      case 7:
        task7();
        break;
      case 8:
        task8();
        break;
      case 9:
        task9();
        break;
      case 10:
        task10();
        break;
      case 11:
        out.println("Horizontal line:");
        task11(5, "horizontal", '*');
        out.println("Vertical line:");
        task11(5, "vertical", '#');
        break;
      case 12:
        int[] testArray = {5, 2, 8, 3, 1, 4};
        out.println("Sorting in ascending order:");
        task12(testArray, "ascending");
        out.println("Sorting in descending order:");
        task12(testArray, "descending");
        break;
      default:
        out.println("This task number does not exist. Please enter another number.");
    }

  }
}