package Analysis;


public class HaikuAnalysisEngine {

    public static void isHaikuValid(HaikuPoem poem) {
        if(vowelCounter1(poem) == 5){
            System.out.println("Great!! thats the first line done");
        } else if (vowelCounter1(poem) != 5) {
            System.out.println("try again");

        }if (vowelCounter2(poem) == 7) {
            System.out.println("nice!! the Second line is done");
        } else if (vowelCounter2(poem) != 7) {
            System.out.println("try again");

        }if (vowelCounter3(poem) == 5) {
            System.out.println("Amazing!! the third line is done\n");
            System.out.println("now that you are done lets store it for memories");
        } else if (vowelCounter3(poem) != 5) {
            System.out.println("Nope sorry");
        }

    }

    public static int vowelCounter1(HaikuPoem poem) {
        int vowelcount = 0;

        for (int i = 0; i < poem.getFirstLine().length(); i++) {

            char vowels = poem.getFirstLine().charAt(i);
            if (vowels == 'a'|| vowels == 'e'|| vowels == 'i' || vowels == 'o'|| vowels == 'u'){
                vowelcount++;
            }

        }
        System.out.println("numbers of vowels in the first sentence is = " + vowelcount);
        return vowelcount;
    }

    public static int vowelCounter2(HaikuPoem poem) {
        int vowelcount = 0;

        for (int i = 0; i < poem.getSecondLine().length(); i++) {

            char vowels = poem.getSecondLine().charAt(i);
            if (vowels == 'a'|| vowels == 'e'|| vowels == 'i' || vowels == 'o'|| vowels == 'u'){
                vowelcount++;
            }

        }
        System.out.println("numbers of vowels in the second sentence is = " + vowelcount);
        return vowelcount;
    }

    public static int vowelCounter3(HaikuPoem poem) {
        int vowelcount = 0;

        for (int i = 0; i < poem.getThirdLine().length(); i++) {

            char vowels = poem.getThirdLine().charAt(i);
            if (vowels == 'a'|| vowels == 'e'|| vowels == 'i' || vowels == 'o'|| vowels == 'u'){
                vowelcount++;
            }

        }
        System.out.println("numbers of vowels in the third sentence is = " + vowelcount);
        return vowelcount;
    }
}
