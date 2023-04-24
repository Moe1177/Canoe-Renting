import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Canots.initializeCanoes();
        String defaultName = "Anonymous";
        while (true) {
            System.out.println("Hello, welcome to ou AquaClub! Please choose one of the options below. \n" +
                    "(1) See all canoes \n" +
                    "(2) Rent a canoe \n" +
                    "(3) Rent a canoe anonymously \n" +
                    "(4) Bring back a canoe \n" +
                    "(5) See the number of available canoes \n" +
                    "(6) Exit program \n");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Canots.displayCanoes();
            } else if (choice == 2) {
                Canots.displayAvailableCanoes();
                Canots.rentCanoe();
                Canots.displayCanoes();
            } else if (choice == 3) {
                Canots.displayAvailableCanoes();
                Canots.rentCanoe(defaultName);
                Canots.displayCanoes();
            } else if (choice == 4) {
                Canots.displayUnavailableCanoes();
                Canots.bringBackCanoe();
                Canots.displayAvailableCanoes();
            } else if (choice == 5) {
                Canots.displayNumCanoes();
            } else if (choice == 6) {
                System.out.println("Have a nice day! Come back and visit us soon!");
                break;
            } else {
                System.out.println("Please choose one of the options.");
            }
            System.out.println("-------------------------------------------");
        }
        Canots.initializeCanoes();
    }
}