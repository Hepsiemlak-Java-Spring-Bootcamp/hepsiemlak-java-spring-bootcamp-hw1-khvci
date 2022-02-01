class Main {
    public static void main(String[] args) {

        System.out.println(calculatePalindrome(1005));
    }

    static long calculatePalindrome(long num) {
        String numToCheck = String.valueOf(num);
        StringBuilder reverseNum = new StringBuilder();

        for (int i = numToCheck.length() - 1; i >= 0; i--) {
            reverseNum.append(numToCheck.charAt(i));
        }

        return Long.parseLong(reverseNum.toString());
    }
}
