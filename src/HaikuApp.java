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

        if (HaikuAnalysisEngine.isHaikuValid(poem) == true) {
            HaikuWriter.haikuStorer(poem);
        } else if (HaikuAnalysisEngine.isHaikuValid(poem) == false) {
            System.out.println("its not a haiku bud...");
        }


    }
}
