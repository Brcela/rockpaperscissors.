import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        //Rock(1) - Paper(2) - Scissors(3)
        int computerChoice;
        int userChoice;
        int numberOfComputerWin=0;
        int numberOfUserWin=0;
        Scanner scan = new Scanner(System.in);
        do {
            if (numberOfComputerWin == 5 || numberOfUserWin == 5) {
                break;
            }
            computerChoice = (int) (Math.random() * 3 + 1);
            System.out.print("Enter your choice = ");
            userChoice = scan.nextInt();
            if (userChoice>3|| userChoice<1){
                System.out.println("You entered wrong value. You must enter one of the 1, 2, 3 values. ");
                continue;
            }
            System.out.print(" Computer choice  = " + computerChoice);
            System.out.print("  User choice = " + userChoice);
            if (userChoice==1) {
                System.out.print(" -You choose Rock- ");
            }
            if (userChoice==2) {
                System.out.print(" -You choose Paper- ");
            }
            if (userChoice==3) {
                System.out.print(" -You choose Scissors- ");
            }
            if (computerChoice==1){
                System.out.print(" -Computer choose Rock- ");
            }
            if (computerChoice==2){
                System.out.print(" -Computer choose Paper- ");
            }
                if (computerChoice == 3){
                    System.out.print(" -Computer choose Scissors- ");
                }
            if (userChoice != 0) {
                 if (computerChoice == userChoice) {
                    System.out.println("  / DEUCE /  ");
                } else if ((computerChoice == 1 && userChoice == 3) || (computerChoice == 2 && userChoice == 1) || (computerChoice == 3 && userChoice == 2)) {
                    numberOfComputerWin++;
                    System.out.print(" / You Lost .  Computer Won / ");
                    System.out.println(" Score ===>  Computer = " + numberOfComputerWin + "  -  User = " + numberOfUserWin);
                } else {

                    numberOfUserWin++;
                    System.out.print(" / You win / ");
                    System.out.println("Score ===>  Computer = " + numberOfComputerWin + "  -  User = " + numberOfUserWin);
                }
            }
        }
        while (userChoice !=0);
    }
}
