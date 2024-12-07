
import java.util.concurrent.ThreadLocalRandom;

public class A02_Dice {

    int diceCount;
    int min = 1;
    int max = 6;

    public A02_Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){

        int totalSum=0;
        int diceUsed=0;

        // Random random = new Random();
        while(diceUsed<diceCount){
           // totalSum += random.nextInt(min,max+1);
            totalSum += ThreadLocalRandom.current().nextInt(min,max+1); //This is threadsafe
            diceUsed++;
        }

        return totalSum;
    }
}
