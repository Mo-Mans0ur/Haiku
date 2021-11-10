package UI;

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
        System.out.println(" so to Start Write Whatever you want ⬇⬇");
    }
/*
    public Scanner getInput() {
        int linesOfPoem = 0;

        for (int i = 1; i < 3 ; i++) {


            linesOfPoem++;

            scanner.nextLine();
            System.out.println("Write your next line");



        }
        poemInput();
        return input;


    }
       */



    public String poemInput() {
        String userinput = input.nextLine();

        return userinput;
    }


}
