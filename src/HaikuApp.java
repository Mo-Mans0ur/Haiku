import Analysis.HaikuAnalysisEngine;
import Analysis.HaikuPoem;
import Data.HaikuWriter;
import UI.Menu;

import java.util.Scanner;

public class HaikuApp {
    private Menu menu = new Menu();

    public static void main(String[] args) {
        HaikuApp app = new HaikuApp();

        app.menu.welcomeUser();
        HaikuPoem poem = Menu.userInput();


        HaikuAnalysisEngine.isHaikuValid(poem);
        HaikuWriter.setWriter();
        //kalder HaikuWRiterens metode, der gemmer digtet
    }
}
