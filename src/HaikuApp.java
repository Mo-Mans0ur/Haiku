import UI.Menu;

import java.util.Scanner;

public class HaikuApp {
    private Menu menu = new Menu();

    public static void main(String[] args) {
        HaikuApp app = new HaikuApp();

        app.menu.welcomeUser();
        app.menu.getInput();


    }
}
