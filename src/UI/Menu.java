package UI;

import Analysis.HaikuPoem;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    private Scanner input;

    public Menu() {
        this.input = new Scanner(System.in);
    }

    public void welcomeUser() {
        System.out.println("Welcome User");
        System.out.println(" this is a Haiku Poem App, if you can call it that,\n you try to write a poem, and ill see if it's a Haiku or not.\n but the poem has to contain 17 syllables: \n | 5 in the first line. \t 7 in the second. \t 5 in the third. |\n");
        System.out.println("---------------------------------------");
        System.out.println("so to Start ⬇⬇");
    }

    public static HaikuPoem userInput() {
        System.out.println("Write your first line");
        String firstLine = scanner.nextLine();

        System.out.println("Write your second line");
        String secondLine = scanner.nextLine();

        System.out.println("Write your third line");
        String thirdLine = scanner.nextLine();

        HaikuPoem poem = new HaikuPoem(firstLine, secondLine, thirdLine);

        return poem;
    }

}
