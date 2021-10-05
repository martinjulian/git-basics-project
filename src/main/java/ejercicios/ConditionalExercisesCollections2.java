package ejercicios;

import menu.Menu;

import java.util.*;

import static util.IOUtil.*;

public class ConditionalExercisesCollections2 {
    public static void SubscribeToMenu(Menu mainMenu) {
        final Menu exercises = new Menu("Ejercicios condicionales colecctions 2", mainMenu);

        exercises.addItem("Ejercicio 1 ", ConditionalExercisesCollections2::exercise1);
        exercises.addItem("Ejercicio 2 ", ConditionalExercisesCollections2::exercise2);
        exercises.addItem("Ejercicio 3 ", ConditionalExercisesCollections2::exercise3);
        /*exercises.addItem("Ejercicio 4 ", ConditionalExercisesCollections2::exercise4);
        exercises.addItem("Ejercicio 5 ", ConditionalExercisesCollections21::exercise5);
        exercises.addItem("Ejercicio 6 ", ConditionalExercisesCollections2::exercise6);
        exercises.addItem("Ejercicio 7 ", ConditionalExercisesCollections2::exercise7);
        exercises.addItem("Ejercicio 8 ", ConditionalExercisesCollections2::exercise8);*/
        }



    /*1 - Cargar dos listas de 5 personas indicando su nombre. Luego armar un mapa de parejas
    por orden de llegada en cada lista. Imprimir las parejas separadas por '-'.*/
    public static void exercise1(){
        List<String> list1 = createListOfNames(5, "lista 1");
        List<String> list2 = createListOfNames(5, "lista 2");


        final Map<String, String> couples= new HashMap<>();
        for (int i = 0; i < 5; i++ ){
            print(list1.get(i) + "-" + list2.get(i));
        }

    }

    public static List<String> createListOfNames(int size, String listName){
        final List<String> listOfNames = new ArrayList<>();

        for (int i = 0; i < size; i++ ) {
            listOfNames.add(stringInput(String.format("ingrese el nombre n %s para la lista %s", i + 1, listName)));
        }
    return listOfNames;
    }
    /* 2 - Crear dos listas de 5 números. Imprimir las parejas que se forman con los números en
    orden ascendente para la primera lista, y descendente para la segunda.*/
    public static void exercise2() {
        List<Integer> list1 = createListOfNumbers(5, "lista 1");
        List<Integer> list2 = createListOfNumbers(5, "lista 2");

        Collections.sort(list1);
        Collections.sort(list2, Collections.reverseOrder());

        for (int i = 0; i < 5; i++ ){
            print(list1.get(i) + "-" + list2.get(i));
        }


    }

    public static List<Integer> createListOfNumbers(int size, String listName){
        final List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < size; i++ ) {
            listOfNumbers.add(intInput(String.format("ingrese el nombre n %s para la lista %s", i + 1, listName)));
        }
        return listOfNumbers;
    }
    /* 3 - Crear un enum para representar un podio: CHAMPION, SUB_CHAMPION,THIRD_PLACE.
    Ingresar el nombre y el puntaje de tres equipos y armar un mapa con el podio (enum + nombre).
    En caso de haber algún empate mostrar “¡Aún no hay un podio definido!”*/
    public static void exercise3() {
        final String team1Name = stringInput("Ingrese el nombre del primer equipo");
        final int team1Score = intInput("Ingrese el puntaje del primer equipo");

        final String team2Name = stringInput("Ingrese el nombre del segundo equipo");
        final int team2Score = intInput("Ingrese el puntaje del segundo equipo");

        final String team3Name = stringInput("Ingrese el nombre del tercer equipo");
        final int team3Score = intInput("Ingrese el puntaje del tercer equipo");

        Map<Integer, String > teamByScore = new TreeMap<>();
        teamByScore.put(team1Score,team1Name);
        teamByScore.put(team2Score,team2Name);
        teamByScore.put(team3Score,team3Name);

        Map<Integer, String> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(teamByScore);

        if (teamByScore.size() < 3) {
            print("¡Aún no hay un podio definido!");

            //aca papucho
        } else {
            final Map<Podium, String> podiumMap = new HashMap<>();
            podiumMap.put(Podium.CHAMPION, sortedMap.get(0));
            podiumMap.put(Podium.SUB_CHAMPION, sortedMap.get(1));
            podiumMap.put(Podium.THIRD_PLACE, sortedMap.get(2));

           print(podiumMap);
        }
    }
    private enum Podium
    {
        CHAMPION, SUB_CHAMPION, THIRD_PLACE;
    }

}



