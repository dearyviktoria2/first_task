
public class Main
{
    public static void main(String[] args) {
        separateAndPrintLetters("HeLLoWoRLD");
    }
    public static void separateAndPrintLetters(String input) {

        StringBuilder upperCase = new StringBuilder();
        StringBuilder lowerCase = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCase.append(c);
            } else if (Character.isLowerCase(c)) {
                lowerCase.append(c);
            }
        }

        System.out.println("Заглавные: " + upperCase.toString());
        System.out.println("Строчные: " + lowerCase.toString());
    }
}