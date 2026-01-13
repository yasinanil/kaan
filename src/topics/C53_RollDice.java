package topics;

public class C53_RollDice {
    /*
    •Write a method called rollDice() that simulates rolling a 6-sided dice. The method should return a random integer between 1 and 6 (inclusive).
    •Then, write a second method called rollTwoDice() that rolls two dice using rollDice(), prints both rolls, and returns the sum of the two dice.
    •Use the Math class where needed.
     */
    public static void main(String[] args) {

        //System.out.println(rollDice());
        System.out.println(rollTwoDice());

    }

    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static int rollTwoDice() {
        int dice1 = rollDice();
        System.out.println("dice1 = " + dice1);
        int dice2 = rollDice();
        System.out.println("dice2 = " + dice2);
        return dice1 + dice2;
    }

}
