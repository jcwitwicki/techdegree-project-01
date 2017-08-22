public class GuessingGame {

    public static void main(String[] args) throws Exception {

        Prompter prompter = new Prompter();
        String nameItem = prompter.promptNameItem();
        int maxItems = prompter.promptMaxItems();
        Jar jar = new Jar(nameItem, maxItems);

        int guessCount = 1;
        int guess = prompter.gameOn(jar.getItemName(), jar.getMaxItems());

        while (guess != jar.getRandomNumber()) {

            while (guess > jar.getMaxItems()) {
                prompter.overMax(jar.getMaxItems());
                guess = prompter.tryAgain();
            }

            if (guess > jar.getRandomNumber()) {
                prompter.tooHigh();
                guess = prompter.tryAgain();
            } else if (guess < jar.getRandomNumber()) {
                prompter.tooLow();
                guess = prompter.tryAgain();
            }
            guessCount++;
        }
        prompter.result(guessCount);
    }
}
