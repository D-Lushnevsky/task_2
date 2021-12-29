package prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPrimeNumbers {
    public static void main(String args[]) {
        int first = 2;
        int last = 1000;
        System.out.println("Prime numbers" + Arrays.toString(generateNumbers(first, last)));

    }

    private static Object[] generateNumbers(int first, int last) {
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
        return primeList.toArray();
    }
}
