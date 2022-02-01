package Palindrome;

import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {

        findLongestChain(100);

    }


    static long calculatePalindrome(long num) { //sayıyı ters çevirir
        String numToCheck = String.valueOf(num);
        StringBuilder reverseNum = new StringBuilder();

        for (int i = numToCheck.length() - 1; i >= 0; i--) {
            reverseNum.append(numToCheck.charAt(i));
        }

        return Long.parseLong(reverseNum.toString());
    }


    static boolean isPalindrome(long num) { //palindrome olup olmadığını kontrol eder
        return(num == calculatePalindrome(num));
    }


    static int howManySteps(int num) { //kaç kere toplayınca palindrome olacağını bulur
        long sum = (long)num;
        int steps = 0;
        while (!isPalindrome(sum)) {
            sum += calculatePalindrome(sum);
            steps++;
        }
        return steps;
    }

    static void findLongestChain(int num) { //en uzun zinciri hesaplar
        int hardestNum = 0;
        int steps = 0;

        for (int i = 1; i <= num; i++) {
            if(howManySteps(i) > steps) {
                steps = howManySteps(i);
                hardestNum = i;
            }
        }

        System.out.println("\n" + hardestNum + " en uzun zinciri sağlıyor ve "
                + steps + " adımda palindrome oluyor.\n");

        chainPrinter(hardestNum, steps);
    }

    static void chainPrinter(long hardestNum, int steps) { //en uzun zinciri satır satır yazdırır

        ArrayList chain = new ArrayList();
        chain.add(hardestNum);
        long sum = hardestNum;

        System.out.println("Zincir şu şekilde: ");

        for (int i = 0; i < steps; i++) {
            sum += calculatePalindrome(sum);
            chain.add(sum);
            long tempNum = (long)chain.get(i);

            System.out.println((i + 1) + ". " + tempNum + " + " +  calculatePalindrome(tempNum) +
                    " = " + chain.get(i + 1));
        }
    }
}


