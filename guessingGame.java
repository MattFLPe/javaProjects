import java.util.Scanner;

class GuessingGame {
    public static void Game() {
        int min = 1;
        int max = 100;

        int randomInt = (int)Math.floor(Math.random() *(max - min + 1) + min);
        Scanner scanner = new Scanner(System.in); 


        System.out.println("1 - Start the Game\n2 - Quit");
        int menu = scanner.nextInt();
        System.out.println("To play this game you need to guess a number between 1 and 100.\nIf you guess the number chosen by the machine, you win.\nYou have five trials.");
        switch (menu) {
        case 1: 
        int trials = 5;
        int i;
        for(i = 0; i < trials; i++){
        System.out.println("Choose your number:");
        int numPlayer = scanner.nextInt();

        if(numPlayer == randomInt) {
            System.out.println("That's it! You guessed right!");
            RetryGame();
        break;
        } else if (numPlayer > randomInt){
            System.out.println("That's too bad! Your guess is too high!");
        } else if (numPlayer < randomInt) {
            System.out.println("That's too bad! Your guess is too low!");
        };
    };
        if(i == trials){
            System.out.println("Game over! The number was" + " " + randomInt);
            RetryGame();
        };
        break;
        case 2:
        System.out.println("Thanks for playing!");
        break;
        default: 
        System.out.println("Invalid choice!");
        break;
    };
};

    public static void RetryGame(){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Play again? \n 1 - Yes\n 2 - No");
        int retry;
        retry = scanner.nextInt();
        if(retry == 1){
            Game();
        } else if (retry == 2) {
            System.out.println("Thanks for playing!");
        };
    }
public static void main(String[] args) {
    Game();
}; 
    };

