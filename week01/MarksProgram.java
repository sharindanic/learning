import java.util.Scanner;   // ❶ we need this to read from keyboard

public class MarksProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // ❷ Scanner to read numbers

        int[] marks = new int[6];                // ❸ array to store 6 marks

        // ❹ Read 6 marks from the user
        System.out.println("Enter 6 marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // ❺ Print all the marks
        System.out.println("\nYou entered these marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        // ❻ Count categories
        int fail = 0;
        int pass = 0;
        int class22 = 0;
        int class21 = 0;
        int first = 0;

        for (int i = 0; i < marks.length; i++) {
            int mark = marks[i];

            if (mark < 40) {
                fail++;
            } else if (mark < 50) {        // 40–49
                pass++;
            } else if (mark < 60) {        // 50–59
                class22++;
            } else if (mark < 70) {        // 60–69
                class21++;
            } else {                       // 70 or more
                first++;
            }
        }

        System.out.println("\nCategory counts:");
        System.out.println("Fail (<40): " + fail);
        System.out.println("Pass (40–49): " + pass);
        System.out.println("2:2 (50–59): " + class22);
        System.out.println("2:1 (60–69): " + class21);
        System.out.println("First (>=70): " + first);

        // ❼ Call method to compute average
        double avg = computeAverage(marks);
        System.out.println("\nAverage mark = " + avg);

        // ❽ Call method to find max and min
        int max = findMax(marks);
        int min = findMin(marks);
        System.out.println("Maximum mark = " + max);
        System.out.println("Minimum mark = " + min);

        // ❾ Call method to sort the marks
        int[] sorted = sortAscending(marks);

        System.out.println("\nMarks in ascending order:");
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }

        input.close();   // ➓ good practice: close the Scanner
    }

    // ➊ Method to compute the average
    public static double computeAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // cast to double so we get decimal result
        return (double) sum / arr.length;
    }

    // ➋ Method to find the maximum mark
    public static int findMax(int[] arr) {
        int max = arr[0];                 // start with first element
        for (int i = 1; i < arr.length; i++) {  // start from index 1
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // ➌ Method to find the minimum mark
    public static int findMin(int[] arr) {
        int min = arr[0];                 // start with first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // ➍ Method to sort marks in ascending order (simple selection sort)
    public static int[] sortAscending(int[] arr) {
        // we will sort the same array (in-place)
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // find index of smallest element from i to end
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;   // return the sorted array
    }
}
