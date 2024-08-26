package Searching;

class GuessGame {
    private int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    public int guess(int num) {
        if (num == pick) {
            return 0;
        } else if (num < pick) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class GuessNumber extends GuessGame {
    public GuessNumber(int pick) {
        super(pick);
    }

    public static int guessNumber(int n, GuessNumber game) {

        if (game.guess(1) == -1) {
            System.out.println("Error: The guessed number is lower than the limit.");
            return -1;
        }
        if (game.guess(n) == 1) {
            System.out.println("Error: The guessed number is higher than the limit.");
            return -1;
        }

        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int result = game.guess(mid);
            if (result == 0) {
                return mid;
            } else if (result == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int n = 10;
        int pick = -34;
        GuessNumber game = new GuessNumber(pick);
        int result = guessNumber(n, game);
        if (result != -1) {
            System.out.println("The guessed number is: " + result);
        }
    }
}
