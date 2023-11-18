import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;

        int randomInt = (int)Math.floor(Math.random() *(max - min + 1) + min);
        Scanner scanner = new Scanner(System.in); 


        System.out.println("1 - Start the Game/n 2 - Instructions/n 3 - Quit");
        int menu = scanner.nextInt();
        switch (menu) {
        case 1: 
        System.out.println("Choose a number from 0 to 100:");
        int numPlayer = scanner.nextInt();

        if(numPlayer > randomInt) {
        System.out.println("That's too bad! The number you choose is too high!");
        RetryGame();
        } else if (numPlayer < randomInt){
        System.out.println("That's too bad! The number you choose is too low!");
        RetryGame();
        } else if (numPlayer == randomInt) {
        System.out.println("That's great! The number you choose is the same as the machine!");
        RetryGame();
        };
        break;
        case 2:
        System.out.println("To play this game you need to choose a number between 0 and 100. /n If your number is equal to the number chosen by the machine, you win.");
        break;
        case 3:
        System.out.println("Thanks for playing!");
        break;

        default: 
        System.out.println("Invalid choice!");
        break;
    };
};
        static void RetryGame() {
            Scanner scanner = new Scanner(System.in); 
            System.out.println("Play again? Y/N");
            String retryGame = scanner.nextLine();
            if(retryGame.toUpperCase() == "y"){
                main(null);
        } else if (retryGame.toUpperCase() == "n"){
            System.out.println("Thanks for playing!");
        };
    };
};


