package prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPrimeNumbers {
    public static void main(String args[]) {

        System.out.println("Prime numbers" + Arrays.toString(generateNumbers()) );
    }

    private static Object[] generateNumbers() {
        List<Integer> primeList = new ArrayList<>();
        boolean isPrime = true;
        for (int i = 2; i < 101; i++) {
            isPrime = true;
            for (int j = i - 1; j >= 2; j--) {
                if ( i % j == 0) {
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
