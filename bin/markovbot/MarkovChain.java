package markovbot;

import java.io.PrintStream;
import java.util.Hashtable;

public class MarkovChain {
    Hashtable<String, Hashtable<String, Integer>> words = new Hashtable();

    public MarkovChain(String[] inputText) {
        for (int i = 0; i < inputText.length; ++i) {
            if (this.words.containsKey(inputText[i])) {
                System.out.println("Chain contains word " + inputText[i]);
                if (this.words.get(inputText[i]).containsKey(inputText[i + 1])) {
                    System.out.println("Subtable contains word " + inputText[i + 1]);
                    this.words.get(inputText[i]).put(inputText[i + 1], this.words.get(inputText[i]).get(inputText[i + 1]) + 1);
                    continue;
                }
                System.out.println("Subtable doesnt contain word " + inputText[i + 1]);
                this.words.get(inputText[i]).put(inputText[i + 1], 1);
                continue;
            }
            System.out.println("Chain doesn't contain word " + inputText[i]);
            if (i == inputText.length - 1) break;
            Hashtable<String, Integer> nextWord = new Hashtable<String, Integer>();
            nextWord.put(inputText[i + 1], 1);
            this.words.put(inputText[i], nextWord);
        }
    }

    public String toString() {
        return this.words + " ";
    }
}
