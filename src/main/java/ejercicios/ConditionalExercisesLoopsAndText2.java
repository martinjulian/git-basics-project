package ejercicios;

import menu.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static util.IOUtil.*;
import static util.utilForExercises.isConsonant;
import static util.utilForExercises.isVocal;

public class ConditionalExercisesLoopsAndText2 {

    public static void SubscribeToMenu(Menu mainMenu) {
        final Menu exercises = new Menu("Ejercicios condicionales loops 2", mainMenu);

        exercises.addItem("Ejercicio 1 ", ConditionalExercisesLoopsAndText2::exercise1);
        exercises.addItem("Ejercicio 2 ", ConditionalExercisesLoopsAndText2::exercise2);
        exercises.addItem("Ejercicio 3 ", ConditionalExercisesLoopsAndText2::exercise3);
        exercises.addItem("Ejercicio 4 ", ConditionalExercisesLoopsAndText2::exercise4);
        exercises.addItem("Ejercicio 5 ", ConditionalExercisesLoopsAndText2::exercise5);
        exercises.addItem("Ejercicio 6 ", ConditionalExercisesLoopsAndText2::exercise6);
        exercises.addItem("Ejercicio 7 ", ConditionalExercisesLoopsAndText2::exercise7);
        exercises.addItem("Ejercicio 8 ", ConditionalExercisesLoopsAndText2::exercise8);
        exercises.addItem("Ejercicio 9 ", ConditionalExercisesLoopsAndText2::exercise9);
        exercises.addItem("Ejercicio 10 ", ConditionalExercisesLoopsAndText2::exercise10);
        exercises.addItem("Ejercicio 11 ", ConditionalExercisesLoopsAndText2::exercise11);
    }

    //1- Ingresar un número. Mostrar todos los números hasta llegar a su opuesto.
    public static void exercise1() {
        int num = intInput("ingrese un numero entero");
        final int oppositeNum = num * -1;


        if (num < 0) {
            while (num != oppositeNum) {
                num++;
                print(num);
            }

        } else if (num > 0) {
            while (num != oppositeNum) {
                num--;
                print(num);
            }

        }
    }
        /*final int step = num < 0 ? 1 : -1;
        int numToPrint = num;

        while (numToPrint != oppositeNum + step) {
            print(numToPrint);
            numToPrint += step; //numToPrint = numbToPrint + step;
            */



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

        for (char c : charArray) {
            if (isConsonant(c)) {
                result += c;
            }
        }
        print(result);

    }


    //7- Ingresar un texto y una letra. Mostrar la cantidad de ocurrencias de esa letra ignorando
    //mayúsculas/minúsculas
    public static void exercise7() {
        final String text = stringInput("ingrese un texto").toLowerCase();
        final String letter = stringInput("ingrese una letra").toLowerCase();
        int occurrences = 0;

        if (letter.length() != 1) {
            print("ingreso invalido");
            return;
        } else {

            char[] charArray = text.toCharArray();
            for (char c : charArray) {

                final String stringvalue = String.valueOf(c);

                if (stringvalue.equals(letter)) {
                    occurrences++;

                }
            }
        }
        print(occurrences);

    }

    //8- Ingresar un texto. Devolver un texto conteniendo las vocales primero y luego las
    //consonantes. Eliminar los espacios
    public static void exercise8() {
        final String text = stringInput("ingrese un texto");
        final String textWithoutSpaces = text.replace(" ", "");
        String vocals = "";
        String consonats = "";
        for (char c : textWithoutSpaces.toCharArray()) {
            if (isConsonant(c)) {
                consonats += c;
            } else if (isVocal(c)) {
                vocals += c;

            }
        }
        print(vocals + consonats);
    }

    //9- Ingresar números hasta que la suma de todos supere 100.
    public static void exercise9() {
        int sum = 0;

        while (sum <= 100) {
            int sumB = intInput("ingerese un numero");
            sum += sumB;

        }
        print(sum);
    }

    /* 10- Ingresar un número n. Ingresar n cantidad de caracteres. Mostrar la concatenación.
    Ej.: ingreso 5. Muestro “Ingresar 5 caracteres”. Ingreso “a” “b” “c” “d” “e”. Muestro “abcde”*/
    public static void exercise10() {
    final int num = intInput("ingrese un numero");

    String result ="";

    for (int i = 0; i < num; i ++){
        String c = "";

            while (c.length() != 1) {
                c = stringInput("ingrese un caracter");

            }
                result+=c;
        }
        print(result);
    }
   /* 11- Ingresar un número entero de 6 cifras. Mostrar la secuencia de números ordenada de
    forma ascendente. Utilizar tipo de dato double.
    Ej.: entrada = 874396, salida = 346789*/

    public static void exercise11(){
        int num = intInput("ingrese un numero de 6 cifras", i -> String.valueOf(i).length() == 6 );

        final List<String> digitalStringlist = new ArrayList<>(Arrays.asList(String.valueOf(num).split( "")));

        final List<Integer> digits = digitalStringlist.stream().map(Integer::parseInt).collect(Collectors.toList());

    }
}
