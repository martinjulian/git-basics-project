import ejercicios.ConditionalExercises1;
import ejercicios.ExampleExerciseBundle;
import menu.Menu;

public class Main {

    public static void main(String[] args) {
        final Menu mainMenu = new Menu("Ejercicios");

        ExampleExerciseBundle.subscribeToMenu(mainMenu);
        ConditionalExercises1.SubscribeToMenu(mainMenu);
        mainMenu.execute();
    }
}
