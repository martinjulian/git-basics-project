import ejercicios.ConditionalExercises1;
import ejercicios.ConditionalExercisesLoopsAndText2;
import ejercicios.ConditionalExercisesCollections2;
import ejercicios.ExampleExerciseBundle;

import menu.Menu;

public class Main {

    public static void main(String[] args) {
        final Menu mainMenu = new Menu("Ejercicios");

        ExampleExerciseBundle.subscribeToMenu(mainMenu);
        ConditionalExercises1.SubscribeToMenu(mainMenu);
        ConditionalExercisesLoopsAndText2.SubscribeToMenu(mainMenu);
        ConditionalExercisesCollections2.SubscribeToMenu(mainMenu);

        mainMenu.execute();
    }
}
