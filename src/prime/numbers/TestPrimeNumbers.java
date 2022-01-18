package prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestPrimeNumbers {
    public static void main(String args[]) {
        int first = 2;
        int last = 100;
        System.out.println("Prime numbers" + generateNumbers(first, last));

        System.out.println("from sieve" + generateSieve(last));

    }

    private static List<Integer> generateNumbers(int first, int last) {
        List<Integer> primeList = new ArrayList<>();

        for (int i = first; i < last + 1; i++) {
            boolean isPrime = true;
            for (int j = i - 1; j >= 2; j--) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static List<Integer> generateSieve(int last) {
        boolean isPrime[] = new boolean[last];
        Arrays.fill(isPrime, true);

        for (int a = 2; a * a < last; a++) {
            if (isPrime[a]) {
                for (int b = 2 * a; b < last; b += a) {
                    isPrime[b] = false;
                }
            }
        }

        List<Integer> primeNumbers = new LinkedList<>();

        for (int a = 2; a < last; a++) {
            if (isPrime[a]) {
                primeNumbers.add(a);
            }
        }
        return primeNumbers;
    }

}
