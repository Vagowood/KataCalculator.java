
import java.util.ArrayList;
import java.util.List;
public class Azaza {
    static void calculateArabicDigits(long num1, long num2, char sign) {
        switch (sign) {
            case ('+'):
                System.out.println(num1 + num2);
                break;
            case ('-'):
                System.out.println(num1 - num2);
                break;
            case ('/'):
                System.out.println(num1 / num2);
                break;
            case ('*'):
                System.out.println(num1 * num2);
                break;
        }
    }

    static void calculateRomanDigits(long num1, long num2, char sign) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("I");
        list.add("II");
        list.add("III");
        list.add("IV");
        list.add("V");
        list.add("VI");
        list.add("VII");
        list.add("VIII");
        list.add("IX");
        list.add("X");
        list.add("XI");
        list.add("XII");
        list.add("XIII");
        list.add("XIV");
        list.add("XV");
        list.add("XVI");
        list.add("XVII");
        list.add("XVIII");
        list.add("XIX");
        list.add("XX");
        list.add("XXI");
        list.add("XXII");
        list.add("XXIII");
        list.add("XXIV");
        list.add("XXV");
        list.add("XXVI");
        list.add("XXVII");
        list.add("XXVIII");
        list.add("XXIX");
        list.add("XXX");
        list.add("XXXI");
        list.add("XXXII");
        list.add("XXXIII");
        list.add("XXXIV");
        list.add("XXXV");
        list.add("XXXVI");
        list.add("XXXVII");
        list.add("XXXVIII");
        list.add("XXXIX");
        list.add("XL");
        list.add("XLI");
        list.add("XLII");
        list.add("XLIII");
        list.add("XLIV");
        list.add("XLV");
        list.add("XLVI");
        list.add("XLII");
        list.add("XLVIII");
        list.add("XLIX");
        list.add("L");
        list.add("LI");
        list.add("LII");
        list.add("LIII");
        list.add("LIV");
        list.add("LV");
        list.add("LVI");
        list.add("LVII");
        list.add("LVIII");
        list.add("LIX");
        list.add("LX");
        list.add("LXI");
        list.add("LXII");
        list.add("LXIII");
        list.add("LXIV");
        list.add("LXV");
        list.add("LXVI");
        list.add("LXVII");
        list.add("LXVIII");
        list.add("LXIX");
        list.add("LXX");
        list.add("LXXI");
        list.add("LXXII");
        list.add("LXXIII");
        list.add("LXXIV");
        list.add("LXXV");
        list.add("LXXVI");
        list.add("LXXVII");
        list.add("LXXVIIII");
        list.add("LXXIX");
        list.add("LXXX");
        list.add("LXXXI");
        list.add("LXXXII");
        list.add("LXXXIII");
        list.add("LXXXIV");
        list.add("LXXXV");
        list.add("LXXXVI");
        list.add("LXXXVII");
        list.add("LXXXVIII");
        list.add("LXXXIX");
        list.add("XC");
        list.add("XCI");
        list.add("XCII");
        list.add("XCIII");
        list.add("XCIV");
        list.add("XCV");
        list.add("XCVI");
        list.add("XCVII");
        list.add("XCVIII");
        list.add("XCIX");
        list.add("C");


        long result;
        try {
            if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10)
                throw new Exception("Число не соответствует условию");
            switch (sign) {
                case ('+'):
                    result = num1 + num2;
                    System.out.println(list.get((int) result));
                    break;
                case ('-'):
                    result = num1 - num2;
                    System.out.println(list.get((int) result));
                    break;
                case ('/'):
                    result = num1 / num2;
                    System.out.println(list.get((int) result));
                    break;
                case ('*'):
                    result = num1 * num2;
                    System.out.println(list.get((int) result));
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
