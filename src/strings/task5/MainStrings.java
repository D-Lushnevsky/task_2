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

        String text = "Олег - бяка,он  шел по полю и собирал бяку, а потом сам стал как бякарак.бякабяка";
        String sentence = "бяка";

        System.out.println(censorShip(text, sentence));

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

    private static boolean palindromeCheck(String palindrome) {
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

        return flag;
    }

    private static String censorShip(String text, String sentence) {
        String textBuf = text;
        int len = sentence.length();
        while (textBuf.contains(sentence)) {
            StringBuilder myText = new StringBuilder(textBuf);
            myText.replace(myText.indexOf(sentence), myText.indexOf(sentence) + len, "[вырезано цензурой]");
            textBuf = myText.toString();
        }
        return textBuf;
    }

    private static int numberOfOccurrences(String text, String sentence) {
        int number = 0;
        int flag = 0;
        while (text.indexOf(sentence, number) != -1) {
            flag += 1;
            number = text.indexOf(sentence, number) + sentence.length();
        }
        return flag;
    }

}
