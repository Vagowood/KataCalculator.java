
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значения для вычисления");
        String input = s.nextLine();
        String clearInput = input.replaceAll("\\s+", "");
        char znak = '\u0000';
        int index = 0;
        for (int i = 0; i < clearInput.length() - 1; i++) {
            if (clearInput.charAt(i) == '+' || clearInput.charAt(i) == '-' ||
                    clearInput.charAt(i) == '/' || clearInput.charAt(i) == '*') {
                znak = clearInput.charAt(i);
                index = i;
            }
        }
        int inputLength = clearInput.length();
        String n = clearInput.substring(0, index);
        String b = clearInput.substring((index + 1), inputLength);
        try {
            int num1 = Integer.parseInt(n);
            int num2 = Integer.parseInt(b);
            if (num1 < 0 || num1 > 10 || num2 > 10 || num2 < 0) {
                throw new Exception("Число не соответствует условию");
            } else {
                Azaza.calculateArabicDigits(num1, num2, znak);
            }
        } catch (NumberFormatException e) {
            Number one = Number.valueOf(n);
            int num1 = one.getTranslation();
            Number two = Number.valueOf(b);
            int num2 = two.getTranslation();
            Azaza.calculateRomanDigits(num1, num2, znak);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


