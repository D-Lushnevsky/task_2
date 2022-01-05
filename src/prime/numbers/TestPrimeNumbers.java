package prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestPrimeNumbers {
    public static void main(String args[]) {
        int first = 2;
        int last = 100;
        System.out.println("Prime numbers" + Arrays.toString(generateNumbers(first, last).toArray()));

        System.out.println("from sieve" + Arrays.toString(generateSieve(last).toArray()));

    }

    private static List<Integer> generateNumbers(int first, int last) {
        List<Integer> primeList = new ArrayList<>();
        boolean isPrime = true;
        for (int i = first; i < last + 1; i++) {
            isPrime = true;
            for (int j = i - 1; j >= 2; j--) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
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
