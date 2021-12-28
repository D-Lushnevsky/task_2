package prime.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPrimeNumbers {
    public static void main(String args[]) {

        System.out.println("Prime numbers" + Arrays.toString(generateNumbers()) );
    }

    private static int[] generateNumbers() {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 3; i < 101; i++) {
            for (int j = i - 1; j >= 2; j--) {
                if ()


            }
        }
        return null;
    }
}
