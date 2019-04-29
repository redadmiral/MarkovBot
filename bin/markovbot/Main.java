package markovbot;

import java.io.PrintStream;
import markovbot.MarkovChain;

public class Main {
    public static void main(String[] argsv) {
        String test = "Ich bin der Klausi. Ich bin Hansi. Hin bin der Klausi";
        String[] testArray = new String[100];
        for (String word : testArray = test.split(" ")) {
            System.out.println(word);
        }
        MarkovChain testChain = new MarkovChain(testArray);
        System.out.println(testChain);
    }
}
