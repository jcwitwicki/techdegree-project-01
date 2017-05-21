import java.util.Random;

public class Jar {

    private String itemName;
    private int maxItems;
    private int randomNumber;

    public Jar(String itemName, int maxItems) {
        this.itemName = itemName;
        this.maxItems = maxItems;
        this.randomNumber = fillRandom(maxItems);
    }

    public int fillRandom(int maxItems) {
        Random random = new Random();
        return random.nextInt(maxItems)+1;
    }

    public String getItemName() { return itemName; }
    public int getMaxItems() { return maxItems; }
    public int getRandomNumber() {
        return randomNumber;
    }

}
