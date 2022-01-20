package strings.task5;

import java.util.Arrays;
import java.util.Scanner;

public class MainStrings {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Input word or sentence");
            array[i] = scan.next();
        }
        System.out.println(searchMax(array));

        String palindrome;
        System.out.println("Input word");
        palindrome = scan.next();
        System.out.println(palindromeCheck(palindrome));

        String text = "Олег - бяка,он  шел по полю и собирал бяку, а потом сам стал как бякарак.бяка";

        System.out.println(text.replaceAll("бяка", "[вырезано цензурой]"));

        String sentence = "бяка";

        System.out.println(numberOfOccurrences(text, sentence));

    }

    private static int searchMax(String[] array) {
        int maxString = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i].length() > maxString) {
                maxString = array[i].length();
            }
        }
        return maxString;
    }

    private static String palindromeCheck(String palindrome) {
        int length = palindrome.length();
        char[] palidnromeArray = new char[length];
        boolean flag = true;

        for (int i = 0; i < length; i++) {
            palidnromeArray[i] = palindrome.charAt(i);
        }

        System.out.println(Arrays.toString(palidnromeArray));
        for (int i = 0; i < palindrome.length(); i++) {
            if (palidnromeArray[i] != palidnromeArray[length - 1 - i]) {
                flag = false;
            }
        }

        if (flag == true) {
            return new String("TRUE");
        } else {
            return new String("FALSE");
        }
    }

    /* private static String censorShip (String text) {
         String cencorText = text.replace("бяка", "[вырезано цензурой]");
         return cencorText;
     }
 */
    private static int numberOfOccurrences(String text, String sentence) {
        int number = 0;
        if (text.contains(sentence)) {
            int withOutSent = text.replaceAll(sentence, "").length();
            number = (text.length() - withOutSent) / sentence.length();
        }
        return number;
    }

}
