package trpereira.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * HACKER RANK - ALGORITHMS - DIAGONAL DIFFERENCE
 */
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(9, 8, 9));

        System.out.println("difference: " + diagonalDifference(arr));
        print(arr);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        var sumDiagonalA = 0;
        var sumDiagonalB = 0;

        for (int i = 0; i < arr.size(); i++) {
            sumDiagonalA += arr.get(i).get(i);
            sumDiagonalB += arr.get(i).get(arr.get(i).size() - (i + 1));
        }

        return Math.abs(sumDiagonalA - sumDiagonalB);
    }

    public static void print(List<List<Integer>> arr) {
        var diagonalA = new ArrayList<>();
        var diagonalB = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            diagonalA.add(arr.get(i).get(i));
            diagonalB.add(arr.get(i).get(arr.get(i).size() - (i + 1)));
        }

        System.out.println("MATRIX: ");
        arr.forEach(System.out::println);

        System.out.println("DIAGONALS: ");
        System.out.println(diagonalA);
        System.out.println(diagonalB);
    }
}