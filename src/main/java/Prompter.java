import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Prompter {

    Scanner sc = new Scanner(System.in);
    private BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));

    private String nameItem;
    private int maxItems;
    private int guess;

    public String promptNameItem() {
        System.out.println("What type of item do you want in the jar ?:  ");
        nameItem = sc.nextLine();
        return nameItem;
    }

    public int promptMaxItems() throws IOException {
        System.out.println("What is the maximum amount of " + nameItem + " allowed in the jar:  ");
        boolean loop = true;
        while (loop) {
            try {
                maxItems = Integer.parseInt(mReader.readLine().trim());
                loop = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please try again:  ");
            }
        }
        return maxItems;
    }

    public int gameOn(String nameItem, int maxItems)throws IOException {
        System.out.print("Your goal is to guess how many " + nameItem + " are in the jar. Pick a number between 1 and " + maxItems + ". ");
        System.out.println("Please enter your guess:  ");
        boolean loop = true;
        while (loop) {
            try {
                guess = Integer.parseInt(mReader.readLine().trim());
                loop = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please try again:  ");
            }
        }
        return guess;
    }

    public int tryAgain() throws Exception {
        System.out.println("Please try again:  ");
        boolean loop = true;
        while (loop) {
            try {
                guess = Integer.parseInt(mReader.readLine().trim());
                loop = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please try again:  ");
            }
        }
        return guess;
    }

    public void overMax(int maxItems) {
        System.out.println("Your guess must be less than " + maxItems + ".");
    }

    public void tooHigh() {
        System.out.println("Your guess is too high.");
    }

    public void tooLow() {
        System.out.println("Your guess is too low.");
    }

    public void result(int guessCount) {
        System.out.println("Yes! You got it in " + guessCount  + " attempt(s)!");
    }
}
