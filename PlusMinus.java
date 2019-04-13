//HackerRank Problem PlusMinus
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double posCnt = 0, negCnt = 0, zeroCnt = 0;
        int numCnt = arr.length;
        for(int i : arr) {
            int num = i;
            posCnt += num > 0 ? 1:0;
            negCnt += num < 0 ? 1:0;
            zeroCnt += num == 0 ? 1:0;
        }
        System.out.println(posCnt/numCnt);
        System.out.println(negCnt/numCnt);
        System.out.println(zeroCnt/numCnt);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
