package ejercicios;

import menu.Menu;
import util.IOUtil;

import static util.IOUtil.intInput;
import static util.IOUtil.print;

public class ConditionalExercises1 {

    public static void SubscribeToMenu(Menu mainMenu) {
        final Menu exercises = new Menu("Ejercicios condicionales 1", mainMenu);

        exercises.addItem("Ejercicio 1 ", ConditionalExercises1::Exercise1); //method reference java 8
        exercises.addItem("Ejercicio 2 ", ConditionalExercises1::Exercise2);
        exercises.addItem("Ejercicio 3 ", ConditionalExercises1::Exercise3);
        exercises.addItem("Ejercicio 4 ", ConditionalExercises1::Exercise4);
        exercises.addItem("Ejercicio 5 ", ConditionalExercises1::Exercise5);
        exercises.addItem("Ejercicio 6 ", ConditionalExercises1::Exercise6);
        exercises.addItem("Ejercicio 7 ", ConditionalExercises1::Exercise7);
    }

    //1. Ingresar un número entero. En caso de ser positivo indicar ‘true’ por pantalla
    public static void Exercise1() {
        int num = intInput("Ingrese un numero entero");

        if (num > 0) {
            print(true);
        }

    }

    //2. Ingresar un número entero. En caso de ser positivo indicar ‘true’ por pantalla. En caso de
    //ser negativo, y sólo si está entre -10 y -20, indicarlo ‘true’ por pantalla.
    public static void Exercise2() {
        int num = intInput("Ingrese un numero entero");

        if (num > 0) {
            print(true);
        } else if (num < -10 && num > -20) {
            print(true);
        }
    }

    //3. Ingresar un número entero. En caso de ser positivo y mayor que 10 indicar true por
    //pantalla.
    public static void Exercise3() {
        int num = intInput("Ingrese un numero entero");

        if (num > 0 && (num > 10)) {
            print(true);
        }
    }

    //4. Ingresar dos números, 'a' y 'b'. En caso de que 'a' sea positivo, mostrar 'true' si 'b' es
    //positivo. En caso de que 'a' sea negativo, mostrar 'true' si 'b' es negativo.
    public static void Exercise4() {
        int numA = intInput("Ingrese un numero entero A");
        int numB = intInput("Ingrese un numero entero B");

        if (numA > 0 && numB > 0) {
            print(true);
        } else if (numA < 0 && numB < 0) {
            print(true);
        }
    }

    //5. Ingresar tres números. Mostrar “true” cada vez que el número ingresado sea par
    public static void Exercise5() {

        int numA = intInput("Ingrese un numero entero A");
        int numB = intInput("Ingrese un numero entero B");
        int numC = intInput("Ingrese un numero entero C");

        if (numA % 2 == 0) {
            print(true);
        }
        if (numB % 2 == 0) {
            print(true);
        }
        if (numC % 2 == 0) {
            print(true);
        }
    }

    //6. Ingresar dos números, 'a' y 'b'. En caso de que ambos sean positivos, para cada uno
    //mostrar 'true' si el resultado de sumarle 1 es par. De modo contrario hacer la misma
    //operación pero sólo para 'a'.
    public static void Exercise6() {

        int numA = intInput("Ingrese un numero entero A");
        int numB = intInput("Ingrese un numero entero B");

        if (numA > 0 && numB >  0 ) {
            if ((numA+1) % 2 ==0 ) {
                print(true);

            }
            if ((numB+1) % 2 ==0 ) {
                print(true);
            }
        }
        else if ((numA+1) % 2 ==0 ) {
            print(true);
        }
    }

    //7. Ingresar tres números 'a', 'b' y 'c'. En caso de que 'a' sea positivo y la suma de 'b' y 'c' sea
    //un número positivo, mostrar 'true'. Si esto último no sucede pero la resta entre 'a' y 'b' es
    //negativa, también mostrar 'true'. En todos los demás casos indicar por pantalla si la resta de
    //los tres números es igual a 0
    public static void Exercise7() {
        int numA = intInput("Ingrese un numero entero A");
        int numB = intInput("Ingrese un numero entero B");
        int numC = intInput("Ingrese un numero entero C");

        if (numA > 0 ){
            if ((numC+numB > 0) || (numA-numB < 0)) {
                print(true);
            }
        }
        if ((numA-numB-numC)==0) {
            print(true);
        }
    }


}