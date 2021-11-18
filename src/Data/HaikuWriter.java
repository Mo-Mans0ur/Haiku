package Data;

import Analysis.HaikuAnalysisEngine;
import Analysis.HaikuPoem;
import UI.Menu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HaikuWriter {
    //Writes the Haiku and stores it


    public static void haikuStorer(HaikuPoem poem) {
        try {
            File file = new File("Haikus/Haiku.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(String.valueOf(poem)+ "\n\n\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("file couldn't be found");
            e.printStackTrace();
        }
    }
}

//poem test//
//the tower bell stops
// but i hear the sound
// im in despair