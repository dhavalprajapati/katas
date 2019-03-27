package com.dhaval.katas.kata;

import java.util.stream.IntStream;

public class CheckSum {
    public static void main(String args[]) {
        validCheckSum("107073");
        validCheckSum("500000");
    }

    public static boolean validCheckSum(String number) {
        int sum = 0;
        String reverseNumber = new StringBuilder(number).reverse().toString();
        for(int i = 0; i < reverseNumber.length(); i++) {
            sum += ((int)reverseNumber.charAt(i) * i);
        }
        int checkDigit = Integer.parseInt(number.substring(number.length() - 1));
        return checkDigit == (sum%10);
    }

    private static boolean validCheckSumFunctional(String number) {
        String reverseNumber = new StringBuilder(number).reverse().toString();
        int sum = IntStream.range(0, reverseNumber.length())
                .map(reverseIndex -> reverseIndex * (int) reverseNumber.charAt(reverseIndex))
                .reduce(0, (i, j) -> i + j);
        int checkDigit = Integer.parseInt(number.substring(number.length() - 1));
        return checkDigit == (sum%10);
    }
}
