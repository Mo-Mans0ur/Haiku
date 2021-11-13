package Data;

import Analysis.HaikuAnalysisEngine;
import Analysis.HaikuPoem;
import UI.Menu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HaikuWriter {
    //Writes the Haiku and stores it


    public static void setWriter() {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("Haikus/Haikus.csv"));

            writer.write(Menu.userInput().getFirstLine());
            writer.write((Menu.userInput().getSecondLine()));
            writer.write(Menu.userInput().getThirdLine());

            writer.close();

        } catch (IOException e) {
            System.out.println("file couldn't be found");
            e.printStackTrace();
        }
    }
}
