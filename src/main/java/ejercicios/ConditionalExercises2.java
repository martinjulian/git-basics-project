package ejercicios;

import menu.Menu;

import static util.IOUtil.*;

public class ConditionalExercises2 {

    public static void SubscribeToMenu(Menu mainMenu) {
        final Menu exercises = new Menu("Ejercicios condicionales 2", mainMenu);

        exercises.addItem("Ejercicio 1 ", ConditionalExercises2::exercise1);
        exercises.addItem("Ejercicio 2 ", ConditionalExercises2::exercise2);
        exercises.addItem("Ejercicio 3 ", ConditionalExercises2::exercise3);
        exercises.addItem("Ejercicio 4 ", ConditionalExercises2::exercise4);
        exercises.addItem("Ejercicio 5 ", ConditionalExercises2::exercise5);
        exercises.addItem("Ejercicio 6 ", ConditionalExercises2::exercise6);
        exercises.addItem("Ejercicio 7 ", ConditionalExercises2::exercise7);
        /*exercises.addItem("Ejercicio 8 ", ConditionalExercises2::Exercise8);
        exercises.addItem("Ejercicio 9 ", ConditionalExercises2::Exercise9);
        exercises.addItem("Ejercicio 10 ", ConditionalExercises2::Exercise10);*/
    }

    //1- Ingresar un número. Mostrar todos los números hasta llegar a su opuesto.
    public static void exercise1() {
        final int num = intInput("ingrese un numero entero");
        final int oppositeNum = num * -1;

        final int step = num < 0 ? 1 : -1;
        int numToPrint = num;

        while (numToPrint != oppositeNum + step) {
            print(numToPrint);
            numToPrint += step; //numToPrint = numbToPrint + step;
        }
    }

    //2- Ingresar un número. Mostrar todos los múltiplos de 2 anteriores a ese número.
    public static void exercise2() {

        final int num = intInput("ingrese un numero entero");

        for (int i = 2; i <= num; i += 2) {
            print(i);
        }
    }

    //3- Ingresar números, 0 para terminar. Indicar si el número ingresado es par.
    public static void exercise3() {
        String promptMessage = "ingrese un numero o ingrese 0 para finalizar";

        int num = intInput(promptMessage);

        while (num != 0) {

            if (num % 2 == 0) {
                print("el numero ingresado es par");
            }

            num = intInput(promptMessage);
        }
    }

    /*4- Ingresar números, 0 para terminar. Si el número es par, ingresar otro número
     e indicar si la suma de ambos es par (IOUtil.print(true)). Si la suma es impar,
     o el primer número lo es, indicar que es impar (IOUtil.print(false)).*/
    public static void exercise4() {
        String promptMessage = "ingrese un numero o ingrese 0 para finalizar";
        int numA = intInput(promptMessage);

        while (numA != 0) {
            if (numA % 2 == 0) {
                int numB = intInput("ingrese otro numero");

                if ((numA + numB) % 2 == 0) {
                    print("la suma de ambos numeros ingresados es par");

                } else {
                    print("la suma de ambos numeros ingresados es impar");
                }

            } else {
                print("el numero ingresado es impar");
            }
            numA = intInput(promptMessage);
        }
    }

    //5- Ingresar un texto. Mostrar la secuencia de caracteres de forma inversa.
    public static void exercise5() {
        final String text = stringInput("ingrese un texto");

        final char[] charArray = text.toCharArray();

        String result = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];

        }
        print(result);
    }

    //6- Ingresar un texto. Mostrar sólo las consonantes en mayúscula.
    public static void exercise6() {
        final String text = stringInput("ingrese un texto").toUpperCase();

        final char[] charArray = text.toCharArray();

        String result = "";

        for (char c: charArray) {
            if (isConsonant(c)){
            result += c;
            }
        }
        print(result);

    }

    private static boolean isConsonant(char value) {

        final String charToLowerCase = String.valueOf(value).toLowerCase();

        final char c =charToLowerCase.toCharArray()[0];

        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
    //7- Ingresar un texto y una letra. Mostrar la cantidad de ocurrencias de esa letra ignorando
    //mayúsculas/minúsculas
    public  static void exercise7(){
        final String text= stringInput("ingrese un texto");
        final String letter= stringInput("ingrese una letra");

    }
}