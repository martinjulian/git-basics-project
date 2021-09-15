package ejercicios;

import menu.Menu;
import static util.IOUtil.intInput;
import static util.IOUtil.print;

public class ConditionalExercises2 {

    public static void SubscribeToMenu(Menu mainMenu) {
        final Menu exercises = new Menu("Ejercicios condicionales 2", mainMenu);

        exercises.addItem("Ejercicio 1 ", ConditionalExercises2::Exercise1);
        /*exercises.addItem("Ejercicio 2 ", ConditionalExercises2::Exercise2);
        exercises.addItem("Ejercicio 3 ", ConditionalExercises2::Exercise3);
        exercises.addItem("Ejercicio 4 ", ConditionalExercises2::Exercise4);
        exercises.addItem("Ejercicio 5 ", ConditionalExercises2::Exercise5);
        exercises.addItem("Ejercicio 6 ", ConditionalExercises2::Exercise6);
        exercises.addItem("Ejercicio 7 ", ConditionalExercises2::Exercise7);
        exercises.addItem("Ejercicio 8 ", ConditionalExercises2::Exercise8);
        exercises.addItem("Ejercicio 9 ", ConditionalExercises2::Exercise9);
        exercises.addItem("Ejercicio 10 ", ConditionalExercises2::Exercise10);*/
    }
    //1- Ingresar un número. Mostrar todos los números hasta llegar a su opuesto.
    public static void Exercise1() {
        final int num = intInput("ingrese un numero entero");
        final int oppositeNum = num * -1;

        final int step = num < 0 ? 1 : -1;
        int numToPrint = num;

        while (numToPrint != oppositeNum + step){
            print(numToPrint);
            numToPrint += step; //numToPrint = numbToPrint + step;
        }
    }

}
