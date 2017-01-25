package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player1 = new Player("Taro", new WinningStrategy(314));
        Player player2 = new Player("Hana", new ProbStrategy(315));

        for (int i = 0; i < 1000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even....");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
