package util;

public class utilForExercises {
    public static boolean isConsonant(char value) {

        final String charToLowerCase = String.valueOf(value).toLowerCase();

        final char c = charToLowerCase.toCharArray()[0];

        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }

    public static boolean isVocal(char value) {
        final String charToLowerCase = String.valueOf(value).toLowerCase();

        final char c = charToLowerCase.toCharArray()[0];

        return c != 'b' && c != 'c' && c != 'd' && c != 'f' && c != 'g' && c != 'h' && c != 'j' && c != 'k'
                && c != 'l' && c != 'm' && c != 'n' && c != 'ñ' && c != 'p' && c != 'q' && c != 'r' &&
                c != 's' && c != 't' && c != 'w' && c != 'x' && c != 'y' && c != 'z';
    }
}


