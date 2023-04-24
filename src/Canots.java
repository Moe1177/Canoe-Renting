import java.util.Arrays;
import java.util.Scanner;

public class Canots {

    public boolean status;
    public String name;
    public static Canots[] canoeList = new Canots[12];
    public Canots(boolean status, String name) {
        this.status = status;
        this.name = name;
    }
    public static void initializeCanoes() {
        canoeList[0] = new Canots(true, "Dumbledore");
        canoeList[1] = new Canots(false, "null");
        canoeList[2] = new Canots(false, "null");
        canoeList[3] = new Canots(true, "Harry Potter");
        canoeList[4] = new Canots(true, "Voldemort");
        canoeList[5] = new Canots(false, "null");
        canoeList[6] = new Canots(true, "Sirius Black");
        canoeList[7] = new Canots(false, "null");
        canoeList[8] = new Canots(true, "Cristiano Ronaldo");
        canoeList[9] = new Canots(true, "Mufti Menk");
        canoeList[10] = new Canots(false, "null");
        canoeList[11] = new Canots(false, "null");
    }
    public static void displayCanoes() {
        for (int i = 0; i < canoeList.length; i++) {
           if (canoeList[i].status) {
               System.out.println("Canots " + i + " rented by: " + canoeList[i].name);
           } else {
               System.out.println("Canots " + i + " rented by: " + "no one.");
           }
        }
    }

    public static void rentCanoe() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name.");
        String name = scanner.nextLine();

        System.out.println("Thank you for deciding to rent a canoe! Please choose of our available canoes.");
        int choice = scanner.nextInt();

        System.out.println("Thank you " + name + " for choosing canoe number " + choice);
        if (true) {
            canoeList[choice].status = true;
            canoeList[choice].name = name;
        }
    }
    public static void rentCanoe(String name1) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Thank you for deciding to rent a canoe! Please choose of our available canoes.");
        int choice = scanner.nextInt();

        System.out.println("Thank you for choosing canoe number " + choice);
        if (true) {
            canoeList[choice].status = true;
            canoeList[choice].name = name1;
        }
    }
    public static void displayAvailableCanoes() {
        for (int i = 0; i < canoeList.length; i++) {
            if (!canoeList[i].status) {
                System.out.println("Canots " + i);
            }

        }
    }
    public static void displayNumCanoes() {
        int counter = 0;
        for (int i = 0; i < canoeList.length; i++) {
            if (!canoeList[i].status) {
                counter++;
            }
        }
        System.out.println("We have " + counter + " canoes available!");
    }

    public static void displayUnavailableCanoes() {
        for (int i = 0; i < canoeList.length; i++) {
            if (canoeList[i].status) {
                System.out.println("Canots " + i);
            }

        }
    }
    public static void bringBackCanoe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which canoe would you like to bring back?");
        int choice = scanner.nextInt();
        System.out.println("I hope you enjoyed using canoe " + choice);
        if (true) {
            canoeList[choice].status = false;
        }
    }
}
