package ejercicios;

import menu.Menu;

import static util.IOUtil.*;
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
        exercises.addItem("Ejercicio 8 ", ConditionalExercises1::Exercise8);
        exercises.addItem("Ejercicio 9 ", ConditionalExercises1::Exercise9);
        exercises.addItem("Ejercicio 10 ", ConditionalExercises1::Exercise10);
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

        if (num > 0) {
            if (num > 10) {
                print(true);

            }

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

        if (numA > 0 && numB > 0) {
            if ((numA + 1) % 2 == 0) {
                print(true);

            }
            if ((numB + 1) % 2 == 0) {
                print(true);
            }
        } else if ((numA + 1) % 2 == 0) {
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

        if (numA > 0) {
            if ((numC + numB > 0) || (numA - numB < 0)) {
                print(true);
            }
        }
        if ((numA - numB - numC) == 0) {
            print(true);
        }
    }

    //8. Ingresar dos colores. Pueden ser los tres primarios o sus combinaciones. Si los dos
    //colores son primarios, devolver el color que se forma. Si uno es secundario y el otro es uno
    //de sus primarios, devolver el secundario sumándole "claro"/"oscuro" según sea el caso. Si
    //los dos son secundarios, o si uno es primario pero no forma parte del secundario, devolver
    //'marrón'. Si alguno es inexistente, indicar "error". Pista -> pasar a minúscula.
    public static void Exercise8() {
        final String ColorA = stringInput("ingrese un color A").toLowerCase();
        final String ColorB = stringInput("ingrese un color B").toLowerCase();

        final String rojo = "rojo";
        final String amarillo = "amarillo";
        final String azul = "azul";

        final String naranja = "naranja";
        final String violeta = "violeta";
        final String verde = "verde";

        final String marron = "marron";

        final String oscuro = "oscuro";
        final String claro = "claro";

        final String error = "error";

        if (!rojo.equals(ColorA) && !amarillo.equals(ColorA) && !azul.equals(ColorA) &&
                !naranja.equals(ColorA) && !violeta.equals(ColorA) && !verde.equals(ColorA)) {
            print(error);
            return;

       }
        else if (!rojo.equals(ColorB) && !amarillo.equals(ColorB) && !azul.equals(ColorB) &&
                    !naranja.equals(ColorB) && !violeta.equals(ColorB) && !verde.equals(ColorB)) {
                print(error);
                return;

        }
        final String userinput= ColorA + ColorB;

        switch (userinput){
            case rojo + amarillo:
            case amarillo + rojo:
                print(naranja);
                break;

            case rojo + azul:
            case azul + rojo:
                print(violeta);
                break;

            case amarillo + azul:
            case azul + amarillo:
                print(verde);
                break;

            case verde + amarillo:
                print(verde + claro);
                break;

            case verde + azul:
                print(verde + oscuro);
                break;

            case violeta + rojo:
                print(violeta + claro);
                break;

            case violeta + azul:
                print(violeta + oscuro);
                break;

            case naranja + amarillo:
                print(naranja + claro);
                break;

            case naranja + rojo:
                print( naranja + oscuro);
                break;

            default:
                print(marron);
                break;



        }
    }

    //9. Calculadora:
    //Ingresar un texto: "sum", "subtract", "multiply", "divide", "percentage".
    //Ingresar dos números y mostrar por pantalla el resultado de la operación. Mostrar
    //"error" si la operación es inválida o si se divide por 0.
    public static void Exercise9(){
        final String operation = stringInput("ingrese una operacion a realizar").toLowerCase();
        final String sum = "sum";
        final String multiply = "multiply";
        final String substract = "substract";
        final String divide = "divide";
        final String percentaje = "percentaje";

        if (!operation.equals(sum) && !operation.equals(multiply)
           && !operation.equals(substract) && !operation.equals(divide) && !operation.equals(percentaje)){
            print("error");
            return;
        }

        final double numA = doubleInput( "ingrese numero A");
        final double numB = doubleInput( " ingrese numero B");

        if (operation.equals(divide) && (numB==0)) {
            print("error");
            return;
        }
        if (operation.equals(percentaje) && (numB < 0)){
            print("error");
            return;

        }
        switch (operation){
            case sum:
                print(numA+numB);
                break;

            case multiply:
                print(numA*numB);
                break;

            case substract:
                print(numA-numB);
                break;

            case divide:
                print(numA/numB);
                break;

            case percentaje:
                print(numA*(numB/100));
                break;



        }
        }

        //10. Modelar el juego “piedra, papel o tijera”. Primero cada jugador ingresará su nombre.
    //Luego elige la opción primero el jugador uno y luego el dos. Mostrar por pantalla el ganador
    //o error si ingresan una opción inválida
    public static void Exercise10(){
        final String NameA= stringInput( "Ingrese el nombre el jugador 1");
        final String NameB= stringInput( "Ingrese el nombre el jugador 2");

        final String piedra = "piedra";
        final String papel = "papel";
        final String tijera = "tijera";

        final String OptionA= stringInput(NameA + ": seleccione piedra papel o tijera").toLowerCase();
            if (!OptionA.equals(papel) && !OptionA.equals(piedra) && !OptionA.equals(tijera)) {
                print("error");
                return;
        }


        final String OptionB= stringInput( NameB + ": seleccione piedra papel o tijera").toLowerCase();
            if (!OptionB.equals(papel) && !OptionB.equals(piedra) && !OptionB.equals(tijera)) {
                print("error");
                return;
            }
        final String useroption = OptionA + OptionB;
        final String ganador = "ganador";

            switch (useroption) {
                case piedra + tijera:
                case papel + piedra:
                case tijera + papel:
                    print(NameA + ":" + ganador);
                    break;

                case tijera + piedra:
                case papel + tijera:
                case piedra + papel:
                     print(NameB + ":" + ganador);
                     break;

                case papel + papel:
                case piedra + piedra:
                case tijera + tijera:
                    print("empate");
                    break;

            }
    }
}


