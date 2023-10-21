public class Main {
    public static void main(String[] args) {
        String str = "Java Developer";

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        char middleChar= str.charAt(str.length() / 2);
        int sum = firstChar + lastChar + middleChar;
        char maxChar = (char) Math.max(firstChar, Math.max(lastChar, middleChar));

        System.out.println("The first character: " + firstChar + " at position 0");
        System.out.println("The last character: " + lastChar + " at position " + (str.length() - 1));
        System.out.println("The middle character: " + middleChar);
        System.out.println("The sum of these characters' codes: " + sum);
        System.out.println("The character with the biggest code: " + maxChar + " with code of " + (int) maxChar);
    }
}
